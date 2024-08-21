package Main;

import Exceptions.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");

        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");

        int parametroDois = terminal.nextInt();

         try {
             int total = contar(parametroUm, parametroDois);
             for (int mI = 1; mI <= total; mI++) {
                 System.out.println("Imprimindo o número " + mI);
             }
         } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
         }
    }
    static int contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        int contagem = (parametroDois - parametroUm);

        if (contagem < 0)
            throw new ParametrosInvalidosException();

        return contagem;
    }
}






