/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventaris;

/**
 *
 * @author Hadid
 */
public class Furniture extends Item {
    private String material;

    public Furniture(String itemName, int quantity, String material) {
        super(itemName, quantity);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Barang: " + getItemName() + ", Kuantitas: " + getQuantity() + ", Brand: " + material);
    }
}