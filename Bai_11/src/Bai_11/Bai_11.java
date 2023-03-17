package Bai_11;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_11 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhap so phan tu cua mang: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Nhap gia tri cho tung phan tu cua mang:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("arr[" + i + "] = ");
	            arr[i] = scanner.nextInt();
	        }

	        // Sap xep mang tang dan
	        Arrays.sort(arr);

	        System.out.println("Mang so ban dau: " + Arrays.toString(arr));
	        System.out.println("Mang da sap xep tang dan: " + Arrays.toString(arr));
	    }

}
