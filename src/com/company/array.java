package com.company;

public class array {
        public static void main(String[] arg) {

            String[][] arr = new String[2][3];// init
            //add values
            for (int row = 0; row < arr.length; row++) {

                for (int col = 0; col < arr[row].length; col++) {
                    arr[row][col] = row + "-" + col;

                }
                System.out.println();
            }
            //add

            //print
            for (int row = 0; row < arr.length; row++) {

                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col]+"  ");

                }
                System.out.println();
            }
        }

    }

