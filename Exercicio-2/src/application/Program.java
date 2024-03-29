package application;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Informe a largura do retangulo: ");
        retangulo.largura = sc.nextDouble();

        System.out.println("Informe a altura do retangulo: ");
        retangulo.altura = sc.nextDouble();

        System.out.printf("Area: %.2f%n", retangulo.Area());
        System.out.printf("Perimetro: %.2f%n", retangulo.Perimetro());
        System.out.printf("Diagonal: %.2f", retangulo.Diagonal());

        sc.close();
    }
}