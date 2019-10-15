package com.travel.controller;

import city.City;
import city.CityService;
import com.cloudinary.Cloudinary;
import com.google.gson.Gson;
import com.travel.dto.PlaceDto;
import district.District;
import district.DistrictService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import place.Place;
import place.PlaceService;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;


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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getPlace(Model model, @PathVariable long id) throws RemoteException {
        try {
            model.addAttribute("p", placeService.getPlace(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "place/detail";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm(Model model) throws RemoteException {
        model.addAttribute("cities", cityService.getAll());
        model.addAttribute("districts", districtService.getByCityId(1));
        model.addAttribute("placeDto", new PlaceDto());
        return "place/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createPlace(PlaceDto placeDto) throws RemoteException, IOException {
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
        p.setPhoto(placeDto.getImageUrl());
        placeService.save(p);
        System.out.println(new Gson().toJson(placeDto));

        return "redirect:/place";
    }

    public Cloudinary configCloud() {
        Map config = new HashMap();
        config.put("cloud_name", "thanhtung");
        config.put("api_key", "253531658368943");
        config.put("api_secret", "mr--Qlsj7VY_D3HsUZv2nC39Hoc");
        Cloudinary cloudinary = new Cloudinary(config);
        return cloudinary;
    }
}
