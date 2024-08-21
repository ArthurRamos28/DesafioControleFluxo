package Dao;

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
             System.out.println(total);
         } catch (ParametrosInvalidosException e) {
             System.out.println("O segundo parâmetro é menor que o primeiro parâmetro.");
         }
    }
    static int contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        int contagem = (parametroDois - parametroUm);

        if (contagem < 0)
            throw new ParametrosInvalidosException();

        return contagem;
    }
}






