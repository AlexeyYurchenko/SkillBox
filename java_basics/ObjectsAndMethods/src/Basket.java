public class Basket {

    private static int count = 0;
    private String items = "";
    private static int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    private static int totalCost = 0; // общая стоимость
    private static int totalGoods = 0; // количество всех товаров

    private static int averagePrice = 0; // средняя цена товара во всех корзинах
    private static int averageBasket = 0; // средняя стоимость корзины

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }
    public Basket(int limit) {
        this();
        this.limit = limit;
    }
    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }
    public static int getTotalCost(){
        return totalCost;
    }
    public static int getTotalGoods(){
        return totalGoods;
    }
    public static int getAveragePrice(){
        return averagePrice;
    }
    public static int getAverageBasket() {
        return averageBasket;
    }
    public static int getCount() {
        return count;
    }
    public double getTotalWeight() {
        return totalWeight;
    }
    public static void averagePrice(int averagePrice) {
        Basket.averagePrice = getTotalCost() / getTotalGoods();
    }
    public static void averageBasket(int averageBasket) {
        Basket.averageBasket=getTotalCost() / getCount();
    }
    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }
    public static void increaseCost(int totalCost) {
        Basket.totalCost=getTotalPrice()+totalCost;
    }
    public static void increaseGoods(int totalGoods){
        Basket.totalGoods=Basket.totalGoods+totalGoods;
    }
    public void add(String name, int price) {
        add(name, price, count, totalWeight);
    }
    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }
        if (totalPrice + count * price >= limit) {
            error = true;
        }
        if (error) {
            System.out.println("Error occured :(");
            return;
        }
        items = items + "\n" + name + " - " + count + " шт. - " + price + " руб. - " + weight + " гр.";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight+weight*count;
        totalGoods= totalGoods+count;
    }
    public void clear() {
        items = "";
        totalPrice = 0;
    }
    public static int getTotalPrice() {
        return totalPrice;
    }
    public boolean contains(String name) {
        return items.contains(name);
    }
    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
