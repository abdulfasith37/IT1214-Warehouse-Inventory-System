import java.util.Scanner;

class Warehouse {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        String choice; 

        do {
            System.out.println("\n--- Warehouse Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Search by Name");
            System.out.println("5. View All Items");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter Quantity: ");
                    int qty = Integer.parseInt(scanner.nextLine()); 
                    
                    System.out.print("Enter Price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    
                    inventory.addItem(new Item(id, name, qty, price));
                    break;
                    
                case "2":
                    System.out.print("Enter ID to remove: ");
                    String removeId = scanner.nextLine();
                    inventory.removeItem(removeId);
                    break;
                    
                case "3":
                    System.out.print("Enter ID to update: ");
                    String updateId = scanner.nextLine();
                    
                    System.out.print("Enter New Quantity: ");
                    int newQty = Integer.parseInt(scanner.nextLine());
                    
                    inventory.updateQuantity(updateId, newQty);
                    break;
                    
                case "4":
                    System.out.print("Enter Name to search: ");
                    String searchName = scanner.nextLine(); 
                    inventory.searchByName(searchName);
                    break;
                    
                case "5":
                    inventory.displayAllItems();
                    break;
                    
                case "6":
                    System.out.println("Exiting system. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            
        }
		while(!choice.equals("6"));

    }
}
