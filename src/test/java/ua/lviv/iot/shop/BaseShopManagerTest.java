package ua.lviv.iot.shop;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.shop.model.AbstractGoodsForKids;
import ua.lviv.iot.shop.model.Gender;
import ua.lviv.iot.shop.model.Season;
import ua.lviv.iot.shop.model.Sweater;

public abstract class BaseShopManagerTest {

	protected List<AbstractGoodsForKids> sweaters;

	@BeforeEach
	public void createSweaters() {
		sweaters = new LinkedList<AbstractGoodsForKids>();
		sweaters.add(new Sweater(Season.AUTUMN, "Chinese", "Chicco", 450, Gender.BOY, "cotton", "blue", 38, 1543, 6, 116,
				"casual", "none", "machine tool", 0.0));
		sweaters.add(new Sweater(Season.WINTER, "Ukraine", "TopHat", 560, Gender.GIRL, "knitwear", "white", 36, 3654, 12,
				156, "casual", "flower", "hand knitting", 3));
		sweaters.add(new Sweater(Season.AUTUMN, "Sweden", "H&M", 340, Gender.BOY, "cotton", "haki", 39, 3434, 7, 122,
				"casual", "dragon", "machine tool", 0.0));
		sweaters.add(new Sweater(Season.AUTUMN, "Ukraine", "Flash", 490, Gender.GIRL, "wool", "grey", 35, 1234, 9, 134,
				"casual", "rombus", "hand knitting", 4));
	}
}
