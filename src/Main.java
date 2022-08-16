import java.util.*;

public class Main {
    public static void main(String[] args) {

      /*  0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
       Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын. Башында 0дор жана аягында 1лер.*/

        Random random = new Random();
        int [] array = new  int [10];
        List<Integer> integerArrayList = new ArrayList<>();
        List<Integer> integerLinkedList = new LinkedList<>();


        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(2);
            integerArrayList.add(random.nextInt(2));
            integerLinkedList.add(random.nextInt(2));

        }

        System.out.println( " Before "  + Arrays.toString(array));
        sort(array);
        System.out.println( " After "  + Arrays.toString(array));
        System.out.println(" before ArrayList " + integerArrayList);
        sortArrayList(integerArrayList);
        System.out.println("after LinkedList " + integerLinkedList);
        System.out.println(" brfore LinkedList " + integerLinkedList);
        sortLinkedLIst(integerLinkedList);
        System.out.println("after LinkedList " + integerLinkedList);
    }
    public static void sort (int[] array){
      Arrays.sort(array);
    }
    public  static void sortArrayList (List<Integer> arrayList){
        Collections.sort(arrayList);
    }
    public static void sortLinkedLIst (List<Integer> linkedList){
        Collections.sort(linkedList);
    }
}