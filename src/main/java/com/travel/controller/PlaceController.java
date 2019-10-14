package com.travel.controller;

import city.City;
import city.CityService;
import com.google.gson.Gson;
import com.travel.dto.PlaceDto;
import district.District;
import district.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import place.Place;
import place.PlaceService;

import java.rmi.RemoteException;


@Controller
@RequestMapping(value = "/place")
public class PlaceController {
    @Autowired
    PlaceService placeService;
    @Autowired
    DistrictService districtService;
    @Autowired
    CityService cityService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllPlace(Model model) throws RemoteException {
        try {
            model.addAttribute("places", placeService.getAll());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "place/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm(Model model) throws RemoteException {
        model.addAttribute("cities", cityService.getAll());
        model.addAttribute("districts", districtService.getByCityId(1));
        model.addAttribute("placeDto", new PlaceDto());
        return "place/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createPlace(PlaceDto placeDto) throws RemoteException {
        City c = cityService.getCity(placeDto.getCitId());
        District d = districtService.getDistrict(placeDto.getDistrictId());

        place.City city = new place.City();
        city.setMtp(c.getMtp());
        place.District district = new place.District();
        district.setMaqh(d.getMaqh());

        Place p = new Place();
        p.setName(placeDto.getName());
        p.setCity(city);
        p.setDistrict(district);
        placeService.save(p);

        return "redirect:/place";
    }
}
