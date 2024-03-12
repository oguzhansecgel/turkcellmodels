package org.example;

public class SubCategory extends Category{
    private String subCategoryName;
    public SubCategory(String categoryName) {
        super(categoryName);
    }

    public SubCategory(String categoryName, String subCategoryName) {
        super(categoryName);
        this.subCategoryName = subCategoryName;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }
}
