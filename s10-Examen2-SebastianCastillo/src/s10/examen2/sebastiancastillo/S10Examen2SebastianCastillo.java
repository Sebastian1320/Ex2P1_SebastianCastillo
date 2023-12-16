/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s10.examen2.sebastiancastillo;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class S10Examen2SebastianCastillo {
    static Random rng=new Random();
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        System.out.println("***** M E N U *****");
        System.out.println("1. Matrices");
        System.out.println("2. Cadenas");
        System.out.println("0. Para salir");
        int op = leer.nextInt();
        while (op != 0) {
            switch (op) {
                case 1:
                    System.out.println("Ingrese el largo");
                    int m = leer.nextInt();
                    System.out.println("Ingrese el ancho");
                    int n = leer.nextInt();
                    int matriz[][] = Matrices(n,m);
                    Matrices pepito=new Matrices(matriz);
                    String print= imprimir(matriz);
                    JOptionPane.showMessageDialog(null,print);
                    break;
                case 2:
                    System.out.println("Ingrese una cadena ");
                    String Cadenas = teclado.nextLine();
                    Cadenas pepe=new Cadenas(Cadenas);
                    boolean si=pepe.vocales(Cadenas);
                    if(si==true){
                        System.out.println("Vocales seguidas");
                    }else if(si==false){
                        System.out.println("Vocales no seguidas");
                    }
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
            System.out.println("***** M E N U *****");
            System.out.println("1. Matrices");
            System.out.println("2. Cadenas");
            System.out.println("0. Para salir");
            op = leer.nextInt();
        }
    }
    public static String imprimir(int[][]matriz){
        String print=" ";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               print="["+ matriz[i][j]+"]";
            }
            print="\n";
        }
        return print;
    }
    public static int [][] Matrices(int n,int m){
       int temporal[][] = new int [n][m];
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                temporal[n][m]=rng.nextInt(10);
            }
        }
       return temporal;
    }
}
