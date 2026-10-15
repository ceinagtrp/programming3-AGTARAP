
package week5;

import java.util.Scanner;
import java.util.Arrays;

public class WEEK5 {

    static class Student {
        String name;
        int[] quizzes;
        double average;

        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;

            int sum = 0;

            for (int score : quizzes) {
                sum += score;
            }

            average = (double) sum / quizzes.length;
        }
    }

    public static int linearSearch(Student[] students, String targetName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(targetName)) {
                return i;
            }
        }

        return -1;
    }

    public static void sortStudents(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("-------------------BASIC-------------------");

        String[] favorites = {
            "Beach",
            "Movies",
            "Fries",
            "Sleeping",
            "Music"
        };

        System.out.println("MY FAVORITE THINGS");

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total number of favorites: " + favorites.length);

        System.out.println("\n\n----------------INTERMEDIATE----------------");

        int[] grades = {85, 90, 78, 92, 88, 76, 95, 80};

        int sum = 0;
        int highest = grades[0];
        int lowest = grades[0];

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];

            if (grades[i] > highest) {
                highest = grades[i];
            }

            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        double average = (double) sum / grades.length;

        System.out.println("\n===== CLASS STATISTICS =====");
        System.out.println("Total Number of Students: " + grades.length);
        System.out.println("Sum of Scores: " + sum);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        System.out.println("\n------------------ADVANCED------------------");

        int[] scores = {85, 92, 78, 95, 88, 76, 90};
        int target = 88;
        int index = -1;

        System.out.println("Original Scores: " + Arrays.toString(scores));

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Target Score: " + target);
            System.out.println("Score found at index: " + index);
        } else {
            System.out.println("Target Score " + target + " not found.");
        }

        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("Original Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array:   " + Arrays.toString(sortedScores));

        System.out.println("\n\n-------------------EXPERT-------------------");

        String[] names = {
            "Jocein",
            "Risha",
            "Cherisha",
            "Louis",
            "John"
        };

        int[][] rawQuizData = {
            {90, 85, 88, 92},
            {95, 90, 93, 94},
            {80, 85, 82, 85},
            {95, 90, 93, 94},
            {88, 86, 90, 92}
        };

        Student[] students = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], rawQuizData[i]);
        }

        sortStudents(students);

        System.out.println("\n========== CLASS RANKING SYSTEM ==========");
        System.out.printf("%-8s %-12s %-12s%n", "RANK", "NAME", "AVERAGE");
        System.out.println("------------------------------------------");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average != students[i - 1].average) {
                rank = i + 1;
            }

            System.out.printf(
                "%-8d %-12s %-12.2f%n",
                rank,
                students[i].name,
                students[i].average
            );
        }

        System.out.println("------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String targetName = input.nextLine();

        int foundIndex = linearSearch(students, targetName);

            if (foundIndex != -1) {
        int studentRank = foundIndex + 1;

            while (foundIndex > 0
            && students[foundIndex].average
            == students[foundIndex - 1].average) {
                studentRank--;
                foundIndex--;
    }

        System.out.println(targetName + "'s rank: " + studentRank);
} else {
        System.out.println(targetName + " not found.");
}
    }
}
