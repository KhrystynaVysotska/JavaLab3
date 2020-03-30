package ua.lviv.iot.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.SweaterRepository;
import ua.lviv.iot.shop.model.Sweater;

@Service
public class SweaterService {

    @Autowired
    private SweaterRepository sweaterRepository;

    public Sweater createSweater(Sweater sweater) {
        return sweaterRepository.save(sweater);
    }

    public ResponseEntity<Sweater> getSweater(Integer sweaterId) {
        if(sweaterRepository.existsById(sweaterId)) {
            Sweater selectedSweater = sweaterRepository.findById(sweaterId).get();
            return new ResponseEntity<Sweater>(selectedSweater,HttpStatus.OK);
        } else {
            return new ResponseEntity<Sweater>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Sweater> updateSweater(Sweater sweaterToUpdate, Integer sweaterId) {
        if (sweaterRepository.existsById(sweaterId)) {
            sweaterToUpdate.setSweaterId(sweaterId);
            Sweater updatedSweater = sweaterRepository.save(sweaterToUpdate);
            return new ResponseEntity<Sweater>(updatedSweater, HttpStatus.OK);
        } else {
            return new ResponseEntity<Sweater>(HttpStatus.NOT_FOUND);
        }
    }

    public List<Sweater> getAllSweaters() {
        return sweaterRepository.findAll();
    }

    public HttpStatus deleteSweater(Integer sweaterId) {
        if (sweaterRepository.existsById(sweaterId)) {
            sweaterRepository.deleteById(sweaterId);
            return HttpStatus.OK;
        } else {
            return HttpStatus.NOT_FOUND;
        }
    }
}
