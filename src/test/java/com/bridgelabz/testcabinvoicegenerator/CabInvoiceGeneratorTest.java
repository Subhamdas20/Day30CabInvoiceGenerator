package com.bridgelabz.testcabinvoicegenerator;

import com.bridgelabz.cabinvoice.CabInvoiceGenerator;
//import com.bridgelabz.cabinvoice.InvoiceSumarry;
import com.bridgelabz.cabinvoice.InvoiceSummarry;
import com.bridgelabz.cabinvoice.Ride;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
//    @Test
//    public void givenDistanceAndTimeWhenComputedShouldReturnTotalFare() {
//        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
//        double distance = 10, time = 1;
//        double result = invoice.calculateFare(distance, time);
//        Assert.assertEquals(100, result, 0.0);
//    }
//
//    @Test
//    public void givenLessDistanceOrTime_ShouldReturnMinFare() {
//        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
//        double distance = 0.1, time = 1;
//        double result = invoice.calculateFare(distance, time);
//        Assert.assertEquals(5, result, 0.0);
//    }
//
//    @Test
//    public void givenMultipleRidesValueShouldReturnTotalFare() {
//        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
//        Ride[] rides = {new Ride(2.0, 5), new Ride(0.1, 1)};
//        double totalFare = invoice.calculateFare(rides);
//        Assert.assertEquals(30.0, totalFare, 0.0);
//    }
//
//    @Test
//    public void test3() {
//        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
//        Ride[] rides = {new Ride(2.0, 5), new Ride(0.1, 1)};
//        double totalFare = invoice.calculateFare(rides);
//        InvoiceSumarry actualInvoiceSumarry = new InvoiceSumarry(totalFare, rides.length);
//        InvoiceSumarry expectedInvoiceSumarry = new InvoiceSumarry(30.0, 2);
//        Assert.assertEquals(expectedInvoiceSumarry, actualInvoiceSumarry);
//    }
//    @Test
//    public void givenUserId_shouldReturnInvoiceSummary() {
//        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
//        String userId = "subham@gmail.com";
//        Ride[] rides = {new Ride(2.0, 5),
//                new Ride(0.1, 1)};
//        invoiceGenerator.addRides(userId, rides);
//        InvoiceSumarry summary = invoiceGenerator.calculateFare(rides, "normal");
//        InvoiceSumarry invoiceSummary = invoiceGenerator.getInvoiceSummary(userId);
//        Assert.assertEquals(invoiceSummary, summary);
//    }
    @Test
    public void givenUserIdAndRides_ShouldReturn_MultipleInvoiceSummary() {
        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
        String userId = "subham@gmailcom.com";
        Ride[] rides = {new Ride(0.1, 1, CabInvoiceGenerator.RideMode.NORMAL), new Ride(1, 1, CabInvoiceGenerator.RideMode.NORMAL)};
        invoiceGenerator.addRides(userId, rides);
        Ride[] rides1 = {new Ride(0.1, 1, CabInvoiceGenerator.RideMode.PREMIUM), new Ride(1, 1, CabInvoiceGenerator.RideMode.PREMIUM)};
        invoiceGenerator.addRides(userId, rides1);
        Ride[] rides2 = {new Ride(0.1, 1, CabInvoiceGenerator.RideMode.PREMIUM), new Ride(1, 1, CabInvoiceGenerator.RideMode.PREMIUM)};
        invoiceGenerator.addRides(userId, rides2);
        InvoiceSummarry summary = invoiceGenerator.getInvoiceSummary(userId);
        InvoiceSummarry expectedInvoiceSummary = new InvoiceSummarry(85, 6);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }

}
