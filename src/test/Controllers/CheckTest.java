package Controllers;

import org.junit.Test;
import main.br.edu.ifsp.btv.Controllers.Check;
import static org.junit.Assert.assertEquals;

public class CheckTest {
	
	@Test
	public void authorizedTest(){
		Check check = new Check();
		int id = 1;
		String name = "Julia";
		assertEquals(true, check.authorized(name, id));
	}
}
