package com.minhhung.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age
) {
}
