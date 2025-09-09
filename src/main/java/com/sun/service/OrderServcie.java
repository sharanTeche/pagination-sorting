package com.sun.service;

import com.sun.entity.Order;
import com.sun.payload.ResponcePayload;

import java.util.List;

public interface OrderServcie {

    public ResponcePayload getAllOrders(int pageNo, int pageSize, String sortBy, String sortDir);

    public String createOrder(List<Order> orderList);
}
