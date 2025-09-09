package com.sun.service.impl;

import com.sun.entity.Order;
import com.sun.payload.ResponcePayload;
import com.sun.repo.OrderRepository;
import com.sun.service.OrderServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServcieImpl implements OrderServcie {

    @Autowired
    OrderRepository orderRepository;
    @Override
    public ResponcePayload getAllOrders(int pageNo, int pageSize, String sortBy, String sortDir) {

        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
                : Sort.by(sortBy).descending();

        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

        Page<Order> orderPage = orderRepository.findAll(pageable);

        List<Order> orderList = orderPage.getContent();

        ResponcePayload payload = new ResponcePayload();

        payload.setOrderList(orderList);
        payload.setPageNumber(orderPage.getNumber());
        payload.setPageSize(orderPage.getSize());
        payload.setTotalElement(orderPage.getTotalElements());
        payload.setTotalPage(orderPage.getTotalPages());
        payload.setLast(orderPage.isLast());

        return payload;
    }

    @Override
    public String createOrder(List<Order> orderList) {

        orderRepository.saveAll(orderList);
        return "sucess";
    }
}
