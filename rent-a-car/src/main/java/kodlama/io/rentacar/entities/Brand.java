package kodlama.io.rentacar.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//lombok:
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="brands")
//@Data da ekleyebilirdin getter setter diye eklemektense ekstradan to string vb ekliyor
public class Brand {
//lombock ile yapacağız ileride

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

}
