package Bai_8;

import java.util.Scanner;

public class Bai_8 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong so nguyen: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap so thu %d: ", i + 1);
            int number = scanner.nextInt();
            sum += number;
        }

        double average = (double) sum / n;
        System.out.printf("Trung binh cong cua %d so nguyen la: %.2f", n, average);
    }

}
