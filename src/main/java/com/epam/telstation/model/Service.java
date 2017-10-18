package com.epam.telstation.model;



import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Service {

    int id;
    String name;
    double value;


}
