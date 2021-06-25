package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoTrong1CotXacDinh {
    public static int SumCol(int col,int row, int[][] array) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += array[i][col];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row");
        int row = input.nextInt();
        System.out.println("Enter column");
        int column = input.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            System.out.println("");
            for (int j = 0; j < column; j++) {
                System.out.print("Enter array[" + i + "][" + j + "]= ");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter Column need to sum: ");
        int columnSum = input.nextInt();
        System.out.println("Sum of column "+ column + " is: " + SumCol(columnSum, row, array));
    }
}
