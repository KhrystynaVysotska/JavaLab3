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
import ua.lviv.iot.business.ManufacturerService;
import ua.lviv.iot.shop.model.Manufacturer;

@RequestMapping("/manufacturer")
@RestController
public class ManufacturerController {

    @Autowired
    private ManufacturerService manufacturerService;

    @GetMapping
    public List<Manufacturer> getManufacturers() {
        return manufacturerService.getManufacturers();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Manufacturer> getManufacturer(@PathVariable("id") Integer manufacturerId) {
        return manufacturerService.getManufacturer(manufacturerId);
    }

    @PostMapping
    public Manufacturer createManufacturer(@RequestBody Manufacturer newManufacturer) {
        return manufacturerService.createManufacturer(newManufacturer);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Manufacturer> deleteManufacturer(@PathVariable("id") Integer manufacturerId) {
        HttpStatus status = manufacturerService.deleteManufacturer(manufacturerId);
        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Manufacturer> updateManufacturer(@RequestBody Manufacturer manufacturer,
            @PathVariable("id") Integer manufacturerId) {
        return manufacturerService.updateManufacturer(manufacturerId, manufacturer);
    }
}
