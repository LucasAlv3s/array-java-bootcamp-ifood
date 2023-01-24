package arraysifood;
/*
 * Faça um programa q leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
 */
import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6]; //6 = 6 lugares
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            // pra ignorar quando for letra.equalsIgnoreCase(anotherString: "")
            
            if ( !(letra.equalsIgnoreCase(anotherString: "a") | letra.equalsIgnoreCase(anotherString: "e")|
            letra.equalsIgnoreCase(anotherString: "i") | 
            letra.equalsIgnoreCase(anotherString: "u")  
            )) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;

        } while(count < consoantes.lenght);

        System.out.println("Consoantes: ");
        for ( String consoante : consoantes) { //for each -> vai ler só esses elementos
            if ( consoante != null)
            System.out.print(consoante + " ");
        }

        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.lenght);
    }
}
