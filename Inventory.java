import java.util.ArrayList;

class Inventory{
    private ArrayList<Item> items = new ArrayList();

    public void addItem(Item item){
        items.add(item);
        System.out.println("Item added!");
    }

    public void removeItem(String id){
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).getItemId().equals(id)){
                items.remove(i);
                System.out.println("Item removed!");
                return; 
            }
        }
        System.out.println("Item not found.");
    }

    public void updateQuantity(String id, int qty){
        for (Item item : items){
            if (item.getItemId().equals(id)){
                item.setQuantity(qty);
                System.out.println("Quantity updated!");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void searchByName(String name){
        for (Item item : items) {
            if (item.getItemName().equalsIgnoreCase(name)){
                System.out.println(item);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void displayAllItems(){
        if (items.isEmpty()){
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("\n--- Current Inventory ---");
            for (Item item : items){
                System.out.println(item);
            }
        }
    }
}
