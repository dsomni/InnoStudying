package Calculator;

public class Parser {

    char c;
    String string;
    int pos;

    public Parser(String input){
        this.string = input;
        pos = 0;
    }

    public void nextToken(){
        pos++;
        c = string.charAt(pos-1);
    }

    public void parse(){
        nextToken();
        if(c=='\n'){
            return;
        }else if(Number.isNumber(c)){
            int num = (int) c - 48;
            nextToken();
            while(Number.isNumber(c)){
                num = num*10 + (int) c - 48;
            }

        }

    }

    public double calculate(){

    }

}
