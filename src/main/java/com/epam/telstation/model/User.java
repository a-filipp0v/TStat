package com.epam.telstation.model;

import lombok.Builder;
import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@Builder
public class User {

    int id;
    String name;
    String surname;
    String phoneNumber;
    String password;

    @NonFinal @Setter double account = 0.0;
    @NonFinal @Setter Role status = Role.USER;
    @NonFinal @Setter boolean isBlocked = false;

}
