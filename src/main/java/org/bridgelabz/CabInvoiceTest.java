package org.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
	
	@Test
	public void calculateFareOfOneRide()  {
		CabInvoice obj=new CabInvoice();
		double test=obj.calculateFare(10, 15);
		Assert.assertEquals(115.0, test, 0.0);
	}

}
