package com.venkat.solid.isp1;

public class Paytm implements UPIPayments{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
       // Not Supported by Paytm but forced to implement
    }
}
