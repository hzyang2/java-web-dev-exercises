package restaurantMenu.restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem burger = new MenuItem(28.00, "best burger ever", "entree");

        System.out.println(burger.getCategory());
    }
}
