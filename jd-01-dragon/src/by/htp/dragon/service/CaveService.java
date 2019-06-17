package by.htp.dragon.service;

import java.util.List;

import by.htp.dragon.entity.Treasure;

/**	Интерфейс логики пещеры с методами displayCave, treasureByPrice и mostExpensive
@author Игорь Федоненков
@version 1.0
*/
public interface CaveService {

	/**Метод подготовки, считанных данных из файла, к отображению
	@param fileName - путь к файлу в котором хранятся данные
	@return возвращает коллекцию всех данных из файла
	*/
	public List<Treasure> displayCave (String fileName) throws Exception;
	
	/**Метод поиска, среди считанных данных из файла, по величине имеющихся средств для покупки 
	 * и подготовка отобранных данных к отображению 
	@param fileName - путь к файлу в котором хранятся данные
	@param price - величина имеющихся средств за которые возможно приобрести драгоценности
	@return возвращает коллекцию из отобранных данных из файла
	*/
	public List<Treasure> treasureByPrice (String fileName, int price) throws Exception;
	
	/**Метод поиска, среди считанных данных из файла, драгоценности с максимальной ценой 
	 * и подготовка отобранных данных к отображению 
	@param fileName - путь к файлу в котором хранятся данные
	@return возвращает коллекцию из отобранных данных из файла
	*/
	public List<Treasure> mostExpensive (String fileName) throws Exception;

}
