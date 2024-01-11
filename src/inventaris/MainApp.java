/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventaris;
import java.util.Scanner;

/**
 *
 * @author Hadid
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("Selamat datang di Aplikasi Inventaris Gudang\n");
        
        try (Scanner scanner = new Scanner(System.in)) {
            Warehouse warehouse = new Warehouse();
            displayMainMenu();
            int choice;
            do {
                System.out.print("\nMasukkan pilihan: ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1 -> addItemMenu(scanner, warehouse);
                    case 2 -> displayInventoryMenu(warehouse);
                    case 3 -> removeItemMenu(scanner, warehouse);
                    case 4 -> displayMainMenu();
                    case 0 -> System.out.println("Terima kasih telah menggunakan aplikasi!");
                    default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } while (choice != 0);
        }
    }

    private static void displayMainMenu() {
        System.out.println("1. Tambah Barang");
        System.out.println("2. Lihat Isi Inventaris");
        System.out.println("3. Hapus Barang");
        System.out.println("4. Tampilkan Pilihan Menu");
        System.out.println("0. Keluar");
    }

    private static void addItemMenu(Scanner scanner, Warehouse warehouse) {
        System.out.println("\nMasukkan Informasi Barang");

        System.out.print("Nama Barang: ");
        String itemName = scanner.next();

        System.out.print("Jumlah Barang: ");
        int quantity = scanner.nextInt();

        System.out.print("1. Elektronik | 2. Furnitur \nPilih Jenis Barang: ");
        int itemType = scanner.nextInt();

        switch (itemType) {
            case 1 -> {
                System.out.print("Brand Barang Elektronik: ");
                String brand = scanner.next();
                ElectronicDevice electronicDevice = new ElectronicDevice(itemName, quantity, brand);
                warehouse.addItem(electronicDevice);
            }
                
            case 2 -> {
                System.out.print("Brand Barang Furnitur: ");
                String material = scanner.next();
                Furniture furniture = new Furniture(itemName, quantity, material);
                warehouse.addItem(furniture);
            }
            default -> System.out.println("Jenis barang tidak valid.");
        }
    }

    private static void displayInventoryMenu(Warehouse warehouse) {
        System.out.println("\nIsi Inventaris:");

        if (warehouse.getInventory().isEmpty()) {
            System.out.println("Inventaris kosong.\n");
        } else {
            for (Item item : warehouse.getInventory()) {
                System.out.print("Barang: " + item.getItemName() + ", Kuantitas: " + item.getQuantity());

                if (item instanceof ElectronicDevice electronicDevice) {
                    System.out.println(", Brand: " + electronicDevice.getBrand());
                }

                if (item instanceof Furniture furniture) {
                    System.out.println(", Brand: " + furniture.getMaterial());
                }
            }
        }
    }
    private static void removeItemMenu(Scanner scanner, Warehouse warehouse) {
        System.out.print("\nMasukkan nama barang yang ingin dihapus: ");
        String itemName = scanner.next();

        boolean itemFound = false;
        for (Item item : warehouse.getInventory()) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                itemFound = true;
                warehouse.removeItem(item);
                System.out.println("Barang berhasil dihapus.");
                break;
            }
        }

        if (!itemFound) {
            System.out.println("Barang tidak ditemukan dalam inventaris.");
        }
    }
}