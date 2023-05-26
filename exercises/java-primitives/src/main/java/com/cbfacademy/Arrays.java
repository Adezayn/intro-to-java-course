package com.cbfacademy;

public class Arrays {
    public static void listOfArrays(){
        Integer[] intArray = {1, 9, 2, 8, 3, 0, 6, 0};
        Float[]   floatArray = {10.0F, 1.5F, 5.99F, 16F, 62F, 142F, 10.0F, 19.0F, 48.0F, 31.0F, 71.0F, 19.0F };
        Double[] doubleArray = new Double[5];
        doubleArray[0] = 8.9;
        doubleArray[1] = 10D;
        doubleArray[2] = 22.32;
        doubleArray[3] = 3.1;
        doubleArray[4] = 13D;
        Boolean[] booleanArray = new Boolean[6];
        booleanArray[0] = true;
        booleanArray[1] = true;
        booleanArray[2] = false;
        booleanArray[3] = true;
        booleanArray[4] = false;

        System.out.println(intArray[4] + " --5th element of int array--");
        System.out.println(floatArray[4] + " --5th element of float array--");
        System.out.println(doubleArray[4] + " --5th element of double array--");
        System.out.println(booleanArray[4] + " --5th element of boolean array--");

        Object[][] matrixObjects = {
            intArray, 
            floatArray,
            booleanArray,
            doubleArray
        };
        System.out.println(matrixObjects[1][5]);

        Integer[] intArray2 = {4, 19, 62, 80, 34, 20, 67, 0};
        Integer[] intArray3 = {15, 39, 21, 8, 3, 50, 6, 0};
        Integer[] intArray4 = {1, 39, 2, 18, 43};

        // TWO DIMENSIONAL ARRAY
        Integer[][] matrixObjects1 = {
            intArray, 
            intArray2,
            intArray3,
            intArray4
        };
        System.out.println(matrixObjects1[2][4]);

        int[][][] threeDimensionalArray = {
            {{1, 2, 3}, {4, 5, 6}},
            {{7, 8, 9}, {10, 11, 12}},
            {{13, 14, 15}, {16, 17, 18}}
        };
        System.out.println(threeDimensionalArray[1][0][2]);

        int[][][] threeDimensionalArray2 = {
            {{1, 2, 3}, {4, 5, 6}},
            {{7, 8, 9}, {10, 11, 12}},
            {{13, 14, 15}}
        };
        System.out.println(threeDimensionalArray2[2][0][2]);

    }
}
