import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        HashMap<String, Integer> itemMap = new HashMap<String, Integer>();

        while (true) {

            System.out.println("Enter item (type 'done' to exit):");
            String item = scanner.nextLine();
            if (item.equals("done")) {
                break;
            }

            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            list.add(item);
            itemMap.put(item, quantity);
        }

       

        System.out.println("Grocery List:");
        for (String item : itemMap.keySet()) {
            System.out.println(item + ": " + itemMap.get(item));
        }

        System.out.println("Would you like to remove any items from the list? (y/n)");
        String response = scanner.nextLine();

        if (response.equals("y")) {
            while (true) {

                System.out.println("Enter item to remove (type 'done' to finish removing items):");
                String item = scanner.nextLine();

                if (item.equals("done")) {
                    break;
                }

                list.remove(item);
                itemMap.remove(item);
            }
           
            
            
            System.out.println("================================");
            System.out.println("            GROCERY LIST         ");
            System.out.println("================================");

            
            


            for (String item : itemMap.keySet()) {
                
                System.out.println(item + ": " + itemMap.get(item));

            }

            System.out.println("--------------------------------");

        }
        

    }
}