package com.AssigmentToDoIT;

public class App {
    public static void main (String [] args) {
        AppUserDAO appUserDAO = new AppUserDAO();
        AppUser newUser = new AppUser("username", "password");
        final Object persit = ((AppUserDAOCollection) appUserDAO).persit(newUser);

        AppUser foundUser = new findByUsername("username");
        System.out.println("Found user: " + foundUser.getUsername());

        appUserDAO.remove(Integer.parseInt("username"));

    }

    private static class findByUsername extends AppUser {
        public findByUsername(String username) {
            super(username);
        }
    }
}
