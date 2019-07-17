package com.michalk.device.cost.energy.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table
@NoArgsConstructor
public class DeviceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Double cost;

    public DeviceModel(DeviceForm form){
        name = form.getName();
        cost = form.getCost();
    }
}
