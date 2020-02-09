package ua.lviv.iot.shop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.shop.ShopManager.ShopManagerUtils;
import ua.lviv.iot.shop.model.SortType;

class ShopManagerUtilsTest extends BaseShopManagerTest {

	@Test
	public void testSortGoodsByPrice() {
		ShopManagerUtils.sortGoodsByPrice(sweaters, SortType.ASCENDING);
		assertEquals(340, sweaters.get(0).getPriceInUAH());
		assertEquals(450, sweaters.get(1).getPriceInUAH());
		assertEquals(490, sweaters.get(2).getPriceInUAH());
		assertEquals(560, sweaters.get(3).getPriceInUAH());
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
}
