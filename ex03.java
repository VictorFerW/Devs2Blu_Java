

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex03 {
    

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<Integer>(); 
        var scanner = new Scanner(System.in);
        
        System.out.println("Quantos indices tem o array? ");
        var arrayLength = scanner.nextInt();

        for(int i = 0;i < arrayLength; i++){
            System.out.println("Digite o numero interiro: ");
            numberList.add(scanner.nextInt());

        }

            for(int i = 0;i < arrayLength - 1; i++){
                var num1 = numberList.get(i);
                var num2 = numberList.get(i + 1);

                if(num1 + num2 == 10){
                    System.out.printf("Por que soma 10 encontrado, são eles: %s e %s", num1);
                    return;
                }
            }
        


    }



}
