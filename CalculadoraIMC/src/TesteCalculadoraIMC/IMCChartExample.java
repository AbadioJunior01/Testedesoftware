package TesteCalculadoraIMC;

import javax.swing.*;

public class IMCChartExample {
    public static void main(String[] args) {
        
        String alturaInput = JOptionPane.showInputDialog("Digite sua altura em metros: ");
        String pesoInput = JOptionPane.showInputDialog("Digite seu peso em quilogramas: ");
        
        alturaInput = alturaInput.replace(',', '.');
        pesoInput = pesoInput.replace(',', '.');

        double altura = Double.parseDouble(alturaInput);
        double peso = Double.parseDouble(pesoInput);

        double imc = calcularIMC(peso, altura);
        String categoria = categorizarIMC(imc);

        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\nCategoria de IMC: " + categoria);

    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String categorizarIMC(double imc) {
        if (imc >= 18.5 && imc <= 24.9) {
            return "Saudável";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}