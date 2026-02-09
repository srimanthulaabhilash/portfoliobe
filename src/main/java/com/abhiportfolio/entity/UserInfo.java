package com.abhiportfolio.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_info")
@Data
@NoArgsConstructor
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Basic contact fields
    @Column(name = "full_name")
    private String fullName;

    @Column(nullable = false)
    private String email;

    private String phone;
    private String company;

    // Message / reason for contact

    @Column(length = 2000)
    private String message;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}