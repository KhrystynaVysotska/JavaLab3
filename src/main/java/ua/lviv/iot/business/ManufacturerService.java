package ua.lviv.iot.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.ManufacturerRepository;
import ua.lviv.iot.shop.model.Manufacturer;

@Service
public class ManufacturerService {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    public List<Manufacturer> getManufacturers() {
        return manufacturerRepository.findAll();
    }

    public ResponseEntity<Manufacturer> getManufacturer(Integer manufacturerId) {
        if (manufacturerRepository.existsById(manufacturerId)) {
            Manufacturer foundedManufacturer = manufacturerRepository.findById(manufacturerId).get();
            return new ResponseEntity<Manufacturer>(foundedManufacturer, HttpStatus.OK);
        } else {
            return new ResponseEntity<Manufacturer>(HttpStatus.NOT_FOUND);
        }
    }

    public Manufacturer createManufacturer(Manufacturer newManufacturer) {
        return manufacturerRepository.save(newManufacturer);
    }

    public HttpStatus deleteManufacturer(Integer manufacturerId) {
        if (manufacturerRepository.existsById(manufacturerId)) {
            manufacturerRepository.deleteById(manufacturerId);
            return HttpStatus.OK;
        } else {
            return HttpStatus.NOT_FOUND;
        }
    }

    public ResponseEntity<Manufacturer> updateManufacturer(Integer manufacturerId, Manufacturer manufacturer) {
        if (manufacturerRepository.existsById(manufacturerId)) {
            manufacturer.setId(manufacturerId);
            return new ResponseEntity<Manufacturer>(manufacturerRepository.save(manufacturer), HttpStatus.OK);
        } else {
            return new ResponseEntity<Manufacturer>(HttpStatus.NOT_FOUND);
        }
    }

}
