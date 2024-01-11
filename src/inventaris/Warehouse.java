/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventaris;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hadid
 */
public class Warehouse {
    private final List<Item> inventory;

    public Warehouse() {
        this.inventory = new ArrayList<>();
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventaris kosong.");
        } else {
            System.out.println("\nIsi Inventaris:");

            for (Item item : inventory) {
                item.displayInfo();
            }
        }
    }

    public List<Item> getInventory() {
        return inventory;
    }
}