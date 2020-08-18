package sas.edu.notarial_office.model;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 14 Aug 2020
 */

import java.util.Objects;

public class Document {

    private String id;
    private NotarialService notarialService;
    private double notarialServicePrice;
    private double commission;

    /***********************************
         * 3 types of constructors
    ***********************************/
    public Document() {
    }

    public Document(NotarialService notarialService,
                    double notarialServicePrice, double commission) {
        this.notarialService = notarialService;
        this.notarialServicePrice = notarialServicePrice;
        this.commission = commission;
    }

    public Document(String id, NotarialService notarialService,
                    double notarialServicePrice, double commission) {
        this.id = id;
        this.notarialService = notarialService;
        this.notarialServicePrice = notarialServicePrice;
        this.commission = commission;
    }

    /***********************************************
       * Setters and Getters for all class fields
    ************************************************/

    public void setId(String id) {
        this.id = id;
    }

    public void setNotarialService(NotarialService notarialService) {
        this.notarialService = notarialService;
    }

    public void setNotarialServicePrice(double notarialServicePrice) {
        this.notarialServicePrice = notarialServicePrice;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getId() {
        return id;
    }

    public NotarialService getNotarialService() {
        return notarialService;
    }

    public double getNotarialServicePrice() {
        return notarialServicePrice;
    }

    public double getCommission() {
        return commission;
    }

    /*********************************
      * Override method equals()
    *********************************/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Double.compare(document.notarialServicePrice, notarialServicePrice) == 0 &&
                Double.compare(document.commission, commission) == 0 &&
                Objects.equals(id, document.id) &&
                Objects.equals(notarialService, document.notarialService);
    }

    /**********************************
     * Override method hashCode()
     *********************************/
    @Override
    public int hashCode() {
        return Objects.hash(id, notarialService, notarialServicePrice, commission);
    }

    /********************************
     * Override method toString()
     *********************************/
    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", notarialService=" + notarialService +
                ", notarialServicePrice=" + notarialServicePrice +
                ", commission=" + commission +
                '}';
    }
}
