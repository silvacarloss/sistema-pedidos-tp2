package br.edu.ifsp.btv.Views;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.edu.ifsp.btv.SispedidosApplication;
import br.edu.ifsp.btv.Controllers.Customer;
import br.edu.ifsp.btv.Controllers.Item;
import br.edu.ifsp.btv.Controllers.Order;
import br.edu.ifsp.btv.Controllers.Payment;

public class Utils {
	static List<Item> listItem = new ArrayList<Item>();
	
	public static List<Item> generateListItems(){
		Item item1 = new Item();
		item1.setPrice(50);
		item1.setDescription("Aparador de pelos");
		item1.setShippingWeight(100);
		
		Item item2 = new Item();
		item2.setPrice(30);
		item2.setDescription("Tupperware");
		item2.setShippingWeight(200);
		
		Item item3 = new Item();
		item3.setPrice(20);
		item3.setDescription("Meias pretas");
		item3.setShippingWeight(50);
		
		Item item4 = new Item();
		item4.setPrice(80);
		item4.setDescription("Aquecedor de orelhas");
		item4.setShippingWeight(80);
		
		Item item5 = new Item();
		item5.setPrice(50);
		item5.setDescription("Caneca automática");
		item5.setShippingWeight(200);
		
		Item item6 = new Item();
		item6.setPrice(30);
		item6.setDescription("Carteira");
		item6.setShippingWeight(50);
		
		listItem.add(item1);
		listItem.add(item2);
		listItem.add(item3);
		listItem.add(item4);
		listItem.add(item5);
		listItem.add(item6);

		return listItem;		
	}
	
	public static void generateOrder(Date orderDate, 
									String status,	
									List<Item> items, 
									Customer customer, 
									Payment paymentMethod) {
		Order currentOrder = new Order();
		currentOrder.setOrderDate(orderDate);
		currentOrder.setStatus(status);
		currentOrder.setItems(items);
		currentOrder.setCustomer(customer);
		currentOrder.setPaymentMethod(paymentMethod);
		
		SispedidosApplication.getInstance().setCurrentOrder(currentOrder);
		
	}
	
	public static void savePaymentMethod(Payment paymentMethod) {
		SispedidosApplication.getInstance().setPaymentMethod(paymentMethod);
	}
}
