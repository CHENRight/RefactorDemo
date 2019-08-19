package gildedRose;
class GildedRose {
    private Item[] items;

    GildedRose(Item[] items) {
        this.items = items;
    }

    void updateQuality() {
        for (Item item : items) {
            item.getItemType().update(item);
        }
    }
}