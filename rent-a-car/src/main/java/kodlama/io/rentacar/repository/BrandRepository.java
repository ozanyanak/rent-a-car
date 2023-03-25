package kodlama.io.rentacar.repository;

import kodlama.io.rentacar.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository crud işlemlerini zaten yapıyor ekleme, silme güncelleme vb
public interface BrandRepository extends JpaRepository<Brand,Integer>{
// özel bir işlem lazımsa buraya

}
