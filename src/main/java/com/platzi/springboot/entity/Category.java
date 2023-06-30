package com.platzi.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.List;


@Table(name = "categories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category implements Serializable {

    @Id
    @Column("id")
    private Integer id;

    @Column("name")
    private String name;

    @Column("active")
    private int active;

    @Column("image_url")
    private int imageUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<Product> products;

}
