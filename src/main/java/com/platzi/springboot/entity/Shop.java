package com.platzi.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "shops")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Shop implements Serializable {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "document_number")
    private String documentNumber;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "name")
    private String name;

    @Column(name = "image_url")
    private String imageUrl;


}
