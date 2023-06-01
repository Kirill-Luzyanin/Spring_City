package de.ait.city.service;

import de.ait.city.dto.CityRequestDTO;
import de.ait.city.dto.CityResponseDTO;
import de.ait.city.entity.City;
import de.ait.city.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class CityServiceImpl {

    private CityRepository repository;

    /*
    public List<City> getAllCities() {
        List<City> list = new ArrayList<>();
        //repository.findAll().forEach(l->list.add(l));   ???
        repository.findAll().forEach(list::add);
        return list;
    }

    public City addCity(City city) {
        repository.save(city);
        return city;
    }
    */

    // с использованием DTO
    public List<CityResponseDTO> getAllCities() {
        List<CityResponseDTO> list = new ArrayList<>();
        repository.findAll().forEach(
                c -> {
                    CityResponseDTO cdto = new CityResponseDTO(
                            c.getId(),
                            c.getName(),
                            c.getCountry(),
                            c.getPopulation(),
                            c.getArea()
                    );
                    list.add(cdto);
                }
        );
        return list;
    }

    public CityResponseDTO addCity(CityRequestDTO city) {
        City c = new City(null, city.getName(), city.getCountry(), city.getPopulation(), city.getArea());
        City res = repository.save(c);
        CityResponseDTO crdto = new CityResponseDTO(res.getId(), res.getName(), res.getCountry(), res.getPopulation(), res.getArea());
        return crdto;
    }

    public CityResponseDTO updateCity(Long id, CityRequestDTO city) {
        City c = new City(id, city.getName(), city.getCountry(), city.getPopulation(), city.getArea());
        City res = repository.save(c);
        CityResponseDTO crdto = new CityResponseDTO(res.getId(), res.getName(), res.getCountry(), res.getPopulation(), res.getArea());
        return crdto;
    }

}
