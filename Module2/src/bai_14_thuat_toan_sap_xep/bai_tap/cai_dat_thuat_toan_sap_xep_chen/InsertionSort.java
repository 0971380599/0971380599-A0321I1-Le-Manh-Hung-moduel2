package bai_14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

public class InsertionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void insertionSortByStep(double[] list) {
        for (int i = 1; i < list.length; i++) {
            double selectElement = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > selectElement) {
                list[j + 1] = list[j];
                j--;
            }
                list[j + 1] = selectElement;
        }
    }
    public static void main(String[] args) {
        insertionSortByStep(list);
        for (double v : list) System.out.print(v + "  ");
    }
}
