package br.edu.ifsp.btv;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.btv.Controllers.Item;
import br.edu.ifsp.btv.Views.IdentificationView;
import br.edu.ifsp.btv.Views.Utils;

public class Main {

    public static void main(String[] args) {
    	List<Item> chartItems = new ArrayList<Item>();
    	chartItems = Utils.generateListItems();
    	SispedidosApplication.getInstance().setChartItems(chartItems);
    	
        IdentificationView identification = new IdentificationView();
        identification.show();
    }
}
