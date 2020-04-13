package ua.lviv.iot.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        return shopService.findAll();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Shop> getShop(final @PathVariable("id") Integer shopId) {
        Shop foundedShop = shopService.getById(shopId);
        if (foundedShop != null) {
            return new ResponseEntity<Shop>(foundedShop, HttpStatus.OK);
        } else {
            return new ResponseEntity<Shop>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public Shop createShop(@RequestBody Shop newShop) {
        return shopService.saveToDatabase(newShop);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Shop> deleteShop(@PathVariable("id") Integer shopId) {
        if(shopService.deleteById(shopId)) {
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Shop> updateShop(@PathVariable("id") Integer shopId, @RequestBody Shop shop) {
        shop.setId(shopId);
        Shop updatedShop = shopService.update(shopId, shop);
        if(updatedShop != null) {
            return new ResponseEntity<Shop>(updatedShop, HttpStatus.OK);
        } else {
            return new ResponseEntity<Shop>(HttpStatus.NOT_FOUND);
        }
    }
}