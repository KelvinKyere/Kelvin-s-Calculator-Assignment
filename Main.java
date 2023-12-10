/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author KELVIN
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of courses
        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        // Arrays to store course names, credit units, and scores
//        double[] myGradePoint;
//        double size = numCourses;
        String[] courseNames = new String[numCourses];
        int[] creditUnits = new int[numCourses];
        double[] scores = new double[numCourses];
        

        // Input information for each course
        for (int i = 0; i < numCourses; i++) {
            System.out.println("\nEnter details for Course " + (i + 1) + ":");
            System.out.print("Course Name: ");
            courseNames[i] = scanner.next();
            System.out.print("Credit Units: ");
            creditUnits[i] = scanner.nextInt();
            System.out.print("Score: ");
            scores[i] = scanner.nextDouble();
        }

        // Calculate grades and print the table
        System.out.println("\nGrades and Credit Units Table:");
        System.out.println("----------------------------------------");
        System.out.printf("%-15s%-15s%-15s%-15s%n", "Course", "Credit Units", "Grade-Unit", "Grade");
        System.out.println("----------------------------------------");

        for (int i = 0; i < numCourses; i++) {
            String grade = getGrade(scores[i]);
            int gradePoint = getGradePoint(scores[i]);
            
            System.out.printf("%-15s%-15d%-15d%-15s%n", courseNames[i], creditUnits[i], gradePoint, grade);
        }

        System.out.println("----------------------------------------");
        
         // Calculate grades and print the table
        System.out.println("\nGrades and Credit Units Table:");
        System.out.println("--------------------------------------");
        System.out.printf("%-15s%-15s%-15s%-15s%n", "Course", "Credit Units", "Grade-Unit", "Grade");
        System.out.println("--------------------------------------");

        int totalQualityPoints = 0;
        int totalGradeUnits = 0;

        for (int i = 0; i < numCourses; i++) {
            String grade = getGrade(scores[i]);
            int gradePoint = getGradePoint(scores[i]);

            totalQualityPoints += gradePoint * creditUnits[i];
            totalGradeUnits += creditUnits[i];

            System.out.printf("%-15s%-15d%-15d%-15s%n", courseNames[i], creditUnits[i], gradePoint, grade);
        }

        double gpa = (double) totalQualityPoints / totalGradeUnits;

        System.out.println("--------------------------------------");
         // Format GPA to two decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedGPA = df.format(gpa);

        System.out.println("\nTotal GPA: " + formattedGPA);

        scanner.close();
    }

    // Method to calculate the grade based on the score
   private static String getGrade(double score) {
    char grade;
    switch ((int) score / 10) {
        case 9:
        case 10:
            grade = 'A';
            break;
        case 8:
            grade = 'B';
            break;
        case 7:
            grade = 'C';
            break;
        case 6:
            grade = 'D';
            break;
        case 4:
        case 5:
            grade = 'E';
            break;
        default:
            grade = 'F';
    }
    return String.valueOf(grade);
}

// Method to calculate the gradepoint based on the score
private static int getGradePoint(double score) {
    int gradePoint;
    switch ((int) score / 10) {
        case 9:
        case 10:
            gradePoint = 5;
            break;
        case 8:
            gradePoint = 4;
            break;
        case 7:
            gradePoint = 3;
            break;
        case 6:
            gradePoint = 2;
            break;
        case 4:
        case 5:
            gradePoint = 1;
            break;
        default:
            gradePoint = 0;
    }
    return gradePoint;
}

//       private static double gpaCal(){
//       for (int i = 0; i < numCourses; i++) {
//            String grade = calculateGrade(scores[i]);
//            int gradePoint = calculateGradePoint(scores[i]);
//
//            totalGradePoints += gradePoint * creditUnits[i];
//            totalCreditUnits += creditUnits[i];
//
//            System.out.printf("%-15s%-15d%-15d%-15s%n", courseNames[i], creditUnits[i], gradePoint, grade);
//        }
//
//        double gpa = (double) totalGradePoints / totalCreditUnits;
//        return gpa;

//        System.out.println("----------------------------------------");
//        System.out.println("Total GPA: " + gpa);
//    }
       }
        

