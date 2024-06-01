package ru.elektr0ni3561.homework6.task1;

public class Main1 {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        try {
            System.out.println(isCorrectLoginAndPassword("QWERTY1 ", "asdfjkl;", "asdfjkl;")); //WrongLoginException
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(isCorrectLoginAndPassword("QWERTY", "asdfjkl; ", "';lkfdas'")); //WrongPasswordException
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(isCorrectLoginAndPassword("Qwerty", "asdfjkl2", "asdfjkl2")); //true
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }

    private static boolean isCorrectLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null) {
            throw new WrongLoginException("Login can't be null.");
            //return false; //Невозможно вернуть false после выброса исключений.
        }
        if (password == null) {
            throw new WrongPasswordException("Password can't be null.");
        }
        if (login.length() >= 20) {
            throw new WrongLoginException("Login must contain a maximum of 20 characters.");
        }
        if (login.contains(" ")) {
            throw new WrongLoginException("Login can't contain a space character.");
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException("Password must contain a maximum of 20 characters.");
        }
        if (password.contains(" ")) {
            throw new WrongPasswordException("Password can't contain a space character.");
        }
        if (!password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Password must contain at least one digit.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("The confirmed password must match the password.");
        }
        return true;
    }
}
