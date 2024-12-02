package com.example.crud.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Integer prince_in_cents;

    public Product(RequestProduct requestProduct){
        this.name = requestProduct.name();
        this.prince_in_cents = requestProduct.prince_in_cents();
    }

    public void setActive(boolean b) {
    }
}
