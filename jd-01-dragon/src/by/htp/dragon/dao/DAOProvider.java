package by.htp.dragon.dao;

import by.htp.dragon.entity.Treasure;

/**	Класс провайдер с объектом caveDAO и синглтоном instanse
@author Игорь Федоненков
@version 1.0
*/
public class DAOProvider {
	
	/**Синглтон провайдер
	 * */
	private static final DAOProvider instanse = new DAOProvider();
	
	/**Объект пещера
	 * */
	private CaveDAO caveDAO = new FileCaveDAO();
	
	/**Функция получения значения поля {@link DAOProvider#instanse}
	@return возвращает ссылку instanse на единственную глобальную точку доступа к классу DAOProvider
	*/
	public static DAOProvider getInstanse(){
		return instanse;
	}
	
	/**Функция получения значения поля {@link DAOProvider#caveDAO}
	@return возвращает ссылку на класс CaveDAO
	*/
	public CaveDAO getCaveDAO() {
		return caveDAO;
	}
	

}
