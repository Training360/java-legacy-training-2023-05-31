package primitivizeparameter.problem;

import java.util.List;

public class TotalPrice {

    // Probléma: BasketItem létrehozása nehézkes
    // Megoldás: közbülső reprezentáció átadása
    public int calculate(List<BasketItem> items) {
        return items.stream().mapToInt(BasketItem::getPrice).sum();
    }
}
