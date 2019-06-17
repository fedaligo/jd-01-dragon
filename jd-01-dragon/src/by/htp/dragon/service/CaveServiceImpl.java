package by.htp.dragon.service;

import java.util.ArrayList;
import java.util.List;

import by.htp.dragon.dao.DAOProvider;
import by.htp.dragon.entity.Treasure;

/**	Класс логики пещеры с переопределенными методами displayCave, treasureByPrice и mostExpensive
@author Игорь Федоненков
@version 1.0
*/
public class CaveServiceImpl implements CaveService{

	/**Переопределение Метода подготовки, считанных данных из файла, к отображению
	@param fileName - путь к файлу в котором хранятся данные
	@return возвращает коллекцию всех данных из файла
	*/
	@Override
	public List<Treasure> displayCave(String fileName) throws Exception {
		DAOProvider provider = DAOProvider.getInstanse();
		
		List<Treasure> tr = new ArrayList<Treasure>();
		for(int i=0;i<provider.getCaveDAO().fileRead(fileName).size();i++){
			tr.add(provider.getCaveDAO().fileRead(fileName).get(i));
		}
		
		List<Treasure> displayCave = new ArrayList<Treasure>();
		for(int i=0;i<tr.size();i++){
			displayCave.add(new Treasure(tr.get(i).getNameOfTreasure(), tr.get(i).getPrice()));
		}
		return displayCave;
	}

	/**Переопределение Метода поиска, среди считанных данных из файла, по величине имеющихся средств для покупки 
	 * и подготовка отобранных данных к отображению 
	@param fileName - путь к файлу в котором хранятся данные
	@param price - величина имеющихся средств за которые возможно приобрести драгоценности
	@return возвращает коллекцию из отобранных данных из файла
	*/
	@Override
	public List<Treasure> treasureByPrice(String fileName, int price) throws Exception {
DAOProvider provider = DAOProvider.getInstanse();
		
		List<Treasure> tr = new ArrayList<Treasure>();
		for(int i=0;i<provider.getCaveDAO().fileRead(fileName).size();i++){
			tr.add(provider.getCaveDAO().fileRead(fileName).get(i));
		}
		
		List<Treasure> treasureByPrice = new ArrayList<Treasure>();
		for(int i=0;i<tr.size();i++){
			 if(tr.get(i).getPrice() <= price){
				 treasureByPrice.add(new Treasure(tr.get(i).getNameOfTreasure(), tr.get(i).getPrice()));
				 price = price - tr.get(i).getPrice();
			 }
		}
		return treasureByPrice;
	}

	/**Переопределение Метода поиска, среди считанных данных из файла, драгоценности с максимальной ценой 
	 * и подготовка отобранных данных к отображению 
	@param fileName - путь к файлу в котором хранятся данные
	@return возвращает коллекцию из отобранных данных из файла
	*/
	@Override
	public List<Treasure> mostExpensive(String fileName) throws Exception {
		DAOProvider provider = DAOProvider.getInstanse();
		
		List<Treasure> tr = new ArrayList<Treasure>();
		for(int i=0;i<provider.getCaveDAO().fileRead(fileName).size();i++){
			tr.add(provider.getCaveDAO().fileRead(fileName).get(i));
		}
		
		List<Treasure> mostExpensive = new ArrayList<Treasure>();
		mostExpensive.add(new Treasure(tr.get(0).getNameOfTreasure(), tr.get(0).getPrice()));
		int x=tr.get(0).getPrice();
		for(int i=1;i<tr.size();i++){
			 if(x <= tr.get(i).getPrice()){
				 mostExpensive.set(0, new Treasure(tr.get(i).getNameOfTreasure(), tr.get(i).getPrice()));
				 x=tr.get(i).getPrice();
			 }
		}
		return mostExpensive;
	}

	
}
