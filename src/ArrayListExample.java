/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author harsh
 */
public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        // TODO code application logic here
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        
        
        System.out.println("First fruit: " + fruits.get(0));

        fruits.set(1, "Blueberry");
        fruits.remove("Mango");
        
        System.out.println("Fruits List: ");
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
        
        System.out.println("Total fruits: " + fruits.size());
        
        
    }
    
}
