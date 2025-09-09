package com.sun.payload;

import com.sun.entity.Order;

import java.util.List;

public class ResponcePayload {

    List<Order> orderList;

    int pageSize;

    int PageNumber;

    Long totalElement;

    int totalPage;

    boolean isLast;

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(int pageNumber) {
        PageNumber = pageNumber;
    }

    public Long getTotalElement() {
        return totalElement;
    }

    public void setTotalElement(Long totalElement) {
        this.totalElement = totalElement;
    }

    public boolean isLast() {
        return isLast;
    }

    public void setLast(boolean last) {
        isLast = last;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        return "ResponcePayload{" +
                "orderList=" + orderList +
                ", pageSize=" + pageSize +
                ", PageNumber=" + PageNumber +
                ", totalElement=" + totalElement +
                ", totalPage=" + totalPage +
                ", isLast=" + isLast +
                '}';
    }
}
