/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventaris;

/**
 *
 * @author Hadid
 */
public class InventoryReport implements ReportGenerator {
    private final Warehouse warehouse;

    public InventoryReport(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void generateReport() {
        warehouse.displayInventory();
    }
}