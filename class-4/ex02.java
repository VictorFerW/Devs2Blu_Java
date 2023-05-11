package Class_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex02 {
    
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<Integer>();

        try (var scanner = new Scanner(System.in)) {
            for(int i = 0; i < 5; i++){

                System.out.printf("Digite um numero de posição %s: ", i);
                numberList.add(scanner.nextInt());

            }
        }

        System.out.println("Ordenação nicial: "+ numberList);
        Collections.reverse(numberList);
        System.out.println("Ordenaçãp ao contrario "+ numberList);
    }

}
