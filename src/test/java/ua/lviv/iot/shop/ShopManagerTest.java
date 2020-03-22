package ua.lviv.iot.shop;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.shop.model.AbstractGoodsForKids;
import ua.lviv.iot.shop.model.Gender;
import ua.lviv.iot.shop.model.Season;
import ua.lviv.iot.shop.shopmanager.ShopManager;

class ShopManagerTest extends BaseShopManagerTest {

    private ShopManager shopManager;

    @BeforeEach
    public void setUp() {
        shopManager = new ShopManager();
        shopManager.addGoods(sweaters);
    }

    @Test
    public void testFindGoodsByGender() {
        List<AbstractGoodsForKids> foundedGoods = shopManager.findGoodsBy(Gender.GIRL);
        assertEquals(2, foundedGoods.size());
    }

    @Test
    public void testFindGoodsBySeason() {
        List<AbstractGoodsForKids> foundedGoods = shopManager.findGoodsBy(Season.AUTUMN);
        assertEquals(3, foundedGoods.size());
    }
}