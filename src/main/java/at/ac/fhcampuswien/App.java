package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class App {

    // Implement all methods as public static

    public static void oneMonthCalendar(int day, int first) {
        int count = 0;
        int Week = 7 - first;

        for (int i = 0; i < first - 1; i++) {
            System.out.print("   ");
        }

        for (int i = 0; i < day; i++) {
            System.out.printf(String.format("%2d", (i + 1)) + " ");

            if (i == Week) {
                count = 7;
            }

            if (count % 7 == 0 && count >= 7) {
                System.out.println();
            }

            if (i + 1 == day && count % 7 != 0) {
                System.out.println();
            }

            count++;
        }

        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
    public static long[] lcg(long seed) {
        long[] array = new long[10];
        long x;
        long m = (long) Math.pow(2, 31);
        int c = 12345;
        long a = 1103515245;

        for (int y = 0; y < array.length; y++) {
            if (y == 0) {
                x = seed;
            } else {
                x = array[y - 1];
            }
            array[y] = (a * x + c) % m;
        }
        return array;
    }




    }