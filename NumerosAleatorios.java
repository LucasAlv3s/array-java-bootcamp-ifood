package arraysifood;
/*
 * Faça um programa q leia 20 numeros inteiros aleatorios (entre 0 e 100) armazene-os num vetor.
 * Ao final mostre os números e seus sucessores.
 */
import java.util.Random;
import java.util.Scanner;

 public class Ex3_NumerosAleatorios{
    public static void main(String[] args){
        Random random = new Random();

        int numerosAleatorios[] = new int[20];

        System.out.print("Numeros Aleatorios: ");
        for( int i = 0; i < numerosAleatorios.lenght ; i++ ) {
            int numero = random.nextInt(bound: 100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Sucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios0) {
            System.out.println((numero+1) + " ");
        }

    }
 }