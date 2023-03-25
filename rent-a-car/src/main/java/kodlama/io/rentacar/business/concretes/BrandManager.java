package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.entities.Brand;
import kodlama.io.rentacar.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BrandManager implements BrandService {

    private  final BrandRepository repository;


    @Override
    public List<Brand> gettAll() {
        return repository.findAll();
    }

    @Override
    public Brand getById(int id) {
        checkİfBrandExist(id);
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Brand add(Brand brand) {
        return repository.save(brand);
    }

    @Override
    public Brand update(int id, Brand brand) {
        brand.setId(id);
        return repository.save(brand);
    }

    @Override
    public void delete(int id) {
         repository.deleteById(id);
    }

    private void  checkİfBrandExist(int id){
        if (!repository.existsById(id)) throw new RuntimeException("marka bulunamadı");

    }
}
