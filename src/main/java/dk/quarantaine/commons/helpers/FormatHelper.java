package dk.quarantaine.commons.helpers;

public class FormatHelper {

    /**
     * Checks if the password fulfills password policy
     * @param toValidate the password to validate
     * @return if the password is validated
     */
    public static boolean validatePassword(String toValidate){
        return (toValidate == null ? false : toValidate.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%#^*?&])[A-Za-z\\d@$!#%^*?&]{8,}$"));

    }

    /**
     * Checks if the phone number fulfills format
     * @param toValidate the phone number to validate
     * @return if the phone number is validated
     */
    public static boolean validatePhoneNumber(String toValidate) {
        return (toValidate == null ? false : toValidate.matches("^[0-9]{8}$"));
    }

    /**
     * Checks if the username fulfills format
     * @param toValidate the username to validate
     * @return if the username is validated
     */
    public static boolean validateUsername(String toValidate) {
        return (toValidate == null ? false : toValidate.matches("^([A-Za-z\\d]){6,}$"));
    }

}
