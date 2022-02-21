import java.util.LinkedList;

public class LinkedListMain {
    public LinkedListMain() {}

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        System.out.println("List before adding: ");
        for (int index = 0; index < list.size(); index++){
            System.out.print(list.get(index) + " ");
        }
        addAndSort(list, 6);
        swapValues(list, 2, 5);
    }

    public static void addAndSort(LinkedList<Integer> list, int value){
        for (int index = 0; index < list.size(); index++){
            if(value >= list.get(index) && value < list.get(index + 1)){
                list.add(index + 1, value);
                break;
            }
        }
        System.out.println("\nList after adding: ");
        for (int index = 0; index < list.size(); index++){
            System.out.print(list.get(index) + " ");
        }
    }

    public static void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo){
        if (list.get(indexOne) == list.get(indexTwo)){
            System.out.println("\nSame values, no swap");
        }
        else {
            int temp = list.get(indexOne);
            list.remove(indexOne);
            list.add(indexOne, list.get(indexTwo - 1));
            list.remove(indexTwo);
            list.add(indexTwo, temp);
            System.out.println("\nList after swapping: ");
            for (int index = 0; index < list.size(); index++){
                System.out.print(list.get(index) + " ");
            }
        }
    }

    public void findValue(LinkedList<Integer> list, int searchVal){}
}