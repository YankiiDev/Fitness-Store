package com.eafc.springbootbackend.entities.product;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @NotNull
    @NotBlank
    private String name;

    @JsonBackReference
    @OneToMany(mappedBy = "category")
    private Collection<SubCategory> subCategories;

    private String sizingType;
}
