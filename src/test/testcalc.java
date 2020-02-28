package test;



import org.junit.Assert;
import org.junit.Test;

import main.calculator;

public class testcalc {

	@Test
	public void test() {
		int a=10;
		int b=10;
		calculator cc=new calculator();
		int resylt=cc.sum(a,b);
		Assert.assertTrue(resylt>0);
		
		
	}

}
