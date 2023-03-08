
package bai_4;

import java.util.Scanner;


public class Bai_4 {

    
    public static void main(String[] args) {
       int month;
        Scanner nhapSoNguyenTuBanPhim = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên: ");
        month = nhapSoNguyenTuBanPhim.nextInt();
        
        switch(month){
            case 1: 
                System.out.println("Tháng Giêng");
                break;
            case 2:
                System.out.println("Tháng Hai");
                break;
            case 3:
                System.out.println("Tháng Ba");
                break;
            case 4:
                System.out.println("Tháng Tư");
                break;
            case 5:
                System.out.println("Tháng Năm");
                break;
            case 6:
                System.out.println("Tháng Sáu");
                break;
            case 7:
                System.out.println("Tháng Bảy");
                break;
            case 8:
                System.out.println("Tháng Tám");
                break;
            case 9:
                System.out.println("Tháng Chín");   
                break;
            case 10:
                System.out.println("Tháng Mười");
                break;
            case 11:
                System.out.println("Tháng Mười Một");
                break;
            case 12:
                System.out.println("Tháng Mười Hai");
                break;
            default:
                System.out.println("Không có tháng nào hết");
                break;
        } 
        
    }
    
}
