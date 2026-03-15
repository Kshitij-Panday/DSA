import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.add(70);
//        list.add(80);
//        list.add(90);
//        list.add(100);
//        list.add(110);
//        list.add(120);
//        list.add(130);
//        list.add(140);
//        list.add(150);
//        list.add(160);
//
//        System.out.println(list.contains(200));
//        System.out.println(list.contains(150));
//        System.out.println(list);
//        list.set(0, 69);
//        list.remove(1);
//        System.out.println(list);
//        for (int i = 0; i < 5; i++) {
//            list.add(input.nextInt());
//        }
//        for (int i = 0; i <5; i++) {
//            System.out.println(list.get(i)); //pass index here , list[index] doesn't work here.
//
//        }
        //Multi dimensional array using ArrayList

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i= 0; i < 4; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0 ; i < 4 ; i++) {
            for (int j = 0; j < 4; j++) {
                list.get(i).add(input.nextInt());
                
            }   

        }
        System.out.println(list);
    }
}
