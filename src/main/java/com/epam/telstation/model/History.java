package com.epam.telstation.model;


import lombok.Builder;
import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.util.Set;
@Value
@Builder
public class History {

     int id;
    User user;
    @NonFinal @Setter Set<Service> services;
    @NonFinal @Setter int amount;
    @NonFinal @Setter boolean isPaid;

}
