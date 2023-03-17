package Bai_12;

import java.util.Scanner;

public class Bai_12 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so hang cua ma tran: ");
        int rows = scanner.nextInt();

        System.out.print("Nhap so cot cua ma tran: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Nhap gia tri cho cac phan tu cua ma tran
        System.out.println("Nhap gia tri cho cac phan tu cua ma tran:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Tim phan tu lon nhat trong ma tran
        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Phan tu lon nhat trong ma tran la: " + max);
    }
}
