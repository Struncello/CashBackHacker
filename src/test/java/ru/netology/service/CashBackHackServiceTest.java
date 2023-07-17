package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashBackHackServiceTest {

    @org.junit.Test
    public void testRemain() {

        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int actual = CashBackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashback() {

        CashBackHackService service = new CashBackHackService();
        int amount = 900;
        int actual = CashBackHackService.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

}