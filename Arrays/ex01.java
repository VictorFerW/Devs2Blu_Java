package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ex01 {
    
    public static void main(String[] args) {

        System.out.println("Digite a atividade");

        for(int i = 1; i <= 10 ; i++){

            System.out.println("'"+i+"' ="+i+"º");

        }

       
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        switch (num) {

            case 1:

            EX1();

            break;

            case 2:

            EX2();

            break;

            case 3:

            EX3();

            break;

            case 4:

            EX4();

            break;

            case 5:

            EX5();

            break;

            case 6:

            EX6();

            break;

            case 7:

            EX7();

            break;

            case 8:

            EX8();

            break;

            case 9:

            EX9();

            break;

            case 10:

            EX10();

            break;

        }




    }

    public static void EX1(){


    int[] numeros = {10, 20, 30, 40, 50};

    // Exibe o terceiro elemento do array (índice 2)
    System.out.println("O terceiro elemento do array é: " + numeros[2]);

    }

    public static void EX2(){


        String[] strings = {"foo", "bar", "baz"};
        char primeiraLetra = strings[1].charAt(0);
        System.out.println("A primeira letra da segunda string é " + primeiraLetra);
  

    }

    public static void EX3(){

        int[] numeros = new int[10];
        Random gerador = new Random();
        
        // Preenche o array com números aleatórios entre 0 e 99
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = gerador.nextInt(100);
        }
        
        // Exibe todos os números do array
        System.out.println("Números gerados: " + Arrays.toString(numeros));
        
        // Exibe apenas os números pares
        System.out.println("Números pares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }


    }

    public static void EX4(){

        int[] numeros = {1, 2, 3, 4, 5, 6};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        double media = soma / (double) numeros.length;

        System.out.println("Média: " + media);

    }

    public static void EX5(){

        double[] numeros = {2.5, 3.7, 1.9, 4.2};
        double soma = 0;

        for (double numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);

    }

    public static void EX6(){

        int[] numeros = new int[5];

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < numeros.length; i++) {
              System.out.print("Digite o " + (i + 1) + "º número: ");
              numeros[i] = sc.nextInt();
            }
        }
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
          if (numeros[i] > maior) {
            maior = numeros[i];
          }
        }
    
        System.out.println("O maior número digitado foi: " + maior);

    }

    public static void EX7(){

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um texto: ");
            String texto = input.nextLine().toLowerCase(); // converte o texto para minúsculo
            char[] caracteres = texto.toCharArray(); // transforma o texto em um array de caracteres
            int contador = 0;

            for (char c : caracteres) { // percorre cada caractere do array
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    contador++; // incrementa o contador se o caractere for uma vogal
                }
            }

            System.out.println("O texto digitado tem " + contador + " vogais.");
        }


    }

    public static void EX8(){

        try (Scanner sc = new Scanner(System.in)) {
            // Recebe o tamanho do array
            System.out.print("Digite o tamanho do array: ");
            int n = sc.nextInt();

            int[] array = new int[n];

            // Recebe os valores do array
            for (int i = 0; i < n; i++) {
                System.out.printf("Digite o %dº elemento: ", i+1);
                array[i] = sc.nextInt();
            }

            // Ordena o array em ordem crescente
            Arrays.sort(array);

            // Exibe o array ordenado
            System.out.println("Array ordenado em ordem crescente:");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }

        


    }

    public static void EX9(){

        try (Scanner sc = new Scanner(System.in)) {
            // Lê o tamanho do array
            System.out.print("Digite o tamanho do array: ");
            int n = sc.nextInt();

            // Cria o array com o tamanho especificado
            int[] array = new int[n];

            // Lê os elementos do array
            for (int i = 0; i < n; i++) {
                System.out.printf("Digite o %dº elemento: ", i + 1);
                array[i] = sc.nextInt();
            }

            // Lê o número M
            System.out.print("Digite o valor de M: ");
            int m = sc.nextInt();

            // Calcula a quantidade de elementos do array que são maiores que M
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > m) {
                    count++;
                }
            }

            // Exibe o resultado
            System.out.printf("Existem %d elementos maiores que %d no array.\n", count, m);
        }

       

    }

    public static void EX10(){

        Scanner sc = new Scanner(System.in);

        // Recebe o tamanho do array
        System.out.print("Digite o tamanho do array: ");
        int n = sc.nextInt();

        // Cria o array
        double[] numeros = new double[n];

        // Recebe os valores do usuário
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i+1) + "o valor: ");
            numeros[i] = sc.nextDouble();
        }

        // Ordena o array em ordem decrescente
        Arrays.sort(numeros);
        double segundoMaior = numeros[n-2];

        System.out.println("O segundo maior valor é: " + segundoMaior);

        sc.close();

    }

}
