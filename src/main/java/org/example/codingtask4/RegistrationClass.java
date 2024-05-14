package org.example.codingtask4;

public class RegistrationClass {

    private String email;
    private String userName;
    private String password;


    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Requires Yahoo email.");
        }
    }

    public void setUserName(String userName) {
        if (userName != null && !userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid Username. Username must contain more than 6 characters in length.");
        }
    }

    public void setPassword(String password) {
        if (password != null && !password.isEmpty() && !password.contains(userName) && password.length() > 6) {
            this.password = password;
        } else {
            System.out.println("Invalid password. Password cant contain Username and must be more than 6 characters in length.");
        }
    }

    public void printInfo() {
        System.out.println(email);
        System.out.println(userName);
    }

    public static void main(String[] args) {

        RegistrationClass obj1 = new RegistrationClass();
        obj1.setEmail("bkorey@yahoo.com");
        obj1.setUserName("newmoney123");
        obj1.setPassword("lane231123");

        obj1.printInfo();
    }
}

