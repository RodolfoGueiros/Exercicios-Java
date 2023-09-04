package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Informe o(a) nome do(a) aluno(a): ");
        student.name = sc.nextLine();

        System.out.println("Informe a nota do primeiro trimestre: ");
        student.firstPoint = sc.nextDouble();

        System.out.println("Informe a nota do segundo trimestre: ");
        student.secondPoint = sc.nextDouble();

        System.out.println("Informe a nota do terceiro trimestre: ");
        student.thirdPoint = sc.nextDouble();

        System.out.printf("Notal Final: %.2f%n", student.finalScore());

        if(student.finalScore() < 60){
            System.out.println("FAILED");
            System.out.printf("Faltam %.2f POINTS%n ", student.missingPoint());
        }else {
            System.out.println("PASS");
        }


    }
}