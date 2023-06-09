package org.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
	
	@Test
    public void test() {
		CabInvoice obj = new CabInvoice();
        Assert.assertEquals(120.0,obj.getInvoice(10, 20,"R"), 0);
    }

    @Test
    public void test1() {
    	CabInvoice obj = new CabInvoice();    
    	Assert.assertEquals(240.0, obj.generateInvoiceAsPerUserID(5),0);
    }
    @Test
    public void test2() {
    	CabInvoice obj = new CabInvoice();
    	Assert.assertEquals(220.0,obj.getInvoice(10, 20,"P"), 0);
    }

}
