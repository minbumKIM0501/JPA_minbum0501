package com.pratice.springjpa.order.model.dto;

public class CategoryDTO {

    private String musicalLocation;

    private String status;

    public CategoryDTO(){
    }

    public CategoryDTO(String musicalLocation, String status) {
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
        return "CategoryDTO{" +
                "musicalLocation='" + musicalLocation + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
