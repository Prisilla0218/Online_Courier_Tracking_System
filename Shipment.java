package com.example.courier.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shipment {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long shipmentId;

private String senderName;
private String receiverName;
private String pickupLocation;
private String deliveryLocation;

private LocalDate dispatchDate;
private LocalDate deliveryDate;

private String shipmentStatus;

@Column(updatable = false)
private final LocalDateTime createdDateTime = LocalDateTime.now();

public Shipment(){}

public Long getShipmentId(){
return shipmentId;
}

public void setShipmentId(Long shipmentId){
this.shipmentId=shipmentId;
}

public String getSenderName(){
return senderName;
}

public void setSenderName(String senderName){
this.senderName=senderName;
}

public String getReceiverName(){
return receiverName;
}

public void setReceiverName(String receiverName){
this.receiverName=receiverName;
}

public String getPickupLocation(){
return pickupLocation;
}

public void setPickupLocation(String pickupLocation){
this.pickupLocation=pickupLocation;
}

public String getDeliveryLocation(){
return deliveryLocation;
}

public void setDeliveryLocation(String deliveryLocation){
this.deliveryLocation=deliveryLocation;
}

public LocalDate getDispatchDate(){
return dispatchDate;
}

public void setDispatchDate(LocalDate dispatchDate){
this.dispatchDate=dispatchDate;
}

public LocalDate getDeliveryDate(){
return deliveryDate;
}

public void setDeliveryDate(LocalDate deliveryDate){
this.deliveryDate=deliveryDate;
}

public String getShipmentStatus(){
return shipmentStatus;
}

public void setShipmentStatus(String shipmentStatus){
this.shipmentStatus=shipmentStatus;
}

public LocalDateTime getCreatedDateTime(){
return createdDateTime;
}

}