package ua.lviv.iot.shop.ShopManager;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.shop.model.AbstractGoodsForKids;
import ua.lviv.iot.shop.model.Gender;
import ua.lviv.iot.shop.model.Season;

public class ShopManager {
	private List<AbstractGoodsForKids> goods = new LinkedList<AbstractGoodsForKids>();
	
	public void addGoods(List<AbstractGoodsForKids> goods) {
		this.goods.addAll(goods);
	}
	
	public void addGood(AbstractGoodsForKids good) {
		this.goods.add(good);
	}
	
	public List<AbstractGoodsForKids> findGoodsBy(Gender gender){
		List<AbstractGoodsForKids> foundItems = new LinkedList<AbstractGoodsForKids>();
		for(AbstractGoodsForKids good: goods) {
			if(good.getGenderCategory() == gender) {
				foundItems.add(good);
			}
		}
		return foundItems;
	}
	
	public List<AbstractGoodsForKids> findGoodsBy(Season season){
		return this.goods.stream().filter(good->good.getSeason() == season).collect(Collectors.toList());
	}
}
