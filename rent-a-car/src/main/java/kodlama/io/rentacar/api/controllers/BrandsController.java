package kodlama.io.rentacar.api.controllers;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.entities.Brand;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/brands")

public class BrandsController {

    private final BrandService service;
    @GetMapping
    public List<Brand> getAll( ){
        return service.gettAll();
    }


    @GetMapping("/{id}")
    public Brand getById(@PathVariable int id){
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Brand add(@RequestBody Brand brand) throws IllegalAccessException {
        return service.add(brand);
    }
    @PutMapping("/{id}")
    public Brand update(@PathVariable int id, Brand brand) throws IllegalAccessException {
        return service.update(id,brand);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable  int id)  {

        service.delete(id);
    }
}
