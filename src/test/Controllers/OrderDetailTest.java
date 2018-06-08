package test.Controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.edu.ifsp.btv.Controllers.Item;
import br.edu.ifsp.btv.Controllers.Order;
import br.edu.ifsp.btv.Controllers.OrderDetail;

public class OrderDetailTest {
	@Test
	public void calculateTotalWeightValidTest(){
		List<Item> items = new ArrayList<>();
		Item mockItem1 = new Item();		
		Item mockItem2 = new Item();
		OrderDetail order = new OrderDetail();
		
		mockItem1.setShippingWeight(20);
		mockItem2.setShippingWeight(20);	
		
		items.add(mockItem1);
		items.add(mockItem2);		
		
		order.setItems(items);		
		
		double totalWeight = 0.0;
		
		for(Item item : items) {
			totalWeight += item.getWeight();
		}
		assertEquals(totalWeight, order.calculateTotalWeight(), 1e-15);
	}
	
	@Test
	public void calculateTotalValidTest() {
		List<Item> items = new ArrayList<>();
		Item mockItem1 = new Item();		
		Item mockItem2 = new Item();
		OrderDetail order = new OrderDetail();
		
		mockItem1.setPrice(20);
		mockItem2.setPrice(20);	
		
		items.add(mockItem1);
		items.add(mockItem2);		
		
		order.setItems(items);		
		
		double totalPrice = 0.0;
		
		for(Item item : items) {
			totalPrice += item.getPrice();
		}
		totalPrice += order.calculateTax();
		assertEquals(totalPrice, order.calculateTotal(), 1e-15);
	}
}
