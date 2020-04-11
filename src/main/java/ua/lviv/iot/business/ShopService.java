package ua.lviv.iot.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.ShopRepository;
import ua.lviv.iot.shop.model.Shop;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public Shop createShop(Shop newShop) {
        return shopRepository.save(newShop);
    }

    public List<Shop> getShops() {
        return shopRepository.findAll();
    }

    public ResponseEntity<Shop> getShop(Integer shopId) {
        if (shopRepository.existsById(shopId)) {
            Shop foundedShop = shopRepository.findById(shopId).get();
            return new ResponseEntity<Shop>(foundedShop, HttpStatus.OK);
        } else {
            return new ResponseEntity<Shop>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Shop> deleteShop(Integer shopId) {
        if (shopRepository.existsById(shopId)) {
            shopRepository.deleteById(shopId);
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    public ResponseEntity<Shop> updateShop(Shop shop, Integer shopId) {
        if (shopRepository.existsById(shopId)) {
            shop.setId(shopId);
            return new ResponseEntity<Shop>(shopRepository.save(shop), HttpStatus.OK);
        } else {
            return new ResponseEntity<Shop>(HttpStatus.NOT_FOUND);
        }
    }
}
