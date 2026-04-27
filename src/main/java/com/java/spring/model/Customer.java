package com.java.spring.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Customer {
    int id;
    String name;
    String email;
    String phone;
    List<Address> addresses;
 public void setUp(){
     System.out.println("Setting up customer");
 }
 public void tearDown(){
     System.out.println("Tearing Down customer");
 }
}
