package com.teju;

import enums.OrderStatus;

public class Order {
    int orderId;
    OrderStatus status;

    public Order(int orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    public boolean printDetails(){
        System.out.println("Order ID:" +orderId + "is " +status);
        return true;
    }
}
