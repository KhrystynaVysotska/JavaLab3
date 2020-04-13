package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.ShopRepository;
import ua.lviv.iot.shop.model.Shop;

@Service
public class ShopService extends AbstractService<Shop> {

    @Autowired
    private ShopRepository shopRepository;

    @Override
    protected JpaRepository<Shop, Integer> getJpaRepository() {
        return shopRepository;
    }
}
