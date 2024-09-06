import java.util.Scanner;

//5) Escreva um programa que inverta os caracteres de um string.
//
//        IMPORTANTE:
//        a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
//        b) Evite usar funções prontas, como, por exemplo, reverse;
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();

        for (int i = frase.length() -1 ; i >= 0; i--){
            System.out.print(frase.charAt(i) + " ");
        }

    }
}
