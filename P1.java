import java.util.*;

abstract class WarehouseItem {
    String n;
    WarehouseItem(String n) { this.n = n; }
    public String toString() { return n; }
}

class Electronics extends WarehouseItem {
    Electronics(String n) { super(n); }
}

class Groceries extends WarehouseItem {
    Groceries(String n) { super(n); }
}

class Furniture extends WarehouseItem {
    Furniture(String n) { super(n); }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    
    void add(T item) { items.add(item); }
    
    T get(int i) { return items.get(i); }
    
    List<T> all() { return items; }
    
    static void show(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}

public class P1 {
    public static void main(String[] args) {
        Storage<Electronics> eS = new Storage<>();
        eS.add(new Electronics("Laptop"));
        eS.add(new Electronics("Smartphone"));
        
        Storage<Groceries> gS = new Storage<>();
        gS.add(new Groceries("Apple"));
        gS.add(new Groceries("Milk"));
        
        Storage<Furniture> fS = new Storage<>();
        fS.add(new Furniture("Chair"));
        fS.add(new Furniture("Table"));
        
        System.out.println("Electronics:");
        Storage.show(eS.all());
        
        System.out.println("\nGroceries:");
        Storage.show(gS.all());
        
        System.out.println("\nFurniture:");
        Storage.show(fS.all());
    }
}
