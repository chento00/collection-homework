import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private T data;
    public Box(T data) {this.data = data;}
    public T getData() {return this.data;}
    public void setData(T data) {this.data = data;}
}
public class test {
    public static  <T> T doSomething(T input) {
        // do something with the input
        return input;
    }
    public static  <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }


    public static void printList(List<? extends Number> list){
        for (Number n : list) {
            System.out.print(n +" ");	}
    }
    public static void addNumbers(List<? super Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
    }


    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        addNumbers(numList);
        for (Number n : numList) {
            System.out.print(n+" ");
        }
    }
}
