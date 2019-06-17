package by.htp.dragon.command;

import java.util.ArrayList;
import java.util.List;

import by.htp.dragon.entity.Treasure;
import by.htp.dragon.service.CaveService;
import by.htp.dragon.service.ServiceProvider;

/**	Класс: команда поиска украшений среди содержимого пещеры по заданной общей стоимости с методом execute
@author Игорь Федоненков
@version 1.0
*/
public class TreasureByPriceComand implements Command {

	/**Переопределение Метода выполнения команды
	@return возвращает строку всех значений сокровищ, стоимость которых суммарно не превышает установленный лимит
	*/
	@Override
	public String execute() throws Exception {
		String fileName = "source/1.txt";
		String responce = null;
		int price = 1000;
		ServiceProvider provider = ServiceProvider.getInstanse();
		CaveService caveService = provider.getCaveService();
		
		List<Treasure> tr = new ArrayList<Treasure>();
		tr = caveService.treasureByPrice(fileName, price);
		for(int i=0;i<tr.size();i++){
			if(responce!=null) {
				responce = responce + tr.get(i).getNameOfTreasure() + " - " + tr.get(i).getPrice() + "\n";
			} else {
				responce = "за "+price+" можно купить следующее:\n"+tr.get(i).getNameOfTreasure() + " - " + tr.get(i).getPrice() + "\n";
			}
		}
				
		return responce;
	}

}
