package com.anastasiia.loops.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperatorsControlFlowToTest {
    public static void main(String[] args) {
        int[] studentList = new int[]{1001, 1002};
        char[][] studentsGrades = new char[][]{{'A', 'A', 'A', 'B'}, {'A', 'B', 'B'}};
        double[] results = calculateGPA(studentList, studentsGrades);
        System.out.println(Arrays.toString(results));

        int[] studentsByGPA = getStudentsByGPA(3, 3.5, studentList, studentsGrades);
        System.out.println(Arrays.toString(studentsByGPA));
    }

    public static int getGrade(char gradeLetter) {
        switch (gradeLetter) {
            case 'A':
                return 4;
            case 'B':
                return 3;
            case 'C':
                return 2;
            default:
                return 0;
        }
    }

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        double[] averages = new double[studentIdList.length];
        for (int i = 0; i < studentIdList.length; i++) {
            char[] grades = studentsGrades[i];
            double sum = 0;
            for (char g : grades) {
                sum = sum + getGrade(g);
            }
            double average = (sum / grades.length);
            average = Math.round(average * 100D) / 100D;
            averages[i] = average;
        }

        return averages;
    }

    public static int[] getStudentsByGPA(double lower,
                                         double higher,
                                         int[] studentIdList,
                                         char[][] studentsGrades) {

        if (lower > higher) {
            return null;
        }
        if (studentIdList == null || studentsGrades == null) {
            return null;
        }
        if (studentIdList.length != studentsGrades.length) {
            return null;
        }

        double[] gpas = calculateGPA(studentIdList, studentsGrades);

        List<Integer> studentsResult = new ArrayList<>();

        for (int i = 0; i < gpas.length; i++) {
            if (gpas[i] >= lower && gpas[i] <= higher) {
                studentsResult.add(studentIdList[i]);
            }
        }

        int[] resAsArray = new int[studentsResult.size()];
        for (int i = 0; i < studentsResult.size(); i++) {
            resAsArray[i] = studentsResult.get(i);
        }
        return resAsArray;
    }

}

