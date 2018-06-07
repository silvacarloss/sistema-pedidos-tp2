package br.edu.ifsp.btv.Views;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.btv.Controllers.Item;

public class Utils {
	static List<Item> listItem = new ArrayList<Item>();
	
	public static List<Item> generateListItems(){
		Item item1 = new Item();
		item1.setPrice(50);
		item1.setDescription("Aparador de pelos");
		
		Item item2 = new Item();
		item2.setPrice(30);
		item2.setDescription("Tupperware");
		
		Item item3 = new Item();
		item3.setPrice(20);
		item3.setDescription("Meias pretas");
		
		Item item4 = new Item();
		item4.setPrice(80);
		item4.setDescription("Aquecedor de orelhas");
		
		Item item5 = new Item();
		item5.setPrice(50);
		item5.setDescription("Caneca automática");
		
		Item item6 = new Item();
		item6.setPrice(30);
		item6.setDescription("Carteira");
		
		listItem.add(item1);
		listItem.add(item2);
		listItem.add(item3);
		listItem.add(item4);
		listItem.add(item5);
		listItem.add(item6);

		return listItem;		
	}
}
