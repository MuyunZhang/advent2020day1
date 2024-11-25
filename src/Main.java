import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        ArrayList<String> fileData = getFileData("src/Day1Input.txt");
        System.out.println(fileData);
        for(int i = 0; i < fileData.size(); i ++){
            int first = Integer.parseInt(fileData.get(i));
            for(int k = 0; k < fileData.size(); k ++){
                int second = Integer.parseInt(fileData.get(k));
                int sum = first + second;
                if(sum == 2020){
                    System.out.println(first * second);
                }
            }
        }
        // you now have an ArrayList of Strings for each number in the file
        // do Advent 2020 day 1!
    }

    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}