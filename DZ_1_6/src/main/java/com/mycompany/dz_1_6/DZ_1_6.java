/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dz_1_6;

import java.util.Scanner;

/**
 *
 * @author dmirtypoluektov
 */
public class DZ_1_6 {

    public static void main(String[] args) {
        
        System.out.println("Practical task 1.6, Student Dmitry Poluektov, RIBO-01-22, Variant 3");
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Выберите номер врача (1/2): ");
        int doctorNum = scan.nextInt();

        Doctor doctor = new Doctor();

        if (doctorNum == 1) {
            doctor = new Doctor1();
        } else if (doctorNum == 2) {
            doctor = new Doctor2();
        } else {
            System.out.println("Невозможный номер врача");
            return;
        }

        System.out.println("Введите рецепт: ");
        scan.nextLine();
        String originalText = scan.nextLine();

        doctor.writeRecipe(originalText);
        System.out.println(doctor);
        
    }
}

