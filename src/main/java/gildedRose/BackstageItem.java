package gildedRose;

public class BackstageItem implements ItemType {
    @Override
    public void update(Item item) {
        item.qualitySmallerThan50();
        if (item.sellIn < 11) {
            item.qualitySmallerThan50();
        }
        if (item.sellIn < 6) {
            item.qualitySmallerThan50();
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
