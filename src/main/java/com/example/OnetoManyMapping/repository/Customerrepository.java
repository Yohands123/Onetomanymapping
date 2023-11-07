package com.example.OnetoManyMapping.repository;

import com.example.OnetoManyMapping.dto.Orderresponse;
import com.example.OnetoManyMapping.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Customerrepository  extends JpaRepository<Customer,Integer> {
    @Query("SELECT new com.example.OnetoManyMapping.dto.Orderresponse(c.name,p.productname) from Customer c JOIN c.products p")
    public List<Orderresponse> getJoinInformation();
}
