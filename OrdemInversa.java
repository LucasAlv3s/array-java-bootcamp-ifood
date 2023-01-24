package arraysifood;
/*
 * Crie um vetor de 6 numeros inteiros
 * e mostre-os na ordem inversa.
 */
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-5, -6, 15, 50, 8, 4};
        //Laços sem usar o for each
        //System.out.prinln(vetor.lenght);
  
        //vai usar o while pra mostrar as posições do array(q começam em 0)
        
        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.lenght)){
            System.out.prinln(vetor[count]);
            count++;
        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.lenght - 1); i >= 0; i --){ //-1 pq o lenght conta o 0 tbm
            System.out.print(vetor[i] + " ");
        }
    }
}