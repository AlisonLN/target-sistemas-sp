import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o
//        próximo valor sempre será a soma dos 2 valores anteriores
//        (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
//        escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de
//        Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer number = sc.nextInt();

        verificaFibonacci(number);

    }
    private static void verificaFibonacci(Integer number) {

        List<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);
        Integer position = 2;
        boolean estaNaLista = false;

        while (estaNaLista == false){
            fibo.add(fibo.get(position - 2)+ fibo.get(position - 1));
            if (fibo.get(position) == number){
                System.out.println(" O número informado pertence");
                estaNaLista = true;
            }
            else if (number < fibo.get(position)){
                System.out.println("O número informado não pertence");
                estaNaLista = true;
            }
            position += 1;
        }
    }
}
