import java.util.ArrayList;

class CustomStack<T>{
    private final ArrayList<T> stackArray;
    private int pointer;
    public CustomStack(){
        stackArray = new ArrayList<T>();
        pointer = 0;
    }

    public void push(T el){
        stackArray.add(el);
        pointer++;
    }

    public T pop(){
        if(!this.isEmpty()){
            pointer--;
            return stackArray.get(pointer);
        }
        return null;
    }

    public boolean isEmpty(){
        return pointer == 0;
    }
}

public class Ex2 {
    public static void main(String args[]){
        var stack = new CustomStack<Number>();
        stack.push(2.5);
        stack.push(100);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
