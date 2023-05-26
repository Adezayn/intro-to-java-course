package com.cbfacademy;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        float float1 = 10.4F;
        float float2 = 5.11F;
        float float3 = 8F;
System.out.println("------------float operations---------------\n");
        System.out.println(float1 * float2);
        System.out.println(float1 / float2);
        System.out.println(float1 + float2);
        System.out.println(float1 - float2);

        double double1 = 20.00;
        double double2 = 12.17;
        double double3 = 8;
        System.out.println("------------double operations---------------\n");
        System.out.println(double1 * double2);
        System.out.println(double1 / double2);
        System.out.println(double1 + double2);
        System.out.println(double1 - double2);
        System.out.println("------------mixed double and float operations---------------\n");
        System.out.println(double1 * float2);
        System.out.println(float1 / double2);
        System.out.println(double2 + float2);
        System.out.println(float1 - double2);

        Object value1 = double1 * float2;
        Object value2 = float1 / double2;
        Object value3 = (double2 + float2);
        Object value4 = float1 - double2;
        Object value5 = double1 + double2;
        Object value6 = float1 - float2;

        System.out.println("------------data types operations---------------\n");
        Class<?> dataType = value1.getClass();
        System.out.println("The data type is: " + dataType.getName());

        Class<?> dataType1 = value2.getClass();
        System.out.println("The data type is: " + dataType1.getName());

        Class<?> dataType2 = value3.getClass();
        System.out.println("The data type is: " + dataType2.getName());

        Class<?> dataType3 = value4.getClass();
        System.out.println("The data type is: " + dataType3.getName());

        Class<?> dataType4 = value5.getClass();
        System.out.println("The data type is: " + dataType4.getName());

        Class<?> dataType5 = value6.getClass();
        System.out.println("The data type is: " + dataType5.getName());

        System.out.println("------------relational operators---------------\n");
        System.out.println(double1 == double2);
        System.out.println(double1 > double2);
        System.out.println(double2 < double1);
        System.out.println(double3 == float3);

        System.out.println("------------unary operations---------------\n");
        int number1 = 43;
        int number2 = 2;

        System.out.println(number1++);
        System.out.println(++number2);
        System.out.println(number1);

        System.out.println("-------------arrays------------------\n");
        Arrays.listOfArrays();
    }
}
