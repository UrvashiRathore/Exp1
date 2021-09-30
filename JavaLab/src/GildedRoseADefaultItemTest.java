

	public class GildedRoseADefaultItemTest {
		
		private static final int MAXIMUM_QUALITY = 50;
		private static final String AGED_BRIE = "Aged Brie";
		private static final int EXPIRED_SELLIN = -2;
		private static final String DEFAULT_ITEM = "DEFAULT_ITEM";
		private static final int DEFAULT_QUALITY = 4;
		private static final int NOT_EXPIRED_SELLIN = 16;
		
		
	    //Home WORK TASK 
		// please insert 3 Methods of the backstage Passes (backStageBetween5And10Days_qualityIncreasesBy2, 
		// backStageLessThan5Days_qualityIncresesBy3,backStagePassesBeyond10Days_qualityIncresesBy1)
//		Tip:  you add new vars like : { SELLIN_BETWEEN_5_AND_10 (int), 
		// BACKSTAGE_PASSES (String), POSITIVE_SELLLIN_LESS_THAN_5 (int) }
		
		
		@Test
		public void unexpiredAgedBrie_qualityDoesNotGoBeyondMaximum() {
		
			GildedRose app = createGildedRoseWithOneItem(AGED_BRIE, 
					NOT_EXPIRED_SELLIN, MAXIMUM_QUALITY);
			
			app.updateQuality();
			
			Item expected = new Item(AGED_BRIE, 
					NOT_EXPIRED_SELLIN - 1, MAXIMUM_QUALITY );
			
			
			assertItem(expected, app.items[0]);
		}
		
		@Test
		public void expiredAgedBrie_qualityIncreasesBy2() {
		
			GildedRose app = createGildedRoseWithOneItem(AGED_BRIE, 
					EXPIRED_SELLIN, DEFAULT_QUALITY);
			
			app.updateQuality();
			
			Item expected = new Item(AGED_BRIE, 
					EXPIRED_SELLIN - 1, DEFAULT_QUALITY + 2);
			
			
			assertItem(expected, app.items[0]);
		}
		
		@Test
		public void unexpiredAgedBrie_qualityIncreasesBy1() {
		
			GildedRose app = createGildedRoseWithOneItem(AGED_BRIE, 
					NOT_EXPIRED_SELLIN, DEFAULT_QUALITY);
			
			app.updateQuality();
			
			Item expected = new Item(AGED_BRIE, 
					NOT_EXPIRED_SELLIN - 1, DEFAULT_QUALITY + 1);
			
			
			assertItem(expected, app.items[0]);
		}

		@Test
		public void unexpiredDeafultItem_qualityDecreasesBy1() {
		
			GildedRose app = createGildedRoseWithOneItem(DEFAULT_ITEM, 
					             NOT_EXPIRED_SELLIN, DEFAULT_QUALITY);
			
			app.updateQuality();
			
			Item expected = new Item(DEFAULT_ITEM, 
					         NOT_EXPIRED_SELLIN - 1, DEFAULT_QUALITY - 1);
			
			
			assertItem(expected, app.items[0]);
		}
		@Test
		public void expiredDeafultItem_qualityDecreasesBy2() {
		
			GildedRose app = createGildedRoseWithOneItem(DEFAULT_ITEM, 
					             EXPIRED_SELLIN, DEFAULT_QUALITY);
			
			app.updateQuality();
			
			Item expected = new Item(DEFAULT_ITEM, 
					         EXPIRED_SELLIN - 1, DEFAULT_QUALITY - 2);
			
			
			assertItem(expected, app.items[0]);
		}
		private void assertItem(Item expected, Item actual) {
			assertEquals(expected.name, actual.name);
			assertEquals(expected.sellIn, actual.sellIn);
			assertEquals(expected.quality, actual.quality);
		}

		private GildedRose createGildedRoseWithOneItem(String itemType, int sellin, int quality) {
			Item item = new Item(itemType, sellin, quality);
			Item[] items = new Item[] { item };
			GildedRose app = new GildedRose(items);
			return app;
		}
	}

