import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of integers to compare:");
        int numbersCount = scanner.nextInt();

        int smallestNumber = Integer.MAX_VALUE; // Initialize with a very large value to ensure it gets updated correctly

        for (int i = 0; i < numbersCount; i++) {
            System.out.println("Enter integer #" + (i + 1) + ":");
            int number = scanner.nextInt();

            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }

        System.out.println("The smallest number is: " + smallestNumber);

        if (smallestNumber < 10) {
            System.out.println("The smallest number is less than 10!");
        } else {
            System.out.println("The smallest number is equal to or greater than 10!");
        }


        int numberOfGrades = 20;
        int grade1Count = 0;
        double sumGradesAbove5 = 0;
        int countGradesAbove5 = 0;
        double sumGradesBelow4 = 0;
        int countGradesBelow4 = 0;
        double totalSum = 0;

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.println("Enter the grade of student #" + (i + 1) + " (between 1 and 7):");
            double grade = scanner.nextDouble();

            if (grade == 0) {
                System.out.println("Error: Grade cannot be 0. Exiting the program.");
                break;
            }

            if (grade == 1) {
                grade1Count++;
            }

            if (grade > 5) {
                sumGradesAbove5 += grade;
                countGradesAbove5++;
            } else if (grade < 4) {
                sumGradesBelow4 += grade;
                countGradesBelow4++;
            }

            totalSum += grade;
        }

        double averageGradesAbove5 = countGradesAbove5 > 0 ? sumGradesAbove5 / countGradesAbove5 : 0;
        double averageGradesBelow4 = countGradesBelow4 > 0 ? sumGradesBelow4 / countGradesBelow4 : 0;
        double totalAverage = numberOfGrades > 0 ? totalSum / numberOfGrades : 0;

        System.out.println("Number of grade 1s: " + grade1Count);
        System.out.println("Average of grades above 5: " + averageGradesAbove5);
        System.out.println("Average of grades below 4: " + averageGradesBelow4);
        System.out.println("Total average: " + totalAverage);


        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int result = 0;

        for (int i = 0; i < Math.abs(num2); i++) {
            if (num2 < 0) {
                result -= num1;
            } else {
                result += num1;
            }
        }

        System.out.println("The result of the multiplication is: " + result);
    }

}
