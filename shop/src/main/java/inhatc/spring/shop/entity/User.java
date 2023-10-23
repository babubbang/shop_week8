package inhatc.spring.shop.entity;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //auto_increment
    @Column(name = "user_id")
    private Long id;    //기본키

    private int age;

    @Column(length = 30)
    private String name;
}
