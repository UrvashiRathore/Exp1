
public class GildedRoseCBack {

public void testUpdateQualityBackstagePasses1() {
	Item item = new Item("Backstage passes to a TAFKAL80ETC concert ", 15,3);
	Item[] items = new Item[] { item };
	GildedRose app = new GildedRose(items);
	app.updateQuality();
	assertEquals("Backstage passes to a TAFKAL80ETC concert",app.items[0].name);
assertEquals(14,app.items[0].sellIn);
assertEquals(14,app.items[0].quality);

}
public 
}
