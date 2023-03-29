package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.business.dto.requests.create.CreateBrandRequest;
import kodlama.io.rentacar.business.dto.requests.update.UpdateBrandRequest;
import kodlama.io.rentacar.business.dto.responses.create.CreateBrandResponse;
import kodlama.io.rentacar.business.dto.responses.get.GetAllBrandsResponse;
import kodlama.io.rentacar.business.dto.responses.get.GetBrandResponse;
import kodlama.io.rentacar.business.dto.responses.update.UpdateBrandResponse;
import kodlama.io.rentacar.entities.Brand;
import kodlama.io.rentacar.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandManager implements BrandService {

    private final BrandRepository repository;
    private final ModelMapper modelMapper;


    @Override
    public List<GetAllBrandsResponse> gettAll() {
        List<Brand> brands= repository.findAll();
        List<GetAllBrandsResponse> response= brands
                .stream()
                .map(brand -> modelMapper.map(brand, GetAllBrandsResponse.class))
        .toList();
        return response;
     }

    @Override
    public GetBrandResponse getById(int id) {
        checkİfBrandExist(id);

        Brand brand= repository.findById(id).orElseThrow();
        GetBrandResponse response= modelMapper.map(brand,GetBrandResponse.class);
        return response;

    }

    @Override
    public CreateBrandResponse add(CreateBrandRequest request) {
//        Brand brand=  new Brand();
//        brand.setName(request.getName());
//        repository.save(brand);
//        CreateBrandResponse response= new CreateBrandResponse();
//        response.setId(brand.getId());
//        response.setName(brand.getName());
//        return response;

        Brand brand = modelMapper.map(request, Brand.class);
        brand.setId(0);
        repository.save(brand);
        CreateBrandResponse response =modelMapper.map(brand,CreateBrandResponse.class);

        return response;
    }

    @Override
    public UpdateBrandResponse update(int id, UpdateBrandRequest request) {
        request.setId(id);
        Brand brand = modelMapper.map(request, Brand.class);
        Brand updatedBrand = repository.save(brand);
        return modelMapper.map(updatedBrand, UpdateBrandResponse.class);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    private void checkİfBrandExist(int id) {
        if (!repository.existsById(id)) throw new RuntimeException("marka bulunamadı");

    }
}
