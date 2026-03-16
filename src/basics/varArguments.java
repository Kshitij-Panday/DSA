package basics;

import java.util.Arrays;

public class varArguments {
    public static void main(String[] args) {
        fun(1,2,3,45,678,9,8,765,432,34,567,654,32,34567);

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
