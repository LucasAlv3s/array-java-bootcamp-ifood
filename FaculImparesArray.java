public class Main {
    public static void main(String[] args) {
                // declaração de vetor
                int[] vetor = new int[10];

                // declaração de variáveis
                int i = 0, slot = 0;

                do{
                    // validação números ímpares
                    if(i % 2 == 1){
                        vetor[slot] = i;
                        slot++;
                    }
                    i++;
                }while(slot < 10);

                // zerando o valor de i
                i = 0;

                // imprimindo os números ímpares
                for(; i < vetor.length; i++){
                    System.out.println(vetor[i]);
                }
            }
        }