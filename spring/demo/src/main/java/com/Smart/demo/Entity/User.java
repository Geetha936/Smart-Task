package com.Smart.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id ;

    private String name ;

    private String password ;

    private String email ;

    @Enumerated(EnumType.STRING)
    private Role role;

}

enum Role {
    ADMIN,MANAGER,USER
}
