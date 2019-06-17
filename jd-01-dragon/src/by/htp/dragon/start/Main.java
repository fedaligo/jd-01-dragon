package by.htp.dragon.start;

import by.htp.dragon.controller.Controller;
import by.htp.dragon.view.View;

/**	Класс: главный
@author Игорь Федоненков
@version 1.0
*/
public class Main {

	/**Метод: точка входа в программу
	@param args - массив строк
	*/
	public static void main(String[] args) throws Exception{
		
		/**Объект: контроллер
		 * */
		Controller controller = new Controller();
		
		/**Объект: отображение
		 * */
		View view = new View();
		
		/**Запуск контроллера выполнения команды
		 * */
		view.setController(controller);
		
		/**Отображение результата работы контроллера
		 * */
		view.show();
		
		
	}

}
