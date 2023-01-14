package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float x1, x2, x3, x4;

        Vetor4D v1 = new Vetor4D(-1, 2, 3, -4);
        Vetor4D v2 = new Vetor4D(5, 6, -7, 10);
        Vetor4D v3 = new Vetor4D(0, -4, -2, 15);

        v1.imprimir();
        v2.imprimir();
        v3.imprimir();

        System.out.println("\nValor absoluto vetor 1:");
        float absoluto = v1.valorAbsoluto(v1.getX1(), v1.getX2(), v1.getX3(), v1.getX4());
        System.out.println(absoluto);
        System.out.println("\n");
        

        System.out.println("Valor absoluto vetor 2:");
        float absoluto2 = v2.valorAbsoluto(v2.getX1(), v2.getX2(), v2.getX3(), v2.getX4());
        System.out.println(absoluto2);
        System.out.println("\n");
        
        
        System.out.println("Valor absoluto vetor 3:");
        float absoluto3 = v3.valorAbsoluto(v3.getX1(), v3.getX2(), v3.getX3(), v3.getX4());
        System.out.println(absoluto3);
        System.out.println("\n");
        
        
        Vetor4D v4 = new Vetor4D();
        v4 = v1.soma(v2);
        
        System.out.println("Somas:\n");
        
        System.out.println(v4.getX1());
        System.out.println(v4.getX2());
        System.out.println(v4.getX3());
        System.out.println(v4.getX4());

    }

}
