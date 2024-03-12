package org.example;

public class Main {
    public static void main(String[] args) {


        Product phone = new Product("iphone 15 ","asd.jpg","beyaz",82000,"Cep Telefonu","Apple Telefonlar");
        Product phone2 = new Product("iphone 14 ","asd.jpg","beyaz",81000,"Cep Telefonu","Apple Telefonlar");
        Product phone3 = new Product("iphone 13 ","asd.jpg","beyaz",85000,"Cep Telefonu","Apple Telefonlar");
        DiscountProduct beyazEsya = new DiscountProduct("Profilo","denem.jpg","Beyaz",20000,"Beyaz Eşya","Buzdolabi",3);
        Customer customer1 = new Customer(11111111,"deneme@gmail.com","123123","123123","deneme","deneme","deneme",true);
        Customer customer2 = new Customer(11111111,"deneme@gmail.com","123123","123123","deneme","deneme","deneme",false);



        CorporateCustomer cp1 = new CorporateCustomer(1111111,"denemedenem@gmail.com","123123","123123123","123123","Nezih Elektronik");


        System.out.println("Product "+phone.getTitle());
        System.out.println("Product "+phone.getUnitPrice());
        System.out.println("Customer "+customer1.getFirstName());
        System.out.println("Corporate "+cp1.getEmail());
        System.out.println(beyazEsya.getUnitPrice());

        Product[] products= {phone,phone2,phone3,beyazEsya};

        System.out.println("<ul>");
        for(Product product: products) {
            System.out.println("<li>" + product.getTitle() +"</li>");
        }
        System.out.println("</ul>");
    }
}