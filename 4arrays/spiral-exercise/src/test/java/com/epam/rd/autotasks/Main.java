package com.epam.rd.autotasks;

public class Main {
    public static void main(String[] args) {
        {
            int[][] spiral = Spiral.spiral(3, 4);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        {
            int[][] spiral = Spiral.spiral(4, 3);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        {
            int[][] spiral = Spiral.spiral(5, 6);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        {
            int[][] spiral = Spiral.spiral(5, 5);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
    }
}

class Spiral {
    static int[][] spiral(int row, int column) {

            int[][] result = new int[row][column];
            int count = 0;
            int top = 0;
            int left = 0;
            int bottom = row - 1;
            int right = column - 1;

            while (left < right && top < bottom) {
                for (int j = left; j <= right; j++) {
                    result[top][j] = ++count;
                }
                top++;
                for (int i = top; i <= bottom; i++) {
                    result[i][right] = ++count;
                }
                right--;
                for (int j = right; j >= left; j--) {
                    result[bottom][j] = ++count;
                }
                bottom--;
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = ++count;
                }
                left++;

            }
            if (top == bottom && left <= right) {
                for (int j = left; j <= right; j++) {
                    result[top][j] = ++count;
                }

            } else if (top < bottom && left == right) {
                for (int i = top; i <= bottom; i++) {
                    result[i][left] = ++count;
                }
            }
            return result;



    }
}
