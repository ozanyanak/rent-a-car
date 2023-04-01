package kodlama.io.rentacar.api.controllers;

import kodlama.io.rentacar.business.abstracts.ModelService;
import kodlama.io.rentacar.business.dto.requests.create.CreateModelRequest;
import kodlama.io.rentacar.business.dto.requests.update.UpdateModelRequest;
import kodlama.io.rentacar.business.dto.responses.create.CreateModelResponse;
import kodlama.io.rentacar.business.dto.responses.get.GetAllModelsResponse;
import kodlama.io.rentacar.business.dto.responses.get.GetModelResponse;
import kodlama.io.rentacar.business.dto.responses.update.UpdateModelResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/models")
public class ModelsController {
    private final ModelService service;

    @GetMapping
    public List<GetAllModelsResponse> getAll( ){
        return service.getAll();
    }


    @GetMapping("/{id}")
    public GetModelResponse getById(@PathVariable int id){
        return service.getById(id);

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateModelResponse add(@RequestBody CreateModelRequest request) throws IllegalAccessException {
        return service.add(request);
    }
    @PutMapping("/{id}")
    public UpdateModelResponse update(@PathVariable int id, @RequestBody UpdateModelRequest request) {
        return service.update(id, request);
    }
    // put response ve request olacak
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable  int id)  {

        service.delete(id);
    }
}