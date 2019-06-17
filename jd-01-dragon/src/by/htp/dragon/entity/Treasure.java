package by.htp.dragon.entity;

/**	Класс драгоценности со свойствами nameOfTreasure и price
	@author Игорь Федоненков
	@version 1.0
*/
public class Treasure {
	
	/**Поле название драгоценности	
	 * */
	String nameOfTreasure;
	
	/**Поле цена драгоценности
	 * */
	int price;
	
	/**Конструктор - создание нового объекта
	@see Treasure#Treasure(String, int)
	*/
	public Treasure(String nameOfTreasure,int price){
		this.nameOfTreasure=nameOfTreasure;
		this.price=price;
	}
	
	/**Функция получения значения поля {@link Treasure#price}
	@return возвращает цену драгоценности
	*/
	public int getPrice() {
		return price;
	}
	
	/**Процедура определения цены драгоценности {@link Treasure#price}
	@param price - цена драгоценности
	*/
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**Функция получения значения поля {@link Treasure#nameOfTreasure}
	@return возвращает название драгоценности
	*/
	public String getNameOfTreasure() {
		return nameOfTreasure;
	}
	
	/**Процедура определения названия драгоценности {@link Treasure#nameOfTreasure}
	@param nameOfTreasure - название драгоценности
	*/
	public void setNameOfTreasure(String nameOfTreasure) {
		this.nameOfTreasure = nameOfTreasure;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nameOfTreasure == null) ? 0 : nameOfTreasure.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treasure other = (Treasure) obj;
		if (nameOfTreasure == null) {
			if (other.nameOfTreasure != null)
				return false;
		} else if (!nameOfTreasure.equals(other.nameOfTreasure))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Treasure [nameOfTreasure=" + nameOfTreasure + ", price="
				+ price + "]";
	}
	
	

}
