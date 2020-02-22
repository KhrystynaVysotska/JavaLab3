package ua.lviv.iot.shop.ShopManager;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.shop.model.AbstractClothes;
import ua.lviv.iot.shop.model.AbstractGoodsForKids;
import ua.lviv.iot.shop.model.SortType;

public class ShopManagerUtils {

	private static final GoodsSorterByPrice GOODS_BY_PRICE_SORTER = new GoodsSorterByPrice();

	public static void sortGoodsByPrice(List<AbstractGoodsForKids> goods, SortType sortType) {
		goods.sort(sortType == SortType.ASCENDING ? GOODS_BY_PRICE_SORTER : GOODS_BY_PRICE_SORTER.reversed());
	}

	public static void sortGoodsBySize(List<AbstractGoodsForKids> goods, SortType sortType) {
		ShopManagerUtils shopManager = new ShopManagerUtils();
		GoodsSorterBySize sorterBySize = shopManager.new GoodsSorterBySize();
		goods.sort(sortType == SortType.ASCENDING ? sorterBySize : sorterBySize.reversed());
	}

	public static void sortGoodsByBrandName(List<AbstractGoodsForKids> goods, SortType sortType) {
		Comparator<AbstractGoodsForKids> comparator = new Comparator<AbstractGoodsForKids>() {
			@Override
			public int compare(AbstractGoodsForKids firstItem, AbstractGoodsForKids secondItem) {
				return firstItem.getBrandName().compareTo(secondItem.getBrandName());
			}
		};
		goods.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
	}

	public static void sortGoodsByItemId(List<AbstractGoodsForKids> goods, SortType sortType) {
		if (sortType == SortType.ASCENDING) {
			goods.sort((firstItem, secondItem) -> firstItem.getItemId() - secondItem.getItemId());
		} else {
			goods.sort((firstItem, secondItem) -> secondItem.getItemId() - firstItem.getItemId());
		}
	}

	public class GoodsSorterBySize implements Comparator<AbstractGoodsForKids> {
		@Override
		public int compare(AbstractGoodsForKids firstItem, AbstractGoodsForKids secondItem) {
			return firstItem.getSize() - secondItem.getSize();
		}
	}

	 public static class GoodsSorterByPrice implements Comparator<AbstractGoodsForKids> {
		@Override
		public int compare(AbstractGoodsForKids firstItem, AbstractGoodsForKids secondItem) {
			return Double.compare(firstItem.getPriceInUAH(), secondItem.getPriceInUAH());
		}
	}
}
