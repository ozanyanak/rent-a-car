package kodlama.io.rentacar.entities;


import jakarta.persistence.*;
import kodlama.io.rentacar.entities.enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  int ModelYear;
    private String DailyPrice;
    private String plate;
    @Enumerated(EnumType.STRING)
    private State state;

    @ManyToOne
    private Model model;

}
