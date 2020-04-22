package LearnJavaTheHardWay;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class VariableChangeShortcuts {
    public static void main(String[] args) {
        int i, j, k;

        i = 5;
        j = 5;
        k = 5;
        System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
        i = i + 3;
        j = j - 3;
        k = k * 3;
        System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

        i = 5;
        j = 5;
        k = 5;
        System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
        i += 3; // i= 5, it will make i = 8
        j -= 3; // j = 5, it will make j = 2
        k *= 3; // k = 5, it will make k = 15
        System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

        i = j = k = 5;
        System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
        i += 1; // i = 5, it will make i = 6
        j -= 2; // j = 5, it will make j = 3
        k *= 3; // k = 5, it will make k = 15
        System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

        i = j = 5;
        System.out.println( "i: " + i + "\tj: " + j );
        i =+ 1; // oops --> it will change the value of i to 1.
        j =-2; // oops --> it will change the  value of j to -2
        System.out.println( "i: " + i + "\tj: " + j + "\n" );

        i = j = 5;
        System.out.println( "i: " + i + "\tj: " + j );
        i++; // incremented by 1 -> 5 becomes 6
        j--; // decremented by 1 -> 5 becomes 4
        System.out.println( "i: " + i + "\tj: " + j);
    }
}
