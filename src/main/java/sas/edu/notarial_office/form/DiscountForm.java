package sas.edu.notarial_office.form;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 17 Aug 2020
 */

import java.util.Objects;

public class DiscountForm {

    private String id;
    private String name;
    private int percentageDiscount;

    /********************************
     * 3 types of constructors
     *******************************/

    public DiscountForm() {
    }

    public DiscountForm(String name, int percentageDiscount) {
        this.name = name;
        this.percentageDiscount = percentageDiscount;
    }

    public DiscountForm(String id, String name, int percentageDiscount) {
        this.id = id;
        this.name = name;
        this.percentageDiscount = percentageDiscount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercentageDiscount(int percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiscountForm that = (DiscountForm) o;
        return percentageDiscount == that.percentageDiscount &&
                Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, percentageDiscount);
    }

    @Override
    public String toString() {
        return "DiscountForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", percentageDiscount=" + percentageDiscount +
                '}';
    }
}
