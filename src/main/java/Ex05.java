import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex05 {
    //    이터레이터(Iterator) 와 제너레이터(Generator)
//  반복자 for while switch case
//    for-each 반복문으로 각각의 값을 순회해서 출력


    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black", "White", "Green", "Red"));
        // for-each loop
        for (String color : colors) {
            System.out.print(color + "  ");
        }
        System.out.println();

        // for loop
        for (int i = 0; i < colors.size(); ++i) {
            System.out.print(colors.get(i) + "  ");
        }
        System.out.println();

        // using iterator
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();

        // using listIterator
        ListIterator<String> listIterator = colors.listIterator(colors.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + "  ");
        }
        System.out.println();


        System.out.println(" ----- 값 존재 확인 -------- ");
//  값이 존재하는지만 알고 싶은 경우 contains()를 사용 - 값이 있는 경우 true를, 값이 없는 경우 false를 리턴
//  값이 존재할 때 어느 위치에 존재하는지 알고 싶은 경우 indexOf()를 사용 - 값있음 해당 엘레멘트의 인덱스를 리턴, 값 없음 -1 리턴

        ArrayList<String> colors2 = new ArrayList<>(Arrays.asList("Black", "White", "Green", "Red"));
        boolean contains = colors2.contains("Black");
        System.out.println(contains);

        int index = colors2.indexOf("Blue");
        System.out.println(index);

        index = colors2.indexOf("Red");
        System.out.println(index);

    }

}
