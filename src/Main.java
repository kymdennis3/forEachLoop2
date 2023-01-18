import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*for - each = traversing technique to iterate through the elements in an array/collections
        *              less steps,more readable
        *              less flexible*/

        //String [] animals = {"cats", "dogs", "birds", "lion"};
        ArrayList<String> animals = new ArrayList<>();

        animals.add("cats");
        animals.add("dogs");
        animals.add("lions");
        animals.add("birds");


        for(String i: animals){
            System.out.println(i);
        }
    }
}