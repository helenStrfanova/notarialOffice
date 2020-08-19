package sas.edu.notarial_office.model;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 14 Aug 2020
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class NotarialService {

    @Id
    private String id;
    private String name;
    private String description;

    /************************************
         * 3 types of constructors
    ***********************************/

    public NotarialService() {
    }

    public NotarialService(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public NotarialService(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /************************************************
      * Setters and Getters for all class variables
    *************************************************/

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    /*****************************************
                 * Override method equals()
    *****************************************/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotarialService that = (NotarialService) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    /****************************************
          * Override method hashCode()
    ****************************************/
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }

    /****************************************
            * Override method toString()
    *****************************************/
    @Override
    public String toString() {
        return "NotarialService{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
