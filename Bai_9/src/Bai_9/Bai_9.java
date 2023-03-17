package Bai_9;

import java.util.Scanner;

public class Bai_9 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi: ");
        String str = scanner.nextLine();

        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        System.out.println("So ky tu hoa trong chuoi: " + upperCount);
        System.out.println("So ky tu thuong trong chuoi: " + lowerCount);
        System.out.println("So chu so trong chuoi: " + digitCount);
    }

}
