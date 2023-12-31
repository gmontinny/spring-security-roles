package com.gmontinny.customer;

import com.gmontinny.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sunitc on 4/19/18.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //Contains search on either firstname or lastname
    List<Customer> findAllByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
}
