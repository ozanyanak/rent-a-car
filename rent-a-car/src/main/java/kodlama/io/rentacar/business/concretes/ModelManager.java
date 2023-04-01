package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.ModelService;
import kodlama.io.rentacar.business.dto.requests.create.CreateModelRequest;
import kodlama.io.rentacar.business.dto.requests.update.UpdateModelRequest;
import kodlama.io.rentacar.business.dto.responses.create.CreateModelResponse;
import kodlama.io.rentacar.business.dto.responses.get.GetAllModelsResponse;
import kodlama.io.rentacar.business.dto.responses.get.GetModelResponse;
import kodlama.io.rentacar.business.dto.responses.update.UpdateModelResponse;
import kodlama.io.rentacar.entities.Model;
import kodlama.io.rentacar.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModelManager implements ModelService {
    private final ModelRepository repository;
    private final ModelMapper modelMapper;
    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> models= repository.findAll();
        List<GetAllModelsResponse> response= models
                .stream()
                .map(brand -> modelMapper.map(brand, GetAllModelsResponse.class))
                .toList();
        return response;    }

    @Override
    public GetModelResponse getById(int id) {
        checkİfBrandExist(id);

        Model model= repository.findById(id).orElseThrow();
        GetModelResponse response= modelMapper.map(model,GetModelResponse.class);
        return response;
    }

    private void checkİfBrandExist(int id) {
        if (!repository.existsById(id)) throw new RuntimeException("model bulunamadı");

    }

    @Override
    public CreateModelResponse add(CreateModelRequest request) {
        Model model = modelMapper.map(request, Model.class);
        model.setId(0);
        repository.save(model);
        CreateModelResponse response =modelMapper.map(model,CreateModelResponse.class);

        return response;
    }

    @Override
    public UpdateModelResponse update(int id, UpdateModelRequest request) {
        request.setId(id);
        Model model = modelMapper.map(request, Model.class);
        Model updatedModel= repository.save(model);
        return modelMapper.map(updatedModel, UpdateModelResponse.class);

    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
