package kodlama.io.rentacar.common.utils.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.Year;

public class NotFutureyearValidator implements ConstraintValidator<NotFutureYear, Integer> {

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        int currentYear = Year.now().getValue();

        //todo hata varsa return kısmını ifle yaz
        return value <= currentYear;
    }
}
