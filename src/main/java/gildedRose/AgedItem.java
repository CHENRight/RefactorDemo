package gildedRose;

public class AgedItem implements ItemUpdate {

    @Override
    public void update(Item item) {
        item.qualitySmallerThan50();
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.qualitySmallerThan50();
        }
    }
}
