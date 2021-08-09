package bai_14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter list[" + i + "] values:");
            list[i] = input.nextInt();
        }
        System.out.print("Your input list: ");
        for (int value : list) {
            System.out.print(value + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int selectElement = list[i];
            int j = i - 1;
            boolean check = false;
            while (j >= 0 && list[j] > selectElement) {
                System.out.println("change in value index " + (j + 1) + " to " + list[j]);
                list[j + 1] = list[j];
                j--;
                check = true;
            }
            if (check) {
                System.out.println("change in value index " + (j + 1) + " to " + selectElement);
                list[j + 1] = selectElement;
            }
            System.out.print("List after the  " + i + "' sort: ");
            for (int value : list) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
