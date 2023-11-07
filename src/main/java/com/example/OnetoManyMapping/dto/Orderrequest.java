package com.example.OnetoManyMapping.dto;

import com.example.OnetoManyMapping.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orderrequest {
    private Customer customer;
}
