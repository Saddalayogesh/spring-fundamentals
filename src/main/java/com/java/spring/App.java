package com.java.spring;

import com.java.spring.model.Address;
import com.java.spring.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Address residentialAddress=context.getBean("residential_address", Address.class);
        System.out.println("Residential Address" + residentialAddress);
        Address shippingAddress=context.getBean("shipping_address", Address.class);
        System.out.println("Shipping Address" + shippingAddress);

        Customer customer1=context.getBean("customer1",Customer.class );
        System.out.println("Customer1" + customer1);

        Customer customer2=context.getBean("customer2",Customer.class );
        System.out.println("Customer2" + customer2);


    }
}
