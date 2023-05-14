package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ex02 {
    

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

        List<String> frutas = new ArrayList<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");


    }

    public static void EX2(){


        // criando uma lista vazia
        List<String> frutas = new ArrayList<String>();
        
        // adicionando elementos à lista
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        
        // exibindo o conteúdo da lista
        System.out.println(frutas);

    }

    public static void EX3(){

        List<Double> lista = new ArrayList<>();
        Random random = new Random();

        // Adiciona 10 valores aleatórios na lista
        for (int i = 0; i < 10; i++) {
            lista.add(random.nextDouble() * 10);
        }

        // Calcula a média dos valores da lista
        double media = lista.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(Double.NaN);

        System.out.println("Valores da lista: " + lista);
        System.out.println("Média dos valores: " + media);


    }

    public static void EX4(){

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("João", 20));
        pessoas.add(new Pessoa("Maria", 25));
        pessoas.add(new Pessoa("Pedro", 18));
        
        Collections.sort(pessoas);
        
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome() + " - " + p.getIdade());
        }



    }
    
    public static void  EX5(){


        List<String> lista = new ArrayList<>();
        lista.add("casa");
        lista.add("carro");
        lista.add("bicicleta");
        lista.add("avião");

        lista.removeIf(s -> s.contains("a"));

        System.out.println(lista);


    }
    
    public static void EX6(){

    
        List<Produto_EX6> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto_EX6("Produto A", 10.0));
        listaProdutos.add(new Produto_EX6("Produto B", 5.0));
        listaProdutos.add(new Produto_EX6("Produto C", 7.5));
        listaProdutos.add(new Produto_EX6("Produto D", 3.0));
        listaProdutos.add(new Produto_EX6("Produto E", 20.0));

        // Ordena a lista pelo preço
        Collections.sort(listaProdutos, new Comparator<Produto_EX6>() {
            public int compare(Produto_EX6 p1, Produto_EX6 p2) {
                if (p1.getPreco() < p2.getPreco()) {
                    return -1;
                } else if (p1.getPreco() > p2.getPreco()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        // Exibe a lista ordenada por preço
        for (Produto_EX6 p : listaProdutos) {
            System.out.println(p.getNome() + " - " + p.getPreco());
        }


    }

    public static void EX7(){

        List<Integer> lista1 = new ArrayList<>();
    lista1.add(1);
    lista1.add(2);
    lista1.add(3);
    lista1.add(4);

    List<Integer> lista2 = new ArrayList<>();
    lista2.add(3);
    lista2.add(4);
    lista2.add(5);
    lista2.add(6);

    List<Integer> intersecao = new ArrayList<>();
    for (Integer i : lista1) {
      if (lista2.contains(i)) {
        intersecao.add(i);
      }
    }

    System.out.println("Interseção: " + intersecao);

    }    

    public static void EX8(){

        List<Pessoas> pessoas = new ArrayList<>();
        pessoas.add(new Pessoas("João", 20));
        pessoas.add(new Pessoas("Maria", 16));
        pessoas.add(new Pessoas("Pedro", 25));
        pessoas.add(new Pessoas("Ana", 14));

        List<Pessoas> maioresDeIdade = pessoas.stream()
                .filter(p -> p.getIdade() >= 18)
                .toList();

        List<Pessoas> menoresDeIdade = pessoas.stream()
                .filter(p -> p.getIdade() < 18)
                .toList();

        System.out.println("Maiores de idade: " + maioresDeIdade);
        System.out.println("Menores de idade: " + menoresDeIdade);



    }

    public static void EX9(){

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("João", 8.5));
        alunos.add(new Aluno("Maria", 9.0));
        alunos.add(new Aluno("Pedro", 7.5));
        alunos.add(new Aluno("Ana", 6.0));
        alunos.add(new Aluno("Lucas", 8.0));
        alunos.add(new Aluno("Mariana", 9.5));

        double soma = 0.0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }
        double media = soma / alunos.size();

        System.out.println("Média das notas dos alunos: " + media);



    }

    public static void EX10(){

        List<String> lista = new ArrayList<>();
        lista.add("banana");
        lista.add("abacaxi");
        lista.add("uva");
        lista.add("laranja");
        lista.add("melancia");

        // Ordena a lista por ordem alfabética inversa
        Collections.sort(lista, Comparator.reverseOrder());

        // Exibe a lista ordenada
        for (String fruta : lista) {
            System.out.println(fruta);
        }


    }


    

    }



