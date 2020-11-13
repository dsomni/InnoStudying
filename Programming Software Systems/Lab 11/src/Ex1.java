import java.util.*;

class Library<T>{
    private ArrayList<T> list;
    public Library() {
        list = new ArrayList<T>();
    }
    public void addToLibrary(T el){
        list.add(el);
    }
    public T getElement(int i){
        try{
            return list.get(i);
        }catch (Exception e){
            System.out.println("Index is out of range");
            return null;
        }
    }

    public void printElements(){
        for (T el: list) {
            System.out.println(el.toString());
        }
    }
}
class NewsPaper{
    private String name;
    public NewsPaper(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "NewsPaper{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Ex1 {
    public static void main(String args[]){
        var npLibrary = new Library<NewsPaper>();
        npLibrary.addToLibrary(new NewsPaper("1"));
        npLibrary.addToLibrary(new NewsPaper("2"));
        npLibrary.printElements();
    }
}
