package com.example.api_java6.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Category")
public class Category {
    @Id
    @Column(name="id")
    private String id;
    @Column(name="name")
    private String name;
    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Product> products;

}