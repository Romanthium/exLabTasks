package com.example.touristguide.service;

import com.example.touristguide.modell.City;
import com.example.touristguide.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Transactional
public class CityService {

    private final CityRepository cityRepository;

    @Transactional(readOnly = true)
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public Optional<City> findByName(String name) {
        return cityRepository.findByName(name);
    }

    public void save(City city) {
        cityRepository.save(city);
    }

    public void update(Long id, City city) {
        city.setId(id);
        cityRepository.save(city);
    }

    public void delete(Long id) {
        cityRepository.deleteById(id);
    }
}
