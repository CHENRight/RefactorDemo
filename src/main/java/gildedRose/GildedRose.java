package gildedRose;
class GildedRose {
    private Item[] items;

    GildedRose(Item[] items) {
        this.items = items;
    }

    void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Aged Brie")) {
                new AgedItem().update(item);
            } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                return;
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                new BackstageItem().update(item);
            } else {
                new OtherItem().update(item);
            }
        }
    }
}