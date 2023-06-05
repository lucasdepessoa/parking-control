package com.parkingcontrol.parkingControl.repositories;

import com.parkingcontrol.parkingControl.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
}
