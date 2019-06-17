package by.htp.dragon.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.htp.dragon.entity.Treasure;

/**	Класс пещера с переопределнными методами fileRead и fileSave
@author Игорь Федоненков
@version 1.0
*/
public class FileCaveDAO implements CaveDAO{
	
	/**Переопределение Метода чтения данных из файла
	@param fileName - путь к файлу в котором хранятся данные
	@return возвращает коллекцию данных из файла
	*/
	@Override
	public List<Treasure> fileRead(String fileName) throws  Exception {
		List<Treasure> tr=new ArrayList<Treasure>();
		
		String line = null;
		
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferReader = new BufferedReader(fileReader);
				
		while((line=bufferReader.readLine())!=null) {
			String[] mass = line.split(" - ");
			tr.add(new Treasure(mass[0],Integer.parseInt(mass[1])));
		}
		bufferReader.close();
		return tr;
	}
	
	/**Переопределение Метода сохранения данных в файл
	@param fileName - путь к файлу в который нужно сохранить данные
	@return возвращает логическое значение подтверждающее факт записи данных в файл
	*/
	@Override
	public boolean fileSave(String fileName) throws  Exception {
		List<Treasure> tr=new ArrayList<Treasure>();
		
		FileWriter fileWriter = new FileWriter(fileName);
		BufferedWriter bufferWriter1 = new BufferedWriter(fileWriter);
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите наименование драгоценности");
		String sNa=sc.next();
		System.out.println("Введите стоимость драгоценности");
		int iPr=sc.nextInt();
		tr.add(new Treasure(sNa,iPr));
		
		String line1 = null;
				
		for(int i=0;i<tr.size();i++){
			line1 = tr.get(i).getNameOfTreasure()+" - "+tr.get(i).getPrice();
			
			bufferWriter1.append(line1);
			System.out.println(line1);
			bufferWriter1.newLine();
		}
		bufferWriter1.close();
		return true;
	}

	
	

}
