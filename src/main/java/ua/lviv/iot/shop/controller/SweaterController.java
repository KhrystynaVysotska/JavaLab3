package ua.lviv.iot.shop.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.shop.model.Sweater;

@RequestMapping("/sweaters")
@RestController
public class SweaterController {
    private Map<Integer, Sweater> sweaters = new HashMap<>();
    private AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public List<Sweater> getAllSweaters() {
        return new LinkedList<Sweater>(sweaters.values());
    }

    @GetMapping(path = "/{id}")
    public Sweater getSweater(final @PathVariable("id") Integer sweaterId) {
        return sweaters.get(sweaterId);
    }

    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, "application/xml;charset=UTF-8" })
    public Sweater createSweater(final @RequestBody Sweater newSweater) {
        newSweater.setSweaterId(idCounter.incrementAndGet());
        sweaters.put(newSweater.getSweaterId(), newSweater);
        return newSweater;
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Sweater> modifySweater(final @PathVariable("id") Integer sweaterId,
            final @RequestBody Sweater sweater) {
        sweater.setSweaterId(sweaterId);
        ResponseEntity<Sweater> response = sweaters.replace(sweaterId, sweater) == null
                ? new ResponseEntity<Sweater>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<Sweater>(sweaters.get(sweaterId), HttpStatus.OK);
        return response;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Sweater> deleteSweater(final @PathVariable("id") Integer sweaterId) {
        HttpStatus status = sweaters.remove(sweaterId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }
}
