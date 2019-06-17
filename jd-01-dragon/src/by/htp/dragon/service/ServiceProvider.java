package by.htp.dragon.service;

import by.htp.dragon.dao.DAOProvider;

/**	Класс: логика провайдера с объектом caveService и синглтоном instanse
@author Игорь Федоненков
@version 1.0
*/
public class ServiceProvider {
	
	/**Синглтон: логика провайдера
	 * */
	private static final ServiceProvider instanse = new ServiceProvider();
	
	/**Объект: логика пещеры
	 * */
	private CaveService caveService = new CaveServiceImpl();
		
	/**Функция получения значения поля {@link ServiceProvider#caveService}
	@return возвращает ссылку на класс CaveService
	*/
	public CaveService getCaveService() {
		return caveService;
	}
	
	/**Функция получения значения поля {@link ServiceProvider#instanse}
	@return возвращает ссылку instanse на единственную глобальную точку доступа к классу ServiceProvider
	*/
	public static ServiceProvider getInstanse() {
		return instanse;
	}
	
	

}
