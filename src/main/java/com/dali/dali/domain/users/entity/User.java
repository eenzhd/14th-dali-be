package com.dali.dali.domain.users.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Entity
@Getter
@Builder
@Component
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(length = 10)
    private String name;

    @Column(length = 1)
    private String gender;

    @Column(length = 30)
    private String email;

    @Column(length = 20)
    private String nickname;

    @Column(length = 255)
    private String profile;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    public User() {
    }

    public String getRoleKey() {
        return this.role.getKey();
    }
}
