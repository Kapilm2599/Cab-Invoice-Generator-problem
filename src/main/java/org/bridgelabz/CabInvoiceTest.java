package org.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
	
	@Test
	public void givenUserId_shouldReturnInvoiceSummary() {
		try {
			String userId = "me.shadab@gmail.com";
			Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
			CabInvoice.addRides(userId, rides);
			InvoiceSummary summary;

			summary = CabInvoice.calculateFare(rides, "normal");

			InvoiceSummary invoiceSummary = CabInvoice.getInvoiceSummary(userId);
			Assert.assertEquals(invoiceSummary, summary);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
