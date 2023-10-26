package com.pratice.springjpa.order.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "musical_list")
public class Order {

    @Id
    @Column(name = "MUSICAL_ID")
    private int musicalId;
    @Column(name = "MUSICAL_DATE")
    private String musicalDate;
    @Column(name = "MUSICAL_PRICE")
    private Integer musicalPrice;
    @Column(name = "CAST")
    private String cast;
    @Column(name = "PLOT")
    private String plot; // 줄거리
    @Column(name = "MUSICALLOCATION")
    private String musicalLocation;

    protected Order() {
    }

    public Order(int musicalId, String musicalDate, Integer musicalPrice, String cast, String plot, String musicalLocation) {
        this.musicalId = musicalId;
        this.musicalDate = musicalDate;
        this.musicalPrice = musicalPrice;
        this.cast = cast;
        this.plot = plot;
        this.musicalLocation = musicalLocation;
    }

    public int getMusicalId() {
        return musicalId;
    }

    public String getMusicalDate() {
        return musicalDate;
    }

    public Integer getMusicalPrice() {
        return musicalPrice;
    }

    public String getCast() {
        return cast;
    }

    public String getPlot() {
        return plot;
    }

    public String getMusicalLocation() {
        return musicalLocation;
    }

    public void setMusicalId(int musicalId) {
        this.musicalId = musicalId;
    }

    public void setMusicalDate(String musicalDate) {
        this.musicalDate = musicalDate;
    }

    public void setMusicalPrice(Integer musicalPrice) {
        this.musicalPrice = musicalPrice;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public void setMusicalLocation(String musicalLocation) {
        this.musicalLocation = musicalLocation;
    }

    @Override
    public String toString() {
        return "Order{" +
                "musicalId=" + musicalId +
                ", musicalDate='" + musicalDate + '\'' +
                ", musicalPrice=" + musicalPrice +
                ", cast='" + cast + '\'' +
                ", plot='" + plot + '\'' +
                ", musicalLocation='" + musicalLocation + '\'' +
                '}';
    }
}
