import java.util.ArrayList;
import java.util.Arrays;

public class Ex04 {
//    컬렉션 arraylist map set

    public static void main(String[] args) {

        System.out.println("--------------------------");
        System.out.println("Create ArrayList");
        System.out.println("--------------------------");

        ArrayList<Integer> integers1 = new ArrayList<Integer>(); // 타입 지정
        ArrayList<Integer> integers2 = new ArrayList<>(); // 타입 생략 가능
        ArrayList<Integer> integers3 = new ArrayList<>(10); // 초기 용량(Capacity) 설정
        ArrayList<Integer> integers4 = new ArrayList<>(integers1); // 다른 Collection값으로 초기화
        ArrayList<Integer> integers5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // Arrays.asList()


        System.out.println("integers1 = " + integers1);
        System.out.println("integers2 = " + integers2);
        System.out.println("integers5 = " + integers3);
        System.out.println("integers4 = " + integers4);
        System.out.println("integers5 = " + integers5);


        System.out.println("--------------------------");
        System.out.println("insert elements to ArrayList");
        System.out.println("--------------------------");


        ArrayList<String> colors = new ArrayList<>();
        // add() method
        colors.add("Black");
        colors.add("White");
        colors.add(0, "Green");
        colors.add("Red");

        // set() method
        colors.set(0, "Blue");

        System.out.println("inserted color print " + colors);

        System.out.println("--------------------------");
        System.out.println("delete elements to ArrayList");
        System.out.println("--------------------------");


        ArrayList<String> colors2 = new ArrayList<>(Arrays.asList("Black", "White", "Green", "Red"));
        String removedColor = colors2.remove(0);
        System.out.println("Removed color is " + removedColor);

        colors2.remove("White");
        System.out.println(colors2);

        colors2.clear();
        System.out.println("deleted color print " + colors2);


    }


}
