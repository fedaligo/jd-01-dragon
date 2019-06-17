package by.htp.dragon.command;

import java.util.ArrayList;
import java.util.List;

import by.htp.dragon.entity.Treasure;
import by.htp.dragon.service.CaveService;
import by.htp.dragon.service.ServiceProvider;

/**	Класс: команда поиска самого дорого украшения среди содержимого пещеры с методом execute
@author Игорь Федоненков
@version 1.0
*/
public class MostExpensiveComand implements Command{

	/**Переопределение Метода выполнения команды
	@return возвращает строку значений о самом дорогом украшении в пещере
	*/
	@Override
	public String execute() throws Exception {
		String fileName = "source/1.txt";
		String responce = null;
		ServiceProvider provider = ServiceProvider.getInstanse();
		CaveService caveService = provider.getCaveService();
		
		//List<Treasure> tr = new ArrayList<Treasure>();
		//tr = caveService.displayCave(fileName);
		List<Treasure> mostExpensive = caveService.mostExpensive(fileName);
		responce = "самое дорогое украшение: "+mostExpensive.get(0).getNameOfTreasure()+" - "+mostExpensive.get(0).getPrice();
		
		
		return responce;
	}

}
