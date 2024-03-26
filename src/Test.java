import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the date of birth in the format dd/MM/yyyy
        System.out.println("Enter the date of birth (Format dd/MM/yyyy):");
        String dateOfBirthStr = sc.nextLine();

        // Create a SimpleDateFormat object to parse the string into a Date object
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dateOfBirth = null;
        try {
            dateOfBirth = sdf.parse(dateOfBirthStr);
        } catch (ParseException e) {
            System.out.println("Error parsing the date of birth.");
            e.printStackTrace();
            return;
        }

        // Get the current date
        Date currentDate = new Date();

        // Calculate the difference in milliseconds between the dates
        long millisecondsDifference = currentDate.getTime() - dateOfBirth.getTime();

        // Convert the difference to approximate years
        long yearsDifference = millisecondsDifference / (1000L * 60 * 60 * 24 * 365);

        System.out.println("The approximate age is: " + yearsDifference + " years.");


        System.out.println("Enter a date of birth in the format yyyy-MM-dd:");
        String dateStr = sc.next();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dateOfBirth1 = null;
        try {
            dateOfBirth = df.parse(dateStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Date currentDate1 = new Date();

        // Create a date pattern with year, month, and day in numeric format
        df = new SimpleDateFormat("yyyyMMdd");

        // Convert both the current date and the date of birth into integers containing year, month, and day
        int from = Integer.parseInt(df.format(dateOfBirth));
        int to = Integer.parseInt(df.format(currentDate));

        // Then subtract both dates and divide by 10000 to remove decimals and
        // leave the date in tens or hundreds
        int age = (to - from) / 10000;
        System.out.println("The age is: " + age);


        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner1.nextDouble();

        // Calculate the area using the formula: area = PI * r^2
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circle with radius " + radius + " is: " + area);


        double area1; // the area to calc

        double radio; // radio to enter
        System.out.println("Enter the radio circumference: ");
        radio = scanner.nextDouble();
        area1 = Math.PI * Math.pow(radio, 2);

        System.out.println("The are of the a radio circumference: " + radio + " is: " + area1);

    }

}
