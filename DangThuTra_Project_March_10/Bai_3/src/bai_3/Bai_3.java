
package bai_3;

import java.util.Scanner;


public class Bai_3 {

   
    public static void main(String[] args) {
       int yob;
       String name;
        Scanner nhapSoTuBanPhim = new Scanner (System.in); 
       System.out.printf("Nhập vào tên: ");
       name = nhapSoTuBanPhim.nextLine();
       
       System.out.printf("Nhập vào năm sinh: ");
       yob = nhapSoTuBanPhim.nextInt();
       int tuoi;
       tuoi = 2023 -yob;
       if(tuoi < 16){
           System.out.println(" Bạn "+ name + " ở độ tuổi vị thành niên ");
           // cách 2 để hiển thị System.out.printf("Bạn %s ở độ tuổi vị thành niên",name);
       }else if(tuoi >= 16 & tuoi < 18){
                System.out.println("Bạn" + name + " ở độ tuổi trưởng thành");
             }else
                System.out.println("Bạn" + name + " đã già");
         
       
    }
    
}
