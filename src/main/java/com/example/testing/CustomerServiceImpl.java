package com.example.testing;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer register(Customer customer) {
        //Save the customer in database
      return customerRepository.save(customer);

    }

}