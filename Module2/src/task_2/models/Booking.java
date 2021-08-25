package task_2.models;

import java.time.LocalDate;
import java.util.Date;

public class Booking extends Facility{
    private int bookingCode;
    private LocalDate firstDay;
    private LocalDate lastDay;
    private int customerCode;

    public Booking() {
    }

    public Booking(int bookingCode, LocalDate firstDay, LocalDate lastDay, int customerCode) {
        this.bookingCode = bookingCode;
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.customerCode = customerCode;
    }

    public Booking(int bookingCode, int customerCode) {
        this.bookingCode = bookingCode;
        this.customerCode = customerCode;
    }

    public Booking(String serviceName, double usableArea, double rentalCost, int maximumNumberPeople, LocalDate rentalType, int bookingCode, LocalDate firstDay, LocalDate lastDay, int customerCode) {
        super(serviceName, usableArea, rentalCost, maximumNumberPeople, rentalType);
        this.bookingCode = bookingCode;
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.customerCode = customerCode;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public LocalDate getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(LocalDate firstDay) {
        this.firstDay = firstDay;
    }

    public LocalDate getLastDay() {
        return lastDay;
    }

    public void setLastDay(LocalDate lastDay) {
        this.lastDay = lastDay;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode=" + bookingCode +
                ", firstDay=" + firstDay +
                ", lastDay=" + lastDay +
                ", customerCode=" + customerCode +
                '}';
    }
}
