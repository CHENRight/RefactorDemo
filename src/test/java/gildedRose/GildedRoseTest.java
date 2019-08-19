package gildedRose;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_updateQuality_when_given_items_name_any_and_sellIn_smaller_than_0_and_quality_50(){
        Item item = new Item("any",-1,50);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("any, -2, 48",item.toString());
    }
    @Test
    public void should_updateQuality_when_given_items_name_any_and_sellIn_smaller_than_0_and_quality_49(){
        Item item = new Item("any",-1,49);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("any, -2, 47",item.toString());
    }

    @Test
    public void should_updateQuality_when_given_items_name_any_and_sellIn_6_and_quality_50(){
        Item item = new Item("any",6,50);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("any, 5, 49",item.toString());
    }
    @Test
    public void should_updateQuality_when_given_items_name_any_and_sellIn_6_and_quality_49(){
        Item item = new Item("any",6,49);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("any, 5, 48",item.toString());
    }
    @Test
    public void should_updateQuality_when_given_items_name_any_and_sellIn_11_and_quality_50(){
        Item item = new Item("any",11,50);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("any, 10, 49",item.toString());
    }
    @Test
    public void should_updateQuality_when_given_items_name_any_and_sellIn_11_and_quality_49(){
        Item item = new Item("any",11,50);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("any, 10, 49",item.toString());
    }

    @Test
    public void should_updateQuality_when_given_items_name_Aged_Brie_and_sellIn_smaller_than_0_and_quality_49(){
        Item item = new Item("Aged Brie",-1,49);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Aged Brie, -2, 50",item.toString());
    }
    @Test
    public void should_updateQuality_when_given_items_name_Aged_Brie_and_sellIn_smaller_than_0_and_quality_50(){
        Item item = new Item("Aged Brie",-1,50);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Aged Brie, -2, 50",item.toString());
    }

    @Test
    public void should_updateQuality_when_given_items_name_Aged_Brie_and_sellIn_6_and_quality_50(){
        Item item = new Item("Aged Brie",6,50);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Aged Brie, 5, 50",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Aged_Brie_and_sellIn_6_and_quality_49(){
        Item item = new Item("Aged Brie",6,49);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Aged Brie, 5, 50",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Aged_Brie_and_sellIn_11_and_quality_50(){
        Item item = new Item("Aged Brie",11,50);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Aged Brie, 10, 50",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Aged_Brie_and_sellIn_11_and_quality_49(){
        Item item = new Item("Aged Brie",11,49);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Aged Brie, 10, 50",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellIn_smaller_than_0_and_quality_49(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",-1,49);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, -2, 0",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellIn_smaller_than_0_and_quality_50(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",-1,50);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, -2, 0",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellIn_6_and_quality_50(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",6,50);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 5, 50",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellIn_6_and_quality_49(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",6,49);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 5, 50",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellIn_11_and_quality_50(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",11,50);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 10, 50",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellIn_11_and_quality_49(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",11,49);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 10, 50",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Sulfuras_Hand_of_Ragnaros_and_sellIn_smaller_than_0_and_quality_49(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",-1,49);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros, -1, 49",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Sulfuras_Hand_of_Ragnaros_and_sellIn_smaller_than_0_and_quality_50(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",-1,50);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros, -1, 50",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Sulfuras_Hand_of_Ragnaros_and_sellIn_6_and_quality_49(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",6,49);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros, 6, 49",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Sulfuras_Hand_of_Ragnaros_and_sellIn_6_and_quality_50(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",6,50);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros, 6, 50",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Sulfuras_Hand_of_Ragnaros_and_sellIn_11_and_quality_49(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",11,49);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros, 11, 49",item.toString());
    }

    @Test
    public void  should_updateQuality_when_given_items_name_Sulfuras_Hand_of_Ragnaros_and_sellIn_11_and_quality_50(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",11,50);
        GildedRose gildedRose = new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros, 11, 50",item.toString());
    }
}