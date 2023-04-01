package kodlama.io.rentacar.business.dto.responses.get;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import kodlama.io.rentacar.entities.enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class GetAllCarsResponse {
    private int id;
    private  int ModelYear;
    private String DailyPrice;
    private String plate;
    @Enumerated(EnumType.STRING)
    private State state;
}
