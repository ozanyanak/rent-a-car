package kodlama.io.rentacar.common.utils.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class PlateValidator implements ConstraintValidator<ValidPlate, String> {

    private static final Pattern PLATE_PATTERN = Pattern.compile("^(0[1-9]|[1-7][0-9]|8[01]) [A-Z]{1,3} \\d{3,4}$");


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value == null || PLATE_PATTERN.matcher(value).matches();
    }
}