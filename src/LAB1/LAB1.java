package LAB1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTextArea;
import javax.swing.JFrame;
/**
 *
 * @author harsh
 */
public class LAB1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Question1
        ArrayList <String> listOne = new ArrayList<>();
        
        String one = "one";
        String two = "two";       
        String three = "three";
        String four = "four";   
        
        listOne.add(one);
        listOne.add(two);
        listOne.add(three);
        listOne.add(four);
        
        ArrayList <String> listTwo = new ArrayList<>(listOne);
           System.out.println("Content of list one: " + listOne);
           System.out.println("Content of list two: " +listTwo);
        
        Iterator<String> mona = listTwo.iterator();
        Iterator<String> display = listTwo.iterator();
        
        System.out.println("");
        System.out.println("Iteration Function ");
        
        while (display.hasNext()) {
            System.out.println(display.next());
        }
        
        System.out.println("");
        System.out.println("Remove Function ");
        while (mona.hasNext()) {
            String element = mona.next();
            if (element.equals("two")) {
                mona.remove();
            }
        }
            System.out.println(listTwo); 
            
        System.out.println("");    
        System.out.println("Size ");
        System.out.println(listTwo.size());
        
        //Question 2
        ArrayList<String> mobile_list = new ArrayList<>();
        int counter1, counter2;
        String input[], output, output2;
        JTextArea area1 = new JTextArea();
        
        String[] items = {"nokia", "samsung", "huawei", "ericsson", "captur", "nexus", "bligtz", "symphony", "maxwel", "tiger"};
        for (counter1 = 0; counter1 < items.length; counter1++ ) {
            mobile_list.add(items[counter1]);
        }
        mobile_list.sort(null);
        System.out.println("");    
        System.out.println("Sorting");
        System.out.println(mobile_list);

       
        System.out.println("");    
        System.out.println("Removing from index");
        mobile_list.remove(1);
        mobile_list.remove(7);
        System.out.println(mobile_list); 
        
        
        //Using for loop to display element
        Iterator<String> rem = mobile_list.iterator();
        
        for (counter2 = 0; counter2 < mobile_list.size(); counter2++) {
         area1.append(mobile_list.get(counter2) + "\n");
        }
        
        JFrame frame = new JFrame("Mobile List");
        frame.add(area1);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Question 3
        System.out.println("");    
        System.out.println("Ques3");
        
        ArrayList<String> ewd = new ArrayList<>();
        ewd.add("ben");
        ewd.add("charles");
        System.out.println(ewd.contains(new String("ben")));
        System.out.println(ewd.indexOf("charles"));
        ewd.clear( );
        System.out.println(ewd);
        
        }   
}
