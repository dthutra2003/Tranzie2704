
package bai_2;

import java.util.Scanner;


public class Bai_2 {

    
    public static void main(String[] args) {
        int number1;
        Scanner nhapSoTuBanPhim = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        number1 = nhapSoTuBanPhim.nextInt();
        
        if(number1 / 2 == 0)
            System.out.println("Đây là số chẵn");
        else
            System.out.println("Đây là số lẻ");
        
        
            
        
    }
    
}
