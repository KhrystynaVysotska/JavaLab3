package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.shop.model.Sweater;

@Repository
public interface SweaterRepository extends JpaRepository<Sweater, Integer> {

}
