import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;
        int j;

        System.out.print("Digite o tamanho do quadrado: ");
        int tamanho = scanner.nextInt();

        if(tamanho <= 0 || tamanho > 10){
            System.out.println("Tamanho inválido");
        }else{
            for(i=1 ; i <= tamanho ; i++){
                for(j=1 ; j <= tamanho ; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
}