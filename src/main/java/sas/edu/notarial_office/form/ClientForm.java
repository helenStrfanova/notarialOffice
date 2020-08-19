package sas.edu.notarial_office.form;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import sas.edu.notarial_office.model.Discount;

import java.util.Objects;

public class ClientForm {

    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private Discount discount;

    public ClientForm() {
    }

    public ClientForm(String firstName, String lastName,
                      String address, String phoneNumber, Discount discount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.discount = discount;
    }

    public ClientForm(String id, String firstName, String lastName,
                      String address, String phoneNumber, Discount discount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientForm that = (ClientForm) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(address, that.address) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(discount, that.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, address, phoneNumber, discount);
    }

    @Override
    public String toString() {
        return "ClientForm{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", discount=" + discount +
                '}';
    }
}
