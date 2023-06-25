package com.platzi.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


import java.io.Serializable;



@Table(name = "shops")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Shop implements Serializable {

    @Id
    @Column("id")
    private Integer id;

    @Column("document_number")
    private String documentNumber;

    @Column("business_name")
    private String businessName;

    @Column("name")
    private String name;

    @Column("image_url")
    private String imageUrl;


}
