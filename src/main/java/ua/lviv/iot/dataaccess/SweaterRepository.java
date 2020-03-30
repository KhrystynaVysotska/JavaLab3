package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.shop.model.Sweater;

public interface SweaterRepository extends JpaRepository<Sweater, Integer> {

}
