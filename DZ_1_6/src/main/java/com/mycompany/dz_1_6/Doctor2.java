/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz_1_6;

/**
 *
 * @author dmirtypoluektov
 */
public class Doctor2 extends Doctor {
    
    @Override
    public void writeRecipe(String originalText) {
        String transformedText = "Вот ваш рецепт: " + originalText;
        System.out.println("Преобразованный текст рецепта: " + transformedText);
    }

    @Override
    public String toString() {
        return "Доктор: 2";
    }
}
