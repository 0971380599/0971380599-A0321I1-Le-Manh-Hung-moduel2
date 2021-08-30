package case_study.services;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        facilityIntegerMap.put(new Villa("villa", 200, 3000000, 5, "ngay", "căn hộ cao cấp", 50, 2), Villa.valueVilla());
    }
    private static Scanner input = new Scanner(System.in);
    @Override
    public void displayListFacility() {
        for (Map.Entry<Facility,Integer> facilityIntegerEntry : facilityIntegerMap.entrySet()) {
            System.out.println("Service : " + facilityIntegerEntry.getKey() + "number of hires: " + facilityIntegerEntry.getValue());
        }
    }

    @Override
    public void addNewFacility() {
        int choice =0;
        System.out.println("1. Add new Villa");
        System.out.println("2. Add new House");
        System.out.println("3. Add new Room");
        System.out.println("4. Back Facility Management");
        try {
            choice = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        switch (choice) {
            case 1: {
                addNewVilla();
                break;
            }
            case 2: {
                addNewHouse();
                break;
            }
            case 3: {
                addNewRoom();
                break;
            }
            case 4: {
                break;
            }
        }
    }

    @Override
    public void addNewVilla() {
        System.out.println("Enter serviceName :");
        input.nextLine();
        String serviceName = input.nextLine();
        System.out.println("Enter usableArea :");
        double usableArea = input.nextDouble();
        System.out.println("Enter rentalCost :");
        double rentalCost = input.nextDouble();
        System.out.println("Enter maximumNumberPeople :");
        int maximumNumberPeople = input.nextInt();
        input.nextLine();
        System.out.println("Enter rentalType :");
        String rentalType = input.nextLine();
        System.out.println("Enter roomStandard :");
        String roomStandard = input.nextLine();
        System.out.println("Enter swimmingPoolArea :");
        double swimmingPoolArea = input.nextDouble();
        System.out.println("Enter numberOfFloors :");
        int numberOfFloors = input.nextInt();
        Villa villa = new Villa(serviceName,usableArea,rentalCost,maximumNumberPeople,rentalType,roomStandard,swimmingPoolArea,numberOfFloors);
        facilityIntegerMap.put(villa,Villa.valueVilla());
        System.out.println("successfully added new villa");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter serviceName :");
        input.nextLine();
        String serviceName = input.nextLine();
        System.out.println("Enter usableArea :");
        double usableArea = input.nextDouble();
        System.out.println("Enter rentalCost :");
        double rentalCost = input.nextDouble();
        System.out.println("Enter maximumNumberPeople :");
        int maximumNumberPeople = input.nextInt();
        input.nextLine();
        System.out.println("Enter rentalType :");
        String rentalType = input.nextLine();
        System.out.println("Enter serviceFree :");
        String serviceFree = input.nextLine();
        Room room = new Room(serviceName,usableArea,rentalCost,maximumNumberPeople,rentalType,serviceFree);
        facilityIntegerMap.put(room, Room.valueRoom());
        System.out.println("successfully added new room");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter serviceName :");
        input.nextLine();
        String serviceName = input.nextLine();
        System.out.println("Enter usableArea :");
        double usableArea = input.nextDouble();
        System.out.println("Enter rentalCost :");
        double rentalCost = input.nextDouble();
        System.out.println("Enter maximumNumberPeople :");
        int maximumNumberPeople = input.nextInt();
        input.nextLine();
        System.out.println("Enter rentalType :");
        String rentalType = input.nextLine();
        System.out.println("Enter roomStandard :");
        String roomStandard = input.nextLine();
        System.out.println("Enter numberOfFloors :");
        int numberOfFloors = input.nextInt();
        House house = new House(serviceName,usableArea,rentalCost,maximumNumberPeople,rentalType,roomStandard,numberOfFloors);
        facilityIntegerMap.put(house,House.valueHouse());
        System.out.println("successfully added new house");
    }


    @Override
    public void displayListFacilityMaintenance() {

    }
}
