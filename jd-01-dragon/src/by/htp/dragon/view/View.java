package by.htp.dragon.view;

import java.util.Scanner;

import by.htp.dragon.controller.Controller;
import by.htp.dragon.entity.Treasure;

/**	Класс отображение с объектом controller и методами setController, askInfo и show
@author Игорь Федоненков
@version 1.0
*/
public class View {
	
	/**Объект: контроллер
	 * */
	private Controller controller;
	
	/**Процедура определения контроллера {@link View#controller}
	@param controller - ссылка на методы класса Сontroller
	*/
	public void setController(Controller controller){
		this.controller = controller;
	}
	
	/**Метод запроса ключевого слова команды для выполнения
	@return строку с ключом команды
	*/
	public String askInfo(){
		System.out.println("Введите команду которую необходимо выполнить");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		return s;
	} 
	
	/**Метод отображения результата выполнения команды
	*/
	public void show() throws Exception {
		String req;
				
		req=askInfo();
		System.out.println(controller.doAction(req));
		controller.doAction(req);
			
	}

}
