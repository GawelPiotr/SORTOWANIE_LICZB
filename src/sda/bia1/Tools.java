package sda.bia1;

import java.util.List;
import java.util.Map;

public class Tools {

    public static void print(int... number){
        System.out.println("VARARGS");

        for (int nn : number){
            System.out.println(nn);
        }

        System.out.println("VARARGS");
    }

    public static void print(String[] params){
        System.out.println("PARAMS");

        for (String paramiter : params){
            System.out.println(paramiter);
        }

        System.out.println("PARAMS");
    }

    public static void print(Integer[] array) {
        for (Integer integer : array)
            System.out.printf("%3d", integer);
        System.out.println();
    }

    public static void print(List<Integer> list) {
        for (Integer integer : list)
            System.out.printf("%3d", integer);
        System.out.println();
    }
    public static boolean print(Map<String,String> list) {
        for (String integer : list.keySet())
            System.out.printf("%3d", integer);
        System.out.println();

        return true;
    }
}
