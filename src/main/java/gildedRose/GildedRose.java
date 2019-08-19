package gildedRose;
class GildedRose {
    private Item[] items;

    GildedRose(Item[] items) {
        this.items = items;
    }

    void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Aged Brie")) {
                qualitySmallerThan50(item);
                item.sellIn = item.sellIn - 1;
                if (item.sellIn < 0) {
                    qualitySmallerThan50(item);
                }
            } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                return;
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                qualitySmallerThan50(item);
                if (item.sellIn < 11) {
                    qualitySmallerThan50(item);
                }
                if (item.sellIn < 6) {
                    qualitySmallerThan50(item);
                }
                item.sellIn = item.sellIn - 1;
                if (item.sellIn < 0) {
                    item.quality = 0;
                }
            } else {
                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }
                item.sellIn = item.sellIn - 1;
                if (item.sellIn < 0) {
                    if (item.quality > 0) {
                        item.quality = item.quality - 1;
                    }
                }
            }
        }
    }
    private void qualitySmallerThan50(Item item){
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}