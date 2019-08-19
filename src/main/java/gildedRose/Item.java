package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public ItemType getItemType() {
        return itemType;
    }

    private ItemType itemType;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.itemType = ItemFactory.getItem(name);
    }

    public void qualitySmallerThan50() {
        if (quality < 50) {
            quality += 1;
        }
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
