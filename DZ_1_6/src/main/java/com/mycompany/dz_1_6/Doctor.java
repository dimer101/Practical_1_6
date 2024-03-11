/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz_1_6;

/**
 *
 * @author dmirtypoluektov
 */
public class Doctor {
    
    public void writeRecipe(String originalText) {
        System.out.println("Текст рецепта: " + originalText);
    }

    @Override
    public String toString() {
        return "Доктор - общий";
    }
}