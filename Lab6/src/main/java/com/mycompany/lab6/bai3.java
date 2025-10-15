

package com.mycompany.lab6;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

class SinhVien {
    String hoTen;
    String email;
    String soDienThoai;
    String cmnd;

    
    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();

        
        while (true) {
            System.out.print("Nhap email: ");
            email = sc.nextLine();
            if (kiemTraEmail(email)) {
                break;
            } else {
                System.out.println("-> Email khong dung dinh dang. Vui long nhap lai!");
            }
        }

        
        while (true) {
            System.out.print("Nhap so dien thoai: ");
            soDienThoai = sc.nextLine();
            if (kiemTraSoDienThoai(soDienThoai)) {
                break;
            } else {
                System.out.println("-> So dien thoai khong dung (phai 10 chu so, bat dau bang 0). Vui long nhap lai!");
            }
        }

        
        while (true) {
            System.out.print("Nhap CMND: ");
            cmnd = sc.nextLine();
            if (kiemTraCMND(cmnd)) {
                break;
            } else {
                System.out.println("-> CMND khong dung (phai 9 hoac 12 chu so). Vui long nhap lai!");
            }
        }
    }

    
    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("So dien thoai: " + soDienThoai);
        System.out.println("CMND: " + cmnd);
    }

    
    boolean kiemTraEmail(String email) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(regex, email);
    }

    boolean kiemTraSoDienThoai(String sdt) {
        String regex = "^0\\d{9}$";
        return Pattern.matches(regex, sdt);
    }

    boolean kiemTraCMND(String cmnd) {
        String regex9 = "^\\d{9}$";
        String regex12 = "^\\d{12}$";
        return Pattern.matches(regex9, cmnd) || Pattern.matches(regex12, cmnd);
    }
}
