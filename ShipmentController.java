package com.example.courier.controller;

import com.example.courier.model.Shipment;
import com.example.courier.service.ShipmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shipments")
@CrossOrigin
public class ShipmentController {

private final ShipmentService service;

public ShipmentController(ShipmentService service){
this.service=service;
}

@PostMapping
public Shipment create(@RequestBody Shipment s){
return service.save(s);
}

@GetMapping
public List<Shipment> getAll(){
return service.getAll();
}

@DeleteMapping("/{id}")
public void delete(@PathVariable Long id){
service.delete(id);
}

@GetMapping("/search")
public List<Shipment> search(@RequestParam String name){
return service.search(name);
}

@GetMapping("/status")
public List<Shipment> filter(@RequestParam String status){
return service.filter(status);
}

}