package by.htp.dragon.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.dragon.entity.Treasure;

/**	Класс: команды провайдера с объектами dcc, mec, tbpc и хэшмэпом commands
@author Игорь Федоненков
@version 1.0
*/
public class CommandProvider {
	
	/**Список команд
	 * */
	private Map<String,Command> commands = new HashMap<String,Command>();
	
	/**Объект: логика пещеры отображение содержимого пещеры
	 * */
	DisplayCaveCommand dcc = new DisplayCaveCommand();
	
	/**Объект: логика пещеры поиск самого дорогого сокровища
	 * */
	MostExpensiveComand mec = new MostExpensiveComand();
	
	/**Объект: логика пещеры поиск по заданной общей стоимости
	 * */
	TreasureByPriceComand tbpc = new TreasureByPriceComand();
	
	/**Конструктор - добавление набора данных в список команд
	@see CommandProvider#CommandProvider()
	*/
	public CommandProvider(){
		commands.put("aaa", dcc);
		commands.put("bbb", mec);
		commands.put("ccc", tbpc);
	
	}
	
	/**Функция получения значения поля {@link CommandProvider#command}
	@return значение элемента хэшмэп соответствующее ключу команды
	*/
	public Command getCommand(String commandName){
		Command command;
		command = commands.get(commandName);
		
		return command;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commands == null) ? 0 : commands.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommandProvider other = (CommandProvider) obj;
		if (commands == null) {
			if (other.commands != null)
				return false;
		} else if (!commands.equals(other.commands))
			return false;
		return true;
	}

}
