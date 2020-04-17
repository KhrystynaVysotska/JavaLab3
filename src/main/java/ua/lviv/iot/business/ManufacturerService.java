package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.ManufacturerRepository;
import ua.lviv.iot.shop.model.Manufacturer;

@Service
public class ManufacturerService extends AbstractService<Manufacturer> {
    
    @Autowired
    private ManufacturerRepository manufacturerRepository;
    
    @Override
    protected JpaRepository<Manufacturer, Integer> getJpaRepository() {
        return manufacturerRepository; 
    }
}
