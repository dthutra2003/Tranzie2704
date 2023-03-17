package bai_8;

import java.util.Scanner;

public class Bai_8 {

    public static void main(String[] args) {
        int arr[], size, sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập kích cỡ mảng(n): ");
        size = scanner.nextInt();
        
        arr = new int[size];
        
        System.out.println("Nhập dãy số trong mảng");
        for(int i = 0; i < size; i++) {
            System.out.printf("Số thứ %d: ", i + 1);
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
       
        System.out.printf("Trung bình cộng của dãy là: %.2f\n", 1.0 * sum / size);
    }
    
}
