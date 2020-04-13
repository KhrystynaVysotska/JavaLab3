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
import ua.lviv.iot.business.SweaterService;
import ua.lviv.iot.shop.model.Sweater;

@RequestMapping("/sweaters")
@RestController
public class SweaterController {

    @Autowired
    private SweaterService sweaterService;

    @GetMapping
    public List<Sweater> getAllSweaters() {
        return sweaterService.findAll();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Sweater> getSweater(final @PathVariable("id") Integer sweaterId) {
        Sweater foundedSweater = sweaterService.getById(sweaterId);
        if (foundedSweater != null) {
            return new ResponseEntity<Sweater>(foundedSweater, HttpStatus.OK);
        } else {
            return new ResponseEntity<Sweater>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public Sweater createSweater(final @RequestBody Sweater newSweater) {
        return sweaterService.saveToDatabase(newSweater);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Sweater> modifySweater(final @PathVariable("id") Integer sweaterId,
            final @RequestBody Sweater sweater) {
        sweater.setSweaterId(sweaterId);
        Sweater updatedSweater = sweaterService.update(sweaterId, sweater);
        if(updatedSweater!=null) {
            return new ResponseEntity<Sweater>(updatedSweater, HttpStatus.OK);
        } else {
            return new ResponseEntity<Sweater>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Sweater> deleteSweater(final @PathVariable("id") Integer sweaterId) {
        boolean result = sweaterService.deleteById(sweaterId);
        if(result) {
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
