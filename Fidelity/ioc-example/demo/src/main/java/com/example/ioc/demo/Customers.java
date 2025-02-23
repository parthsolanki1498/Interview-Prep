package com.example.ioc.demo;

import org.springframework.stereotype.Component;

@Component
public class Customers {

    private int customerId;
    private String customerName;
    private String courseNam;

    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCourseNam() {
        return courseNam;
    }
    public void setCourseNam(String courseNam) {
        this.courseNam = courseNam;
    }
    
    public void display() {
        System.out.println("Object Return Successfully");
    }
    
}
