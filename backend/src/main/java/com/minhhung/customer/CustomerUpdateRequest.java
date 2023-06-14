package com.minhhung.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
