package ua.lviv.iot.shop.shopmanager;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import ua.lviv.iot.shop.model.AbstractGoodsForKids;
import ua.lviv.iot.shop.model.SortType;

public class ShopManagerUtils {

  private static final GoodsSorterByPrice GOODS_BY_PRICE_SORTER = new GoodsSorterByPrice();
  public static final GoodsSorterBySize GOODS_BY_SIZE_SORTER = new ShopManagerUtils().new GoodsSorterBySize();

  public static void sortGoodsByPrice(List<AbstractGoodsForKids> goods, SortType sortType) {
    goods.sort(sortType == SortType.ASCENDING ? GOODS_BY_PRICE_SORTER : GOODS_BY_PRICE_SORTER.reversed());
  }

  public static void sortGoodsBySize(List<AbstractGoodsForKids> goods, SortType sortType) {
    goods.sort(sortType == SortType.ASCENDING ? GOODS_BY_SIZE_SORTER : GOODS_BY_SIZE_SORTER.reversed());
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

  public static class GoodsSorterByPrice implements Comparator<AbstractGoodsForKids>, Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public int compare(AbstractGoodsForKids firstItem, AbstractGoodsForKids secondItem) {
      return Double.compare(firstItem.getPriceInUah(), secondItem.getPriceInUah());
    }
  }
}
