package gildedRose;
class GildedRose {
    private Item[] items;

    GildedRose(Item[] items) {
        this.items = items;
    }

    void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    new AgedItem().update(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    new SulfurasItem().update(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    new BackstageItem().update(item);
                    break;
                default:
                    new OtherItem().update(item);
                    break;
            }
        }
    }
}