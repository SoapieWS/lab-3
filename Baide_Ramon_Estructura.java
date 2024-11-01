/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baide_ramon_estructura;

import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Baide_Ramon_Estructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner (System.in);
        int op;
        System.out.println("Menu");
        System.out.println("1. Palabra al reves");
        System.out.println("2. Numero perfecto");
        System.out.println("3. Primos");
        System.out.println("4. Votaciones");
        System.out.println("0. Salir");
        op = entrada .nextInt();
        
        switch (op){
            case 1:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        String palabraAlReves = new StringBuilder(palabra).reverse().toString();

        System.out.println("La palabra al revés es: " + palabraAlReves);
            
            case 2:
                Scanner numeroperfecto = new Scanner(System.in);
                System.out.print("Ingresa un número: ");
        int numero = numeroperfecto.nextInt();

        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }

        
    }

        public static boolean esNumeroPerfecto(int numero){
        int sumaDivisores = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == numero;
        
        
            case 3:
            Random random = new Random();
        int numero = random.nextInt(100) + 1;  // Genera un número aleatorio entre 1 y 100

        ArrayList<Integer> divisores = obtenerDivisores(numero);
        boolean esPrimo = (divisores.size() == 2); // Un número es primo si solo tiene dos divisores: 1 y el mismo número

        if (esPrimo) {
            System.out.println("El número " + numero + " es primo porque solo tiene dos divisores.");
        } else {
            System.out.println("El número " + numero + " no es primo porque tiene más de dos divisores.");
        }

        System.out.println("Divisores de " + numero + " son: " + divisores);
        System.out.println("Número de divisores: " + divisores.size());
    }

    public static ArrayList<Integer> obtenerDivisores(int numero) {
        ArrayList<Integer> divisores = new ArrayList<>();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }

        return divisores;
    }
}
        
        }
    }
            
}
