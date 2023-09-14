package com.example.onlinebookstore.dto.user;

import lombok.Data;

@Data
public class UserResponseDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String shippingAddress;
}
