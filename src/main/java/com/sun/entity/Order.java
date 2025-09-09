package com.sun.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Order_Details")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private String orderTrackingNum;

    private String razorPayOrderId;

    private String razorPayPaymentId;

    private String email;

    private String orderStatus;

    private Double totalPrice;

    private Integer totalQuantity;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderTrackingNum() {
        return orderTrackingNum;
    }

    public void setOrderTrackingNum(String orderTrackingNum) {
        this.orderTrackingNum = orderTrackingNum;
    }

    public String getRazorPayOrderId() {
        return razorPayOrderId;
    }

    public void setRazorPayOrderId(String razorPayOrderId) {
        this.razorPayOrderId = razorPayOrderId;
    }

    public String getRazorPayPaymentId() {
        return razorPayPaymentId;
    }

    public void setRazorPayPaymentId(String razorPayPaymentId) {
        this.razorPayPaymentId = razorPayPaymentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderTrackingNum='" + orderTrackingNum + '\'' +
                ", razorPayOrderId='" + razorPayOrderId + '\'' +
                ", razorPayPaymentId='" + razorPayPaymentId + '\'' +
                ", email='" + email + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", totalPrice=" + totalPrice +
                ", totalQuantity=" + totalQuantity +
                '}';
    }
}
