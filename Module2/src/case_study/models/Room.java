package case_study.models;

import java.time.LocalDate;

public class Room extends Facility {
    private String serviceFree;

    public Room() {
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String serviceName, double usableArea, double rentalCost, int maximumNumberPeople, LocalDate rentalType, String serviceFree) {
        super(serviceName, usableArea, rentalCost, maximumNumberPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }
}
