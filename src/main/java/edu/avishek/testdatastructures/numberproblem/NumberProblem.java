package edu.avishek.testdatastructures.numberproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberProblem {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        NumberProblem problem = new NumberProblem();

        try {
            System.out.println("Enter Size of Array: ");
            int size = Integer.parseInt(br.readLine());

            int[] numbers = new int[size];
            System.out.println("Enter the numbers: ");

            for(int i=0; i<size; i++) {
                numbers[i] = Integer.parseInt(br.readLine());
            }

            System.out.println("Enter target sum: ");
            int target = Integer.parseInt(br.readLine());

            problem.numberProblem(numbers, target);

        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void numberProblem(int[] numbers, int target) {
        int size = numbers.length;
        int[] resultArray = new int[2];

        int upperLimit = 0;

        for (int i = 0; i < size; i++) {
            if(numbers[i] > target) {
                upperLimit = i--;
                break;
            }
        }

        for (int number : numbers) {
            for (int j = 1; j < upperLimit; j++) {
                if(number == numbers[j]) {
                    j += 1;
                    break;
                }
                if (number + numbers[j] == target) {
                    resultArray[0] = number;
                    resultArray[1] = numbers[j];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(resultArray));
    }
}
