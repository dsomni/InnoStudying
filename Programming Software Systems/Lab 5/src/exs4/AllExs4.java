package exs4;

import java.io.*;
import java.util.Scanner;

public class AllExs4 {

    public static boolean isExist(String dir){
        File file = new File(dir);
        return file.exists();
    }

    public static String typeOfPathname(String path){
        File file = new File(path);
        if(file.isDirectory()){
            return "Directory";
        } else if (file.isFile()){
            return "File";
        } else {
            return "DoesNotExist";
        }
    }

    public static void main(String args[]) throws IOException {
        FileWriter fw = new FileWriter("output4.txt");
        Scanner scanner;
        BufferedReader br = new BufferedReader(new FileReader("input4.txt"));

        // Ex4.1
        String dir = br.readLine();
        fw.write(String.valueOf(isExist(dir)));
        fw.write('\n');
        dir = br.readLine();
        fw.write(String.valueOf(isExist(dir)));
        fw.write('\n');

        // Ex4.2
        dir = br.readLine();
        fw.write(typeOfPathname(dir));
        fw.write('\n');
        dir = br.readLine();
        fw.write(typeOfPathname(dir));
        fw.write('\n');
        dir = br.readLine();
        fw.write(typeOfPathname(dir));
        fw.write('\n');


        fw.close();
    }
}
