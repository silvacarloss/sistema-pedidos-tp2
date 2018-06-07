package br.edu.ifsp.btv;

import br.edu.ifsp.btv.Controllers.Customer;

public class SispedidosApplication {
	
	private static SispedidosApplication instance;
	
	private Customer customer;
	
	
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

}
