package dk.quarantaine.commons.helpers;

public class FormatHelper {

    public static boolean validatePassword(String toValidate){
        return (toValidate == null ? false : toValidate.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%#^*?&])[A-Za-z\\d@$!#%^*?&]{8,}$"));

    }

    public static boolean validatePhoneNumber(String toValidate) {
        return (toValidate == null ? false : toValidate.matches("^[0-9]{8}$"));
    }

    public static boolean validateUsername(String toValidate) {
        return (toValidate == null ? false : toValidate.matches("^([A-Za-z\\d]){6,}$"));
    }

}
