package ua.lviv.iot.shop.ShopManager;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.shop.model.AbstractGoodsForKids;
import ua.lviv.iot.shop.model.SortType;

public class ShopManagerUtils {

	private static final GoodsSorterByPrice GOODS_BY_PRICE_SORTER = new GoodsSorterByPrice();

	public static void sortGoodsByPrice(List<AbstractGoodsForKids> goods, SortType sortType) {
		goods.sort(sortType == SortType.ASCENDING ? GOODS_BY_PRICE_SORTER : GOODS_BY_PRICE_SORTER.reversed());	
	}

	public static void sortGoodsBySize(List<AbstractGoodsForKids> goods, SortType sortType) {
		Comparator <AbstractGoodsForKids> comparator = Comparator.comparing(AbstractGoodsForKids::getSize);
		goods.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
	}
	
	public static void sortGoodsByBrandName(List<AbstractGoodsForKids> goods, SortType sortType) {
		if (sortType == SortType.ASCENDING)
			Collections.sort(goods);
		else
			Collections.sort(goods, Comparator.reverseOrder());
	}
	
	static class GoodsSorterByPrice implements Comparator<AbstractGoodsForKids> {
		@Override
		public int compare(AbstractGoodsForKids firstItem, AbstractGoodsForKids secondItem) {
			return Double.compare(firstItem.getPriceInUAH(), secondItem.getPriceInUAH());
		}
	}
}
