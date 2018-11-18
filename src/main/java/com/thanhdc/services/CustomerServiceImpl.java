package com.thanhdc.services;

import com.thanhdc.model.Customer;
import com.thanhdc.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findById(Integer id) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public void save(Customer customer) {

    }
}
