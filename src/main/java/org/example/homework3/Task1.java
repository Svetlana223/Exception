package org.example.homework3;

public class Task1 {
    public static void main(String[] args) {
        try {
            String str = "ffgd";
            String result = passwordVerifier(str);
            System.out.println("Result: " + result);

        } catch (PasswordException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

//    public static String passwordVerifier(String str) throws PasswordException {
//        if (str.equals("1")) {
//            if (str.length() < 8) {
//                throw new PasswordException("Пароль должен содержать не менее 8 символов");
//            }
//            return "good";
//        } else if (str.equals("2")) {
//            boolean hasDigits = false;
//            for (int i = 0; i < str.length() && !hasDigits; i++) {
//                if (Character.isDigit(str.charAt(i))) {
//                    hasDigits = true;
//                    break;
//                }
//            }
//            if (!hasDigits) {
//                throw new PasswordException("Пароль должен содержать хотя бы одну цифру");
//            }
//            return "good";
//        } else if (str.equals("3")) {
//            boolean hasUppercase = false;
//            for (char c : str.toCharArray()) {
//                if (Character.isUpperCase(c)) {
//                    hasUppercase = true;
//                    break;
//                }
//            }
//            if (!hasUppercase) {
//                throw new PasswordException("Пароль должен содержать хотя бы одну заглавную букву");
//            }
//            return "good";
//        } else {
//            throw new PasswordException("Невозможный пароль");
//        }
//    }
    public static String passwordVerifier(String str)
            throws PasswordException {
        switch (str) {
            case "1":
                if (str.length() < 8) {
                    throw new PasswordException("Пароль должен содержать не меньше 8 символов");
                }
                return "good";
            case "2":
                boolean hasDigits = false;
                for(int i = 0; i < str.length() && !hasDigits; i++) {
                    if(Character.isDigit(str.charAt(i))) {
                        hasDigits = true;
                        break;
                    }
                }
                if (hasDigits == false) {
                    throw new PasswordException("Пароль должен содержать хотябы один символ");
                }
                return "good";
            case "3":
                boolean result = false;
                char[] array=str.toCharArray();
                for(char x:array) {
                    if (Character.isUpperCase(x)) {
                        result = true;
                        break;
                    }
                }
                if (result == false){
                    throw new PasswordException("Пароль должен содержать хотя бы одну заглавную букву");
                }
                return "good";
            default:
                throw new PasswordException("Невозможный пароль");
        }
    }
}

class PasswordException extends Exception {
    public PasswordException(String str) {
        super(str);
    }
}


