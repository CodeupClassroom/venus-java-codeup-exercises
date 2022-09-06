package java_two.enums;

import docrob.util.Input;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryListApp {
    public static final int PRODUCE = 1;
    public static final int MEATZ = 2;

    private static Input input = new Input();

    public static void main(String[] args) {
        // A user should be prompted if they would like to create a grocery list.
        if(input.yesNo("Would you like to create a grocery list? (y/n) ") == false) {
            System.out.println("Bye");
            return;
        }

        // ask user to keep inputting items until they are done
        ArrayList<GroceryItem> groceries = getGroceryListFromUser();

        // if we got here, then user is done inputting items
        printGroceryList(groceries);

        System.out.println("Done");

//        GroceryItem item = new GroceryItem("lettuce", GroceryCategory.Produce, 5);
//        System.out.println(item);
//
//        System.out.println(GroceryCategory.Meatz);
//        if(item.getCategoryNum() == GroceryCategory.Produce) {
//
//        }
    }

    private static ArrayList<GroceryItem> getGroceryListFromUser() {
        ArrayList<GroceryItem> groceries = new ArrayList<>();

        // keep asking user to input items until he/she says done
        while(true) {
            printGroceryCategories();

            int categoryNum = input.getInt(GroceryCategory.Produce.ordinal(), GroceryCategory.Meatz.ordinal(), "Enter the number of the category: ");

            System.out.print("Enter the name of the item: ");
            String itemName = input.getString();

            int itemQty = input.getInt(0, 10000, "Enter the quantity of the item: ");

            // now that we have the 3 pieces of info for item, make the item
            GroceryItem item = new GroceryItem(itemName, GroceryCategory.values()[categoryNum], itemQty);
            groceries.add(item);

            if(input.yesNo("Would you like to add another grocery item? (y/n) ") == false) {
                return groceries;
            }
        }
    }

    private static void printGroceryCategories() {
        System.out.println("Grocery Categories:");
        for (GroceryCategory category: GroceryCategory.values()) {
            System.out.printf("%d. %s\n", category.ordinal(), category.name());
        }

    }

    private static void printGroceryList(ArrayList<GroceryItem> groceries) {
        // 1. for each category
        printGroceryListByCategory(GroceryCategory.Produce, groceries);
        printGroceryListByCategory(GroceryCategory.Meatz, groceries);
    }

    private static void printGroceryListByCategory(GroceryCategory category, ArrayList<GroceryItem> groceries) {
        // 2. fetch the grocery items for that category
        ArrayList<GroceryItem> categoryItems = new ArrayList<>();

        for(GroceryItem groceryItem : groceries) {
            if(groceryItem.getCategoryNum() == category) {
                categoryItems.add(groceryItem);
            }
        }
        // at this point, categoryItems has the grocery items for the given category

        // 3. sort them alphabetically
        Collections.sort(categoryItems);

        // 4. print them w quantity
        if(category == GroceryCategory.Produce) {
            System.out.println("PRODUCE:");
        } else {
            System.out.println("MEATZ:");
        }
        System.out.println(categoryItems);
    }


}
