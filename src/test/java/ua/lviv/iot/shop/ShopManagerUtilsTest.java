package ua.lviv.iot.shop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.shop.model.SortType;
import ua.lviv.iot.shop.shopmanager.ShopManagerUtils;

class ShopManagerUtilsTest extends BaseShopManagerTest {

	@Test
	public void testSortGoodsByPrice() {
		ShopManagerUtils.sortGoodsByPrice(sweaters, SortType.ASCENDING);
		assertEquals(340, sweaters.get(0).getPriceInUah());
		assertEquals(450, sweaters.get(1).getPriceInUah());
		assertEquals(490, sweaters.get(2).getPriceInUah());
		assertEquals(560, sweaters.get(3).getPriceInUah());
	}
	
	@Test
	public void testSortGoodsBySize() {
		ShopManagerUtils.sortGoodsBySize(sweaters, SortType.DESCENDING);
		assertEquals(39, sweaters.get(0).getSize());
		assertEquals(38, sweaters.get(1).getSize());
		assertEquals(36, sweaters.get(2).getSize());
		assertEquals(35, sweaters.get(3).getSize());
	}
	
	@Test
	public void testSortGoodsByBrandName() {
		ShopManagerUtils.sortGoodsByBrandName(sweaters, SortType.ASCENDING);
		assertEquals("Chicco", sweaters.get(0).getBrandName());
		assertEquals("Flash", sweaters.get(1).getBrandName());
		assertEquals("H&M", sweaters.get(2).getBrandName());
		assertEquals("TopHat", sweaters.get(3).getBrandName());
	}
	
	@Test
	public void testSortGoodsByItemId() {
		ShopManagerUtils.sortGoodsByItemId(sweaters, SortType.DESCENDING);
		assertEquals(3654, sweaters.get(0).getItemId());
		assertEquals(3434, sweaters.get(1).getItemId());
		assertEquals(1543, sweaters.get(2).getItemId());
		assertEquals(1234, sweaters.get(3).getItemId());
	}
}
