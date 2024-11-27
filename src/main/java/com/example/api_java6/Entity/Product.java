package com.example.api_java6.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "brand", nullable = false, length = 255)
    private String brand;

    @Column(name = "image", length = 255)
    private String image;

    @Column(name = "price", nullable = false, precision = 18, scale = 2)
    private BigDecimal price;

    @Column(name = "available", columnDefinition = "BIT DEFAULT 1")
    private Boolean available;

    @Temporal(TemporalType.DATE)
    @Column(name = "Date")
    private Date date;

    @Column(name = "description", columnDefinition = "NVARCHAR(MAX) DEFAULT ''")
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonIgnore // Tránh tuần tự hóa phía "nhiều"
    private Category category;

}