package sas.edu.notarial_office.model;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 14 Aug 2020
 */

import java.util.Objects;

public class Agreement {

    private String id;
    private Document document;
    private Client client;
    private double prise;
    private double commission;
    private String description;

    /*****************************
      * 3 types of constructors
    *****************************/

    public Agreement() {
    }

    public Agreement(Document document, Client client, double prise,
                     double commission, String description) {
        this.document = document;
        this.client = client;
        this.prise = prise;
        this.commission = commission;
        this.description = description;
    }

    public Agreement(String id, Document document, Client client, double prise,
                     double commission, String description) {
        this.id = id;
        this.document = document;
        this.client = client;
        this.prise = prise;
        this.commission = commission;
        this.description = description;
    }

    /**************************************************
        * Setters and Getters for all class fields
    ***************************************************/

    public String getId() {
        return id;
    }

    public Document getDocument() {
        return document;
    }

    public Client getClient() {
        return client;
    }

    public double getPrise() {
        return prise;
    }

    public double getCommission() {
        return commission;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /******************************
      * Override method equals()
    *******************************/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agreement agreement = (Agreement) o;
        return Double.compare(agreement.prise, prise) == 0 &&
                Double.compare(agreement.commission, commission) == 0 &&
                Objects.equals(id, agreement.id) &&
                Objects.equals(document, agreement.document) &&
                Objects.equals(client, agreement.client) &&
                Objects.equals(description, agreement.description);
    }

    /*******************************
       * Override method hashCode()
     *******************************/
    @Override
    public int hashCode() {
        return Objects.hash(id, document, client, prise,
                commission, description);
    }

    /******************************
     * Override method toString()
     *******************************/
    @Override
    public String toString() {
        return "Agreement{" +
                "id='" + id + '\'' +
                ", document=" + document +
                ", client=" + client +
                ", prise=" + prise +
                ", commission=" + commission +
                ", description='" + description + '\'' +
                '}';
    }
}
