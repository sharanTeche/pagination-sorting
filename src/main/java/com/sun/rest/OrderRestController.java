package com.sun.rest;

import com.sun.entity.Order;
import com.sun.payload.ApiResponce;
import com.sun.payload.ResponcePayload;
import com.sun.service.OrderServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.sun.constant.AppConstant.PAGE_NO;
import static com.sun.constant.AppConstant.PAGE_SIZE;

@RestController
@RequestMapping("/api")
public class OrderRestController {

    @Autowired
    OrderServcie orderServcie;

   // http://localhost:8080/api/getAllOrder?pageNo=0&pageSize=10&sortBy=totalPrice&sortDir=DSC

    @GetMapping("/getAllOrder")
    public ResponseEntity<ApiResponce<ResponcePayload>> getAllOrder(

            @RequestParam(value = "pageNo", defaultValue = PAGE_NO, required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = PAGE_SIZE, required = false) int pageSize,
            @RequestParam(value = "sortBy", defaultValue = "orderId", required = false) String sortBy,
            @RequestParam(value = "sortDir", defaultValue = "asc", required = false) String sortDir
    ) {

        ResponcePayload responcePayload = orderServcie.getAllOrders(pageNo, pageSize, sortBy, sortDir);
        ApiResponce<ResponcePayload> api = new ApiResponce<>();
        if (responcePayload != null) {
            api.setStatus("200");
            api.setMessage("fetched data sucessfully!!");
            api.setData(responcePayload);
            return new ResponseEntity<>(api, HttpStatus.OK);
        } else {

            api.setStatus("500");
            api.setMessage("failed to fetched!!");
            api.setData(responcePayload);
            return new ResponseEntity<>(api, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

    @PostMapping("/save")
    public String createOrder(@RequestBody List<Order> order) {

        return orderServcie.createOrder(order);
    }
}
