package br.com.dh.ecommerce.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcategory;
    private String name;

    public Category() {
    }

    public Category(Integer idcategory, String name) {
        this.idcategory = idcategory;
        this.name = name;
    }

    public Integer getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(Integer idcategory) {
        this.idcategory = idcategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
