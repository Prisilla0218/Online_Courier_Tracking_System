package com.example.courier.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.courier.model.Shipment;
import com.example.courier.repository.ShipmentRepository;

@Service
public class ShipmentService {

    private final ShipmentRepository repo;

    public ShipmentService(ShipmentRepository repo) {
        this.repo = repo;
    }

    public Shipment save(Shipment s) {

        if (s.getSenderName() == null || s.getSenderName().isEmpty()) {
            throw new RuntimeException("Sender Name Required");
        }

        if (s.getReceiverName() == null || s.getReceiverName().isEmpty()) {
            throw new RuntimeException("Receiver Name Required");
        }

        if (s.getPickupLocation() == null || s.getPickupLocation().isEmpty()) {
            throw new RuntimeException("Pickup Location Required");
        }

        if (s.getShipmentStatus() == null) {
            s.setShipmentStatus("Dispatched");
        }

        return repo.save(s);
    }

    public List<Shipment> getAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public List<Shipment> search(String name) {
        return repo.findByReceiverNameContainingIgnoreCase(name);
    }

    public List<Shipment> filter(String status) {
        return repo.findByShipmentStatus(status);
    }
}