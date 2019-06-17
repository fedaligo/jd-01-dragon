package by.htp.dragon.dao;

/**	Интерфейс пещера с методами fileRead и fileSave
@author Игорь Федоненков
@version 1.0
*/
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import by.htp.dragon.entity.Treasure;

public interface CaveDAO {
	
	/**Метод чтения данных из файла
	@param fileName - путь к файлу в котором хранятся данные
	@return возвращает коллекцию данных из файла
	*/
	List<Treasure> fileRead(String fileName) throws  Exception;
	
	/**Метод сохранения данных в файл
	@param fileName - путь к файлу в который нужно сохранить данные
	@return возвращает логическое значение подтверждающее факт записи данных в файл
	*/
	boolean fileSave(String fileName) throws IOException, Exception;

}
