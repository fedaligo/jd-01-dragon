package by.htp.dragon.command;

/**	Интерфейс команда с методом execute
@author Игорь Федоненков
@version 1.0
*/
public interface Command {
	
	/**Метод выполнения команды
	@return возвращает строку значений, являющуюся результатом выполнения конкретной команды
	*/
	String execute() throws Exception;

}
