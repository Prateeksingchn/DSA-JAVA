package Assignment;

import java.util.Scanner;

public class PrintLargestandSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int first = input.nextInt();

        System.out.print("Enter Second Number: ");
        int second = input.nextInt();

        System.out.print("Enter Third Number: ");
        int third = input.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);

        System.out.printf("The largest number among %d, %d, and %d is: %d%n", first, second, third, largest);
        System.out.printf("The smallest number among %d, %d, and %d is: %d%n", first, second, third, smallest);

        input.close();
    }

    static int largest(int first, int second, int third) {
        int max = first;
        if(second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }

    static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        return min;
    }
}
