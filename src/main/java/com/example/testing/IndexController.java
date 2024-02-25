package com.example.testing;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @Autowired
    CustomerController customerController ;
/* version 1
    @PostMapping("/adding")
    public String getting(@RequestParam String mob, @RequestParam String pwd){

        Customer customer = new Customer();
        customer.setMobile(mob);
        customer.setPassword(pwd);

        ResponseEntity<Customer> res = customerController.registerCustomer(customer);

        System.out.println(mob + " " + pwd);
        return "index";
    }
*/

    @PostMapping("/adding")
    public ResponseEntity<Customer> getting(@RequestParam String mob, @RequestParam String pwd) {
        Customer customer = new Customer();
        customer.setMobile(mob);
        customer.setPassword(pwd);

        return customerController.registerCustomer(customer);
    }


}
