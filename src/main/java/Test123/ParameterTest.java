package Test123;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;  
public class ParameterTest {

	@Test
	@Parameters({"ab","bc"})
	public void sub(int ab, int bc) {
		int sub;
		sub = ab-bc;
	   System.out.println(sub);
	}

}
