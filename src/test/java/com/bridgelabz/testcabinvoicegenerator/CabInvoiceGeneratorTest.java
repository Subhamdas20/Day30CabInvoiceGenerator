package com.bridgelabz.testcabinvoicegenerator;

import com.bridgelabz.cabinvoice.CabInvoiceGenerator;
import com.bridgelabz.cabinvoice.InvoiceSumarry;
import com.bridgelabz.cabinvoice.Ride;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTimeWhenComputedShouldReturnTotalFare() {
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        double distance = 10, time = 1;
        double result = invoice.calculateFare(distance, time);
        Assert.assertEquals(100, result, 0.0);
    }

    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinFare() {
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        double distance = 0.1, time = 1;
        double result = invoice.calculateFare(distance, time);
        Assert.assertEquals(5, result, 0.0);
    }

    @Test
    public void givenMultipleRidesValueShouldReturnTotalFare() {
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        Ride[] rides = {new Ride(2.0, 5), new Ride(0.1, 1)};
        double totalFare = invoice.calculateFare(rides);
        Assert.assertEquals(30.0, totalFare, 0.0);
    }

    @Test
    public void test3() {
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        Ride[] rides = {new Ride(2.0, 5), new Ride(0.1, 1)};
        double totalFare = invoice.calculateFare(rides);
        InvoiceSumarry actualInvoiceSumarry = new InvoiceSumarry(totalFare, rides.length);
        InvoiceSumarry expectedInvoiceSumarry = new InvoiceSumarry(30.0, 2);
        Assert.assertEquals(expectedInvoiceSumarry, actualInvoiceSumarry);
    }
}

