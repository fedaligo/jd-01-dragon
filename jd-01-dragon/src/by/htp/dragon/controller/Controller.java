package by.htp.dragon.controller;

import by.htp.dragon.command.Command;
import by.htp.dragon.command.CommandProvider;
import by.htp.dragon.command.MostExpensiveComand;

/**	Класс: контроллер с объектом provider и методом doAction
@author Игорь Федоненков
@version 1.0
*/
public class Controller {
	
	/**Объект: провайдер команд
	 * */
	private CommandProvider provider = new CommandProvider();
	
	/**Метод выполнения команды
	@param request - ключ к выполнению команды
	@return возвращает строку данных, являющаяся результатом выполнения команды
	*/
	public String doAction(String request) throws Exception{
		
		String response = null;
				
		Command command = provider.getCommand(request);
		
		response = command.execute();
			
		return response;
	}
	

}
