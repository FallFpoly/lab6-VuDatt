
package com.mycompany.lab6;

import java.util.ArrayList;
import java.util.Scanner;


public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> danhSach = new ArrayList<>();

        // Nhập 5 sinh viên
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhap(sc);
            danhSach.add(sv);
            System.out.println();
        }

        // Xuất danh sách sinh viên
        System.out.println("==== DANH SACH SINH VIEN ====");
        for (SinhVien sv : danhSach) {
            sv.xuat();
            System.out.println("----------------------------");
        }

        sc.close();
    }
}
