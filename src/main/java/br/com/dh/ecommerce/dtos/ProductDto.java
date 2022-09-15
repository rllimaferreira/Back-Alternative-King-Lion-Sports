package br.com.dh.ecommerce.dtos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import br.com.dh.ecommerce.entities.Product;

public class ProductDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String title;
    private String description;
    private String image;
    private String brand;
    private Double price;

    private Set<CategoryDto> categories = new HashSet<>();


    public ProductDto() {
    }

    public ProductDto(Integer id, String title, String description, String image, Double price, String brand) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.price = price;
        this.brand = brand;

    }

    public ProductDto(Product product) {
        id = product.getId();
        title = product.getTitle();
        description = product.getDescription();
        image = product.getImage();
        price = product.getPrice();
        brand = product.getBrand();
        product.getCategories().forEach(category -> this.categories.add(new CategoryDto(category)));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Set<CategoryDto> getCategories() {
        return categories;
    }
}
