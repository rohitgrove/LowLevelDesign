package Models;

import constants.ProductType;

public class Product {
    private String productName;
    private int id;
    private ProductType type;
    private double price;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setProductType(ProductType type) {
        this.type = type;
    }

    public ProductType getProductType() {
        return this.type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}
