package kodlama.io.rentacar.common.constants;

public class Messages {

    public static class Car {
        public static final String NotExist = "CAR_NOT_EXİST";
        public static final String Exist = "CAR_ALREADY_EXİST";
        public static final String NotAvaible = "CAR_NOT_AVAIBLE";

    }

    public static class Model {
        public static final String NotExist = "MODEL_NOT_EXİST";
        public static final String Exist = "MODEL_ALREADY_EXİST";

    }

    public static class Brand {
        public static final String NotExist = "Brand_Not_Exist";
        public static final String Exist = "Brand_ALREADY_Exist";
    }

    public static class Maintenance {
        public static final String NotExist = "MAINTENANCE_Not_Exist";
        public static final String CarExist = "CAR_IS_CURRENTLY_UNDER_MAINTENANCE";
        public static final String CarNotExist = "CAR_IS_NOT_REGISTERED_FOR_MAINTENANCE";
        public static final String CarRented = "CAR_IS_CURRENTLY_RENTED_AND_CANNOT_BE_SERVICED_FOR_MAINTENANCE";
    }


    public static class Rental {
        public static final String NotExist = "RENTAL_NOT_EXİST";
    }

    public static class Payment {
        public static final String NotFound = "PAYMENT_NOT_FOUND";
        public static final String CarDNumberAlreadyExist = "CARD_NUMBER_ALREADY_EXİSTS";
        public static final String NotEnoughMoney = "NOT_ENOUGH_MONEY";
        public static final String NotAValidPayment = "NOT_A_VALID_PAYMENT";
        public static final String Failed = "PAYMENT_FAILED";
    }

    public static class Invoice {
        public static final String NotFound = "INVOICE_NOT_EXİST";
    }

}
