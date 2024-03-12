package org.example;

public class Customer extends User{

    private String cardNo;
    private String firstName;
    private String lastName;
    public boolean turkcellCustomer;


    public Customer(int identity, String email, String password, String address, String cardNo, String firstName, String lastName, boolean turkcellCustomer) {
        super(identity, email, password, address);
        this.cardNo = cardNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.turkcellCustomer = turkcellCustomer;
    }




    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTurkcellCustomer() {
        return turkcellCustomer;
    }

    public void setTurkcellCustomer(boolean turkcellCustomer) {
        this.turkcellCustomer = turkcellCustomer;
    }
}
