package primitivizeparameter.solution;

import java.util.List;

public class TotalPrice {

    // Probléma: BasketItem létrehozása nehézkes
    // Megoldás: közbülső reprezentáció átadása
    public int calculateOfPrices(List<Price> prices) {
        return prices.stream().mapToInt(Price::getPrice).sum();
    }

    public int calculate(List<BasketItem> items) {
        return calculateOfPrices(items.stream().map(item -> new Price(item.getPrice())).toList());
    }
}
