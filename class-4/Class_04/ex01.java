

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ex01 {
    public static void main(String[] args) {

        var array = new int[10];
        var random = new Random();

        for(int count = 0;count < array.length; count++){

            array[count] = random.nextInt(50)+1;

        }

        int maior = array[0];
        int menor = array[0];

        for(int countB = 1;countB < array.length; countB++){

            if(array[countB] > maior){

                maior = array[countB];

            }
            if(array[countB] < menor){
                menor = array[countB];
            }

        }

        System.out.println(Arrays.toString(array));
        System.out.println("maior valor : "+maior);
        System.out.println("menor valor: "+menor);

    }
}
