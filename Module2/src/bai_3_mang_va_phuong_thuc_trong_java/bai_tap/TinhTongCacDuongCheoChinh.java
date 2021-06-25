package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacDuongCheoChinh {
    public static int sumDiagonalLine(int col,int row, int[][] array) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==j) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
    public static int sumDiagonalLineReverse(int col,int row, int[][] array) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==(col-1-j)) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int column;
        do {
            System.out.println("Enter row");
            row = input.nextInt();
            System.out.println("Enter column");
            column = input.nextInt();
            if (row != column) {
                System.out.println("Enter row = column ");
            }
        } while (row != column);
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            System.out.println("");
            for (int j = 0; j < column; j++) {
                System.out.print("Enter array[" + i + "][" + j + "]= ");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Sum diagonal line favorable is: " + sumDiagonalLine(column, row, array));
        System.out.println("Sum diagonal line reverse is: " + sumDiagonalLineReverse(column, row, array));
    }
}
