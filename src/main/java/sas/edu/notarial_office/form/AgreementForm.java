package sas.edu.notarial_office.form;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 20 Aug 2020
 */

import sas.edu.notarial_office.model.Client;
import sas.edu.notarial_office.model.Document;

import java.util.Objects;

public class AgreementForm {

    private String id;
    private Document document;
    private Client client;
    private double prise;
    private double commission;
    private String description;

    public AgreementForm() {
    }

    public AgreementForm(Document document, Client client,
                         double prise, double commission, String description) {
        this.document = document;
        this.client = client;
        this.prise = prise;
        this.commission = commission;
        this.description = description;
    }

    public AgreementForm(String id, Document document, Client client,
                         double prise, double commission, String description) {
        this.id = id;
        this.document = document;
        this.client = client;
        this.prise = prise;
        this.commission = commission;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgreementForm that = (AgreementForm) o;
        return Double.compare(that.prise, prise) == 0 &&
                Double.compare(that.commission, commission) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(document, that.document) &&
                Objects.equals(client, that.client) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, document, client, prise, commission, description);
    }

    @Override
    public String toString() {
        return "AgreementForm{" +
                "id='" + id + '\'' +
                ", document=" + document +
                ", client=" + client +
                ", prise=" + prise +
                ", commission=" + commission +
                ", description='" + description + '\'' +
                '}';
    }
}
