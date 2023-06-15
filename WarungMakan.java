import java.util.ArrayList;

public class WarungMakan {
    private ArrayList<Menu> menu;

    public WarungMakan() {
        this.menu = new ArrayList<>();
    }

    public void addMenu(Menu menu) {
        this.menu.add(menu);
    }

    public void tampilkanMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i).getTipe());
        }
    }

    public Menu getMenu(int index) {
        if (index >= 0 && index < menu.size()) {
            return menu.get(index);
        } else {
            return null;
        }
    }
}