package com.michalk.device.cost.energy.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceRepository extends CrudRepository<DeviceModel, Integer> {

    List<DeviceRepository> findByName(String name);

}
