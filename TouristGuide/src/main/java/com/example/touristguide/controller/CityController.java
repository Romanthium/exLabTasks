package com.example.touristguide.controller;

import com.example.touristguide.modell.City;
import com.example.touristguide.service.CityService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
@RequestMapping("/cities")
public class CityController {

    private final CityService cityService;

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("cities", cityService.findAll());
        return "cities/cities";
    }

    @GetMapping("/new")
    public String create(@ModelAttribute("city") City city) {
        return "cities/new";
    }

    @PostMapping()
    public String update(@ModelAttribute("city") City city) {

        cityService.save(city);
        return "redirect:/cities";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") long id, Model model) {
        try {
            model.addAttribute("city", cityService.findById(id).orElseThrow(EntityNotFoundException::new));
        } catch (EntityNotFoundException e) {
            return "redirect:/cities";
        }
        return "cities/edit";
    }

    @PatchMapping("{id}")
    public String update(@ModelAttribute("city") City city,
                         @PathVariable("id") long id) {

        cityService.update(id, city);
        return "redirect:/cities";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable("id") long id) {
        cityService.delete(id);
        return "redirect:/cities";
    }


}




























