
import java.text.ParseException;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import provapazzinatto.credit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gusta
 */
public class creditTest{
    @Test
    public void authorizadTest() throws ParseException{
        credit credito = new credit();
        assertEquals(true,credito.authorizad("2018-05-22"));
    }    
}
