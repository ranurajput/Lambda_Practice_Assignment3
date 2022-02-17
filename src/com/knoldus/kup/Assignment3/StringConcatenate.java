package com.knoldus.kup.Assignment3;
import java.util.Locale;
public class StringConcatenate {
    public static void main(String... args){
        // Lambda Expression
        ConcatString change = (s1,s2,s3,s4,s5,s6,s7) -> (s1+s2+s3+s4+s5+s6+s7).toUpperCase(Locale.ROOT);
        String s = change.changeString("The", "lambda", "has", "too", "many", "string", "arguments");
        System.out.println("Compiled by Ranu Rajput");
        System.out.println("Upper case concatenated String is " + s); //Output -> Upper case concatenated String is THELAMBDAHASTOOMANYSTRINGARGUMENTS
    }
}
