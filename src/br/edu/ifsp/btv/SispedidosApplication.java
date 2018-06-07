package br.edu.ifsp.btv;

import java.util.List;
import java.util.ArrayList;

import br.edu.ifsp.btv.Controllers.Customer;
import br.edu.ifsp.btv.Controllers.Item;
import br.edu.ifsp.btv.Controllers.Order;
import br.edu.ifsp.btv.Controllers.OrderDetail;
import br.edu.ifsp.btv.Controllers.Payment;

public class SispedidosApplication {
	
	private static SispedidosApplication instance;
	
	private Customer customer;
	
	private List<Item> chartItems = new ArrayList<Item>();	
	
	private Order currentOrder;
	
	private Payment paymentMethod;
	
	private OrderDetail currentOrderDetails;
	
	private SispedidosApplication() {
		
	}
	
	public static synchronized SispedidosApplication getInstance() {
		if(instance == null) {
			instance = new SispedidosApplication();
		}
		return instance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Item> getChartItems() {
		return chartItems;
	}

	public void setChartItems(List<Item> chartItems) {
		this.chartItems = chartItems;
	}

	public Order getCurrentOrder() {
		return currentOrder;
	}

	public void setCurrentOrder(Order currentOrder) {
		this.currentOrder = currentOrder;
	}

	public Payment getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(Payment paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public OrderDetail getCurrentOrderDetails() {
		return currentOrderDetails;
	}

	public void setCurrentOrderDetails(OrderDetail currentOrderDetails) {
		this.currentOrderDetails = currentOrderDetails;
	}

}
