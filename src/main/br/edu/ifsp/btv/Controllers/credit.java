/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapazzinatto;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;


/**
 *
 * @author gustavo
 */
public class credit {
    private double number;
    private String type;
    private Date expDate;
    Date currentDate = new Date(System.currentTimeMillis());  
    
    SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-MM-dd"); 
    String dataFormatada = formatarDate.format(currentDate);

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
    
    public boolean authorizad(String data) throws ParseException{
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd"); 
        expDate = formatDate.parse(data);

       
        if(currentDate.before(expDate))
        {
            System.out.println(currentDate);
            System.out.println("antes");
            System.out.println(expDate);
            return true;
        }
        else
            {
                System.out.println(currentDate);
                System.out.println("depois");
                System.out.println(expDate);
                return false;
            }
        
    }
    
}
