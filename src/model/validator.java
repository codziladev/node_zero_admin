package model;

import javax.swing.JOptionPane;

public class validator {

    public static boolean isUsernameValid(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null, "Full Name Field can't be empty", "username Validation", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (value.matches("^[a-zA-Z]{3,30}$")) {
            JOptionPane.showMessageDialog(null, "Full Name must be 3-15 characters and only contain letters.", "username Validation", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean isEmailEmpty(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null, "Email Field can't be empty", "Text Field Validation", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
         if (value.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
            return true;
        }else{
         JOptionPane.showMessageDialog(null, "Enter Valid email.", "email Validation", JOptionPane.WARNING_MESSAGE);
                 return false;
         }
    }
    
    public static boolean isAddressEmpty(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null, "Address Field can't be empty", "Text Field Validation", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean isBirtDayEmpty(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null, "Date of Birth Field can't be empty", "Text Field Validation", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean isPasswordValid(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null, "Password Field can't be empty", "password Validation", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (!value.matches("^(?=(?:.*[A-Za-z]){3})(?=(?:.*\\d){1})[A-Za-z\\d]{4}$")) {
            JOptionPane.showMessageDialog(null, "password must 3 letters and 1 number.", "Password Validation", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }
    
    public static boolean isPassword2Valid(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null, "Conform Password Field can't be empty", "password Validation", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (!value.matches("^(?=(?:.*[A-Za-z]){3})(?=(?:.*\\d){1})[A-Za-z\\d]{4}$")) {
            JOptionPane.showMessageDialog(null, "password must 3 letters and 1 number.", "Password Validation", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    public static boolean ismobileValid(String value) {
        if (!value.matches("^(0{1})(7{1})([0|1|2|4|5|6|7|8]{1})([0-9]{7})")) {
            JOptionPane.showMessageDialog(null, "Enter a valid mobile number", "mobile Number Validation", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

}
