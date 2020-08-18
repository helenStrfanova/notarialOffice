package sas.edu.notarial_office.model;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name:"notarialOffice"
 * 14 Aug 2020
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Document
public class Discount {

    @Id
    private String id;
    private String name;
    private byte percentageDiscount;

    /********************************
       * 3 types of constructors
    *******************************
     * @param hh
     * @param percentageDiscount*/

    public Discount(String hh, int percentageDiscount) {
    }

    public Discount(String name, byte percentageDiscount) {
        this.name = name;
        this.percentageDiscount = percentageDiscount;
    }

    public Discount(String id, String name, byte percentageDiscount) {
        this.id = id;
        this.name = name;
        this.percentageDiscount = percentageDiscount;
    }

    /***********************************************
       * Setters and Getters for all class fields
    ************************************************/

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public byte getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercentageDiscount(byte percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    /**********************************
         * Override method equals()
    **********************************/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discount discount = (Discount) o;
        return percentageDiscount == discount.percentageDiscount &&
                Objects.equals(id, discount.id) &&
                Objects.equals(name, discount.name);
    }

    /**********************************
        * Override method hashCode()
     **********************************/
    @Override
    public int hashCode() {
        return Objects.hash(id, name, percentageDiscount);
    }

    /**********************************
     * Override method toString()
     ***********************************/
    @Override
    public String toString() {
        return "Discount{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", percentageDiscount=" + percentageDiscount +
                '}';
    }

}
