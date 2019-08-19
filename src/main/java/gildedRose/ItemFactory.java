package gildedRose;

import com.sun.org.apache.bcel.internal.generic.RET;

public class ItemFactory {
    public static ItemType getItem(String name) {
        switch (name) {
            case "Aged Brie":
                return new AgedItem();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItem();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstageItem();
            default:
                return new OtherItem();
        }
    }

}
