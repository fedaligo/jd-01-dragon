package by.htp.dragon.command;

import java.util.ArrayList;
import java.util.List;

import by.htp.dragon.entity.Treasure;
import by.htp.dragon.service.CaveService;
import by.htp.dragon.service.ServiceProvider;

/**	Класс: команда отображения содержимого пещеры с методом execute
@author Игорь Федоненков
@version 1.0
*/
public class DisplayCaveCommand implements Command{

	/**Переопределение Метода выполнения команды
	@return возвращает строку всех значений хранящихся в файле
	*/
	@Override
	public String execute() throws Exception {
		String fileName = "source/1.txt";
		String responce = null;
		ServiceProvider provider = ServiceProvider.getInstanse();
		CaveService caveService = provider.getCaveService();
		
		List<Treasure> tr = new ArrayList<Treasure>();
		tr = caveService.displayCave(fileName);
		for(int i=0;i<tr.size();i++){
			if(responce!=null) {
				responce = responce + tr.get(i).getNameOfTreasure() + " - " + tr.get(i).getPrice() + "\n";
			}else {
				responce = "в пещере содержится следующее:\n" + tr.get(i).getNameOfTreasure() + " - " + tr.get(i).getPrice() + "\n";
			}
		}
				
		return responce;
	}

}
