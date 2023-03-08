
package bai_1;

import java.util.Scanner;


public class Bai_1 {

    
    public static void main(String[] args) {
            int number1, number2;
            
            Scanner nhapTuBanPhim  = new Scanner(System.in);
                    // khai báo đối tượng nhập vào từ bàn phím 
            System.out.print("Nhập số thứ 1: ");
            
            number1 = nhapTuBanPhim.nextInt();
            System.out.print("Nhập số thứ 2: ");
            number2 = nhapTuBanPhim.nextInt();
            System.out.printf("Tổng: %d\n", number1 + number2);
            System.out.printf("Hiệu: %d\n", number1 - number2);
            System.out.printf("Tích: %d\n", number1 * number2);
            System.out.printf("Thương: %.2f\n", (float)number1 / number2);//1.0*number 1 / number
            // muốn lấy 2 số sau số thực thì %.2f
            System.out.printf("Chia lấy dư: %d\n", number1 % number2);
            
            
            System.out.printf("Số lớn hơn là: %d\n", number1>number2?number1:number2);
            
            
            
    }
    
}
