public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiian = new HawaiianPizzaBuilder();
        PizzaBuilder spicy = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(spicy);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println("Spicy Pizza");
        System.out.println("Dough: " + pizza.getDough());
        System.out.println("Topping: " + pizza.getTopping());
        System.out.println("Sauce: " + pizza.getSauce());

        waiter.setPizzaBuilder(hawaiian);
        waiter.constructPizza();
        System.out.println(" ");
        pizza = waiter.getPizza();
        System.out.println("Hawaian Pizza");
        System.out.println("Dough: " + pizza.getDough());
        System.out.println("Topping: " + pizza.getTopping());
        System.out.println("Sauce: " + pizza.getSauce());
    }
}