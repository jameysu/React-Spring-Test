package com.springtraining.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    
    private long id;
    private String firstname;
    private String lastname;
    private String email;

}
