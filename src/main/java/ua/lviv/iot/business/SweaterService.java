package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.SweaterRepository;
import ua.lviv.iot.shop.model.Sweater;

@Service
public class SweaterService extends AbstractService<Sweater> {

    @Autowired
    private SweaterRepository sweaterRepository;

    @Override
    protected JpaRepository<Sweater, Integer> getJpaRepository() {
        return sweaterRepository;
    }

    
}
