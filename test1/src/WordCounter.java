import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) throws IOException {

        // Creating the File
        File file = new File("create.txt");
        file.createNewFile();

        // Writing the file
        takeInput();

        // Reading the file
        Scanner scanner = new Scanner("create.txt");
        ArrayList<String> arrayList = new ArrayList<>();
        while(scanner.hasNext()){
            String string = scanner.next();
            arrayList.add(string.toLowerCase());
            countOccurence(arrayList);
            System.out.println(string);
        }
    }

    // Method for counting the word with its count
    private static void countOccurence(ArrayList<String> arrayList) {
        Map<String,Integer> map = new HashMap<>();
        for(String string : arrayList){
            map.put(string,map.getOrDefault(string,0)+1);
        }
        for(Map.Entry<String ,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    // Method for writing in the File
    private static void takeInput() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the content in the file : ");
        String str = scanner.nextLine();
        FileWriter fileWriter = new FileWriter("create.txt");
        fileWriter.write(str);
        fileWriter.close();
    }

    // Sort the map entry by the keyValue basis by comparator and comparable class;

}
