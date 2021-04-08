package com.example.planner.repository;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRepository {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
