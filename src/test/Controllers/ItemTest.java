package Controllers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import main.br.edu.ifsp.btv.Controllers.Item;

public class ItemTest {
	
	@Test
	public void getPriceForQuantityTest(){
		Item item = new Item();
		float price = 2;
		float shippingWeight = 3;
		assertEquals(6.0, item.getPriceForQuantity(price, shippingWeight), 1e-15);
	}
}
