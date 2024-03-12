package org.example;

public class Product extends SubCategory{
    private String title;
    private String imageUrl;
    private String color;
    private double unitPrice;


    public Product(String title, String imageUrl, String color, double unitPrice,String categoryName,String subCategoryName) {
        super(categoryName,subCategoryName);
        this.title = title;
        this.imageUrl = imageUrl;
        this.color = color;
        this.unitPrice = unitPrice;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

}
