package org.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
	
	@Test
	public void CalculateFareTest() {
		CabInvoice obj = new CabInvoice();
		double test = obj.calculateFare(10, 15);
		double test1 = obj.calculateFare(10, 15) + obj.calculateFare(10, 15);
		;
		Assert.assertEquals(230.0, test1, 0.0);
	}

	@Test
	public void MonthFareTest() {
		CabInvoice obj = new CabInvoice();
		Ride[] rides = { new Ride(1, 23), new Ride(1, 2) };
		double monthfare = obj.calculateFare(rides);
		Assert.assertEquals(45.0, monthfare, 0.0);

	}

}
