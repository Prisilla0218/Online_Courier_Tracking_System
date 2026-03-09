package com.example.courier.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.courier.model.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment,Long>{

List<Shipment> findByReceiverNameContainingIgnoreCase(String name);

List<Shipment> findByShipmentStatus(String status);

}