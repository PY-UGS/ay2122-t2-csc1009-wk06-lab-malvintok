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
        System.out.print("List before adding: ");
        for (int index = 0; index < list.size(); index++){
            System.out.print(list.get(index) + " ");
        }
    }

    public void addAndSort(LinkedList<Integer> list, int value){}

    public void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo){}

    public void findValue(LinkedList<Integer> list, int searchVal){}
}