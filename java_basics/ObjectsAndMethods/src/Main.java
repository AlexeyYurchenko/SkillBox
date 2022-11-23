public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 5, 100);
        basket.print("Milk");

        Basket basket1 = new Basket();
        basket1.add("coffee",300,3,150);
        basket1.print("coffee");

        System.out.println("Количество корзин:" + Basket.getCount());
        Basket.increaseCost(0);
        System.out.println("Общая стоимость всех корзин:" + Basket.getTotalCost());
        Basket.increaseGoods(0);
        System.out.println("Общие количество товаров:" + Basket.getTotalGoods());
        Basket.averagePrice(0);
        System.out.println("Средняя цена товара:" + Basket.getAveragePrice());
        Basket.averageBasket(0);
        System.out.println("Средняя стоимость корзины:" + Basket.getAverageBasket());

    }
}
