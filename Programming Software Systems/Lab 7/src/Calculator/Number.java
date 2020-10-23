package Calculator;

public class Number {
    int value;

    public static boolean isNumber(char c){
        return (int)(c)>47 && (int)(c)<58;
    }

    public Number(int value){
        this.value = value;
    }

    public int Calculate(){
        return value;
    }
}
