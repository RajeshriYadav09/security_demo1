package com.techcushy.security_demo1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JWTRequest {
    private String username;
    private String password;

}
