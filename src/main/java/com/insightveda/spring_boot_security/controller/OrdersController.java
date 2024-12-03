package com.insightveda.spring_boot_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

    @GetMapping("/api/orders")
    public String getOrders() {
        return "List of orders";
    }

    @GetMapping("/api/orders/details")
    public String getOrderDetails() {
        return "Details of a specific order";
    }
}
