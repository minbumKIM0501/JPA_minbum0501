package com.pratice.springjpa.order.model.dto;

public class OrderDTO {

    private int musicalId;
    private String musicalDate;
    private Integer musicalPrice;
    private String cast;
    private String plot; // 줄거리
    private String musicalLocation;

    public OrderDTO(){
    }

    public OrderDTO(int musicalId, String musicalDate, Integer musicalPrice, String cast, String plot, String musicalLocation) {
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
        return "OrderDTO{" +
                "musicalId=" + musicalId +
                ", musicalDate='" + musicalDate + '\'' +
                ", musicalPrice=" + musicalPrice +
                ", cast='" + cast + '\'' +
                ", plot='" + plot + '\'' +
                ", musicalLocation='" + musicalLocation + '\'' +
                '}';
    }
}
