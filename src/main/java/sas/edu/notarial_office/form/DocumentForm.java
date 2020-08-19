package sas.edu.notarial_office.form;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import sas.edu.notarial_office.model.NotarialService;

import java.util.Objects;

public class DocumentForm {

    private String id;
    private NotarialService notarialService;
    private double notarialServicePrice;
    private double commission;

    public DocumentForm() {
    }

    public DocumentForm(NotarialService notarialService,
                        double notarialServicePrice, double commission) {
        this.notarialService = notarialService;
        this.notarialServicePrice = notarialServicePrice;
        this.commission = commission;
    }

    public DocumentForm(String id, NotarialService notarialService,
                        double notarialServicePrice, double commission) {
        this.id = id;
        this.notarialService = notarialService;
        this.notarialServicePrice = notarialServicePrice;
        this.commission = commission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NotarialService getNotarialService() {
        return notarialService;
    }

    public void setNotarialService(NotarialService notarialService) {
        this.notarialService = notarialService;
    }

    public double getNotarialServicePrice() {
        return notarialServicePrice;
    }

    public void setNotarialServicePrice(double notarialServicePrice) {
        this.notarialServicePrice = notarialServicePrice;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentForm that = (DocumentForm) o;
        return Double.compare(that.notarialServicePrice, notarialServicePrice) == 0 &&
                Double.compare(that.commission, commission) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(notarialService, that.notarialService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, notarialService, notarialServicePrice, commission);
    }

    @Override
    public String toString() {
        return "DocumentForm{" +
                "id='" + id + '\'' +
                ", notarialService=" + notarialService +
                ", notarialServicePrice=" + notarialServicePrice +
                ", commission=" + commission +
                '}';
    }
}
