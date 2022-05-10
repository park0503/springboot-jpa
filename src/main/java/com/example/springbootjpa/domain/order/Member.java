package com.example.springbootjpa.domain.order;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "name", nullable = false, length = 30)
    private String name;
    @Column(name = "nick_name", nullable = false, length = 30, unique = true)
    private String nickName;
    @Column(name = "age", nullable = false)
    private int age;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "description")
    private String description;

    public Member(String name, String nickName, int age, String address, String description) {
        this.name = name;
        this.nickName = nickName;
        this.age = age;
        this.address = address;
        this.description = description;
    }
}