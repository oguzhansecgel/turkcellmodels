package org.example;

public class DiscountProduct extends Product{
    private int discount;
    private double price;
    public DiscountProduct(String title, String imageUrl, String color, double unitPrice, String categoryName, String subCategoryName, int discount) {
        super(title, imageUrl, color, unitPrice = unitPrice-(unitPrice*discount/100) , categoryName, subCategoryName);

        this.discount = discount;
    }

    public int getDiscount() {

        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
