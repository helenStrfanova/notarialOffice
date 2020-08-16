package sas.edu.notarial_office.model;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 14 Aug 2020
 */

import java.util.Objects;

public class Client {

    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private Discount discount;

    /*******************************
        * 3 types of constructor
    *******************************/

    public Client() {
    }

    public Client(String firstName, String lastName,
                  String address, String phoneNumber, Discount discount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.discount = discount;
    }

    public Client(String id, String firstName, String lastName,
                  String address, String phoneNumber, Discount discount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.discount = discount;
    }

    /****************************************************
         * Setters and Getters for all class fields
    ****************************************************/
    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Discount getDiscount() {
        return discount;
    }

    /********************************
        * Override method equals()
    ********************************/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(firstName, client.firstName) &&
                Objects.equals(lastName, client.lastName) &&
                Objects.equals(address, client.address) &&
                Objects.equals(phoneNumber, client.phoneNumber) &&
                Objects.equals(discount, client.discount);
    }

    /********************************
     * Override method hashCode()
     ********************************/
    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, address,
                phoneNumber, discount);
    }

    /********************************
     * Override method toString()
     ********************************/
    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", discount=" + discount +
                '}';
    }
}
