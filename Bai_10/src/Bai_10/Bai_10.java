package Bai_10;

import java.util.Scanner;

public class Bai_10 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhap vao mot chuoi khong qua 80 ky tu: ");
	        String str = scanner.nextLine();

	        System.out.print("Nhap vao mot ky tu bat ky: ");
	        char ch = scanner.nextLine().charAt(0);

	        int count = 0;
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == ch) {
	                count++;
	            }
	        }

	        System.out.println("So lan xuat hien cua ky tu " + ch + " trong chuoi la: " + count);
	    }

}
