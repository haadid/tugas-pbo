/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventaris;

/**
 *
 * @author Hadid
 */
public class ElectronicDevice extends Item {
    private String brand;

    public ElectronicDevice(String itemName, int quantity, String brand) {
        super(itemName, quantity);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Item: " + getItemName() + ", Kuantitas: " + getQuantity() + ", Brand: " + brand);
    }
}
