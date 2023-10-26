package com.pratice.springjpa.order.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MUSICAL_LOCATION")
public class Category {

    @Id
    @Column(name = "STATUS_NUM")
    private String musicalLocation;

    @Column(name = "STATUS")
    private String status;

    protected Category(){
    }

    public Category(String musicalLocation, String status) {
        this.musicalLocation = musicalLocation;
        this.status = status;
    }

    public String getMusicalLocation() {
        return musicalLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setMusicalLocation(String musicalLocation) {
        this.musicalLocation = musicalLocation;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Category{" +
                "musicalLocation='" + musicalLocation + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
