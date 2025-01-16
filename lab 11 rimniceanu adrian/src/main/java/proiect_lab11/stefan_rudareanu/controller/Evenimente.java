package proiect_lab11.stefan_rudareanu.controller;

import org.hibernate.query.QueryParameter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proiect_lab11.stefan_rudareanu.dto.EvenimenteDto;
import proiect_lab11.stefan_rudareanu.models.EvenimenteEntity;

import java.util.Date;
import java.util.List;

@RequestMapping("/evenimente")
public interface Evenimente {


    @GetMapping
    ResponseEntity<List<EvenimenteDto>> getEvenimente();

    @PostMapping
    ResponseEntity<EvenimenteEntity> addEveniment(@RequestBody EvenimenteDto evenimenteDto);

    @GetMapping(value = "/eventsByDate/{data}")
    ResponseEntity<List<EvenimenteDto>> getEvenimenteByDate(@PathVariable Date data);

    @GetMapping(value = "/eventsByPlace/{locatie}")
    ResponseEntity<List<EvenimenteDto>> getEvenimenteByLocatie(@PathVariable String locatie);

    @PutMapping(value = "/updateEvent/{id}")
    ResponseEntity<EvenimenteDto> updateEveniment(@PathVariable int id, @RequestBody EvenimenteDto evenimenteDto);

    @DeleteMapping(value = "/{id}")
    ResponseEntity<Void> deleteEveniment(@PathVariable int id);


}
