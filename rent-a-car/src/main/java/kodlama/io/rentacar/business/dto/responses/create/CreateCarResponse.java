package kodlama.io.rentacar.business.dto.responses.create;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import kodlama.io.rentacar.entities.enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateCarResponse {
    private int id;
    private int modelId;

    private int ModelYear;
    private String dailyPrice;
    private String plate;
    @Enumerated(EnumType.STRING)
    private State state;
}
