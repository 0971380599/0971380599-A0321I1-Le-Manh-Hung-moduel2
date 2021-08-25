package case_study.models;

import java.time.LocalDate;

public abstract class Facility {
private String serviceName;
private double usableArea;
private double rentalCost;
private int maximumNumberPeople;
private LocalDate rentalType;

    public Facility() {
    }

    public Facility(String serviceName, double usableArea, double rentalCost, int maximumNumberPeople, LocalDate rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maximumNumberPeople = maximumNumberPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaximumNumberPeople() {
        return maximumNumberPeople;
    }

    public void setMaximumNumberPeople(int maximumNumberPeople) {
        this.maximumNumberPeople = maximumNumberPeople;
    }

    public LocalDate getRentalType() {
        return rentalType;
    }

    public void setRentalType(LocalDate rentalType) {
        this.rentalType = rentalType;
    }
}
