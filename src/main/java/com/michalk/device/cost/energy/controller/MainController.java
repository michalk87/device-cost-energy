package com.michalk.device.cost.energy.controller;

import com.michalk.device.cost.energy.model.DeviceForm;
import com.michalk.device.cost.energy.model.DeviceModel;
import com.michalk.device.cost.energy.model.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    DeviceRepository deviceRepository;

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("deviceForm", new DeviceForm());

        model.addAttribute("devices", deviceRepository.findAll());

        return "index";
    }

    @PostMapping
    public String index(@ModelAttribute("deviceForm") DeviceForm form){
        deviceRepository.save(new DeviceModel(form));

        return "index";
    }
}
