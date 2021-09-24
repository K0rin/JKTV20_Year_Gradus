/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20_year_gradus_final;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author Владимир
 */
public class JKTV20_year_gradus_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] year = new int [12][];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        year[0] = new int[31]; //март
        year[1] = new int[30]; //апрель
        year[2] = new int[31]; //май
        year[3] = new int[30]; //июнь
        year[4] = new int[31]; //июль
        year[5] = new int[31]; //август
        year[6] = new int[30]; //сентябрь
        year[7] = new int[31]; //октябрь
        year[8] = new int[30]; //ноябрь
        year[9] = new int[31]; //декабрь
        year[10] = new int[31]; //январь
        year[11] = new int[28]; //февраль
        
        for(int i = 0; i < 3; i++){
            for(int k = 0; k < year[i].length; k++){
                year[i][k] = random.nextInt(15 - (-5) + 1) - 5;
            }
        }
        
        for(int i = 3; i < 6; i++){
            for(int k = 0; k < year[i].length; k++){
                year[i][k] = random.nextInt(30 - 15 + 1) + 15;
            }
        }
        
        for(int i = 6; i < 9; i++){
            for(int k = 0; k < year[i].length; k++){
                year[i][k] = random.nextInt(15 - 0 + 1) + 0;
            }
        }
        
        for(int i = 9; i < year.length; i++){
            for(int k = 0; k < year[i].length; k++){
                year[i][k] = random.nextInt(0 - (-30) + 1) - 30;
            }
        }
        
//        System.out.println("matrix = ");
//        for(int i = 0; i < year.length; i++){
//            for(int k = 0; k < year[i].length; k++){
//                System.out.print(year[i][k]);
//                System.out.print(",");
//            }
//            System.out.println();
//        }

        System.out.println("Введите месяц");
        int m = scanner.nextInt();
        System.out.println("Введите день");
        int d = scanner.nextInt();
        System.out.format("темпиратура %d%n", year[m][d]);
        IntStream intStream = Arrays.stream(year[m]);
        IntStream intStream2 = Arrays.stream(year[m]);
        OptionalInt optionalIntMax = intStream.max();
        OptionalInt optionalIntMin = intStream2.min();
        int max = optionalIntMax.getAsInt();
        int min = optionalIntMin.getAsInt();
        System.out.println("Максимальная темпиратура в этом месяце = " + max);
        System.out.println("Максимальная темпиратура в этом месяце = " + min);
        
        
    }
    
}
