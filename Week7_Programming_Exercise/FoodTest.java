public class FoodTest {
    public static void main(String[] args) {
        Food pizza1 = new Food(1, "pizza", "Seafood", 11, 12);
        Food pizza2 = new Food(2, "pizza", "Beef", 9, 10);
        Food Fried_rice = new Food(3, "fried rise", "Seafood", 5, 12);
        Food Noodles = new Food(4, "noodles", "Beef", 6, 14);
        Food[] food = new Food[]{pizza1, pizza2, Fried_rice, Noodles};

        System.out.println("-------------------welcome,this is Start of the Menu------------------");
        for (int i = 0; i < food.length; i++) {
            food[i].getMenu();
        }
        System.out.println("-------------------welcome,this is  End  of the Menu------------------");
    }
}