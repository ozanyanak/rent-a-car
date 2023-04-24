package kodlama.io.rentacar.business.dto.requests.create;

import jakarta.validation.constraints.Min;
import kodlama.io.rentacar.common.utils.annotations.NotFutureYear;
import kodlama.io.rentacar.common.utils.annotations.ValidPlate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateCarRequest {
    private int modelId;
    @Min(1998)
    @NotFutureYear
    private int ModelYear;
    @Min(1)
    private double DailyPrice;
    @ValidPlate
    private String plate;


}
