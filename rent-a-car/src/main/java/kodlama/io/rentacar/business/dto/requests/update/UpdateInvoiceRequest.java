package kodlama.io.rentacar.business.dto.requests.update;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UpdateInvoiceRequest {
    @NotNull
    private int carId;
    @NotBlank
    private String cardHolder;
    @NotBlank
    private String modelName;
    @NotBlank
    private String brandName;
    @NotBlank
    private String plate;
    @NotNull
    @Min(2006)
    private int modelYear;
    @NotNull
    @Min(0)
    private double dailyPrice;
    @NotNull
    @Min(0)
    private int rentedForDays;
    private LocalDateTime rentedAt;

}
