package kodlama.io.rentacar.repository.concretes;

import kodlama.io.rentacar.entities.concretes.Brand;
import kodlama.io.rentacar.repository.abstracts.BrandRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository(){
        brands=new ArrayList<>();
        brands.add(new Brand(1, "Mercedes"));
        brands.add(new Brand(2, "BMW"));
        brands.add(new Brand(3, "Audi"));
        brands.add(new Brand(4, "Volvo"));
        brands.add(new Brand(5, "Renault"));

    }

    @Override
    public List<Brand> getAll() {


        return brands;
    }

    @Override
    public Brand getById(int id) {
        for (Brand x:brands){
            if(x.getId()==id)
                return x;
        }
        return null;
    }

    @Override
    public Brand add(Brand brand) {
       brands.add(brand);
        return brand;
    }

    @Override
    public Brand update(int id, Brand brand) {

        for (Brand x:brands) {
            if (x.getId() == id) {

                x.setName(brand.getName());
                return x;
            }
        }
        return null;
    }

    @Override
    public void delete(int id) {
        for (Brand x : brands) {
            if (x.getId() == id) {
                brands.remove(x);
            }
        }
    }
}
