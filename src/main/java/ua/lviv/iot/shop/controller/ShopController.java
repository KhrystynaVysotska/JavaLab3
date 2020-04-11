package ua.lviv.iot.shop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.business.ShopService;
import ua.lviv.iot.shop.model.Shop;

@RequestMapping("/shops")
@RestController
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping
    public List<Shop> getShops() {
        return shopService.getShops();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Shop> getShop(@PathVariable("id") Integer shopId) {
        return shopService.getShop(shopId);
    }

    @PostMapping
    public Shop createShop(@RequestBody Shop newShop) {
        return shopService.createShop(newShop);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Shop> deleteShop(@PathVariable("id") Integer shopId) {
        return shopService.deleteShop(shopId);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Shop> updateShop(@PathVariable("id") Integer shopId, @RequestBody Shop shop) {
        return shopService.updateShop(shop, shopId);
    }
}