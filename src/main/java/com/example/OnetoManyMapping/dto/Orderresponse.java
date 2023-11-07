package com.example.OnetoManyMapping.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Orderresponse {
    private String name;
    private String productname;

    public Orderresponse(String name, String productname) {
        this.name = name;
        this.productname = productname;
    }
    private  int price;
}
