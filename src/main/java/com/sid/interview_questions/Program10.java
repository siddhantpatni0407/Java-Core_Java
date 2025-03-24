/**
 * Develop a Java program that models a Cinema Booking System with the following
 * requirements:
 * An Auditorium containing multiple Screens.
 * Each Screen hosts multiple Movie Shows.
 * Each Movie Show offers seating in three categories: Gold, Silver, and Platinum.
 * Implement functionality to book tickets, check seat availability, and include additional relevant
 * methods to enhance the booking system.
 */

package com.sid.interview_questions;

/**
 * @author Siddhant Patni
 */

import java.util.*;

class Seat {
    enum Category {GOLD, SILVER, PLATINUM}

    private final Category category;
    private boolean isBooked;

    public Seat(Category category) {
        this.category = category;
        this.isBooked = false;
    }

    public boolean bookSeat() {
        if (!isBooked) {
            isBooked = true;
            return true;
        }
        return false;
    }

    public boolean isAvailable() {
        return !isBooked;
    }

    public Category getCategory() {
        return category;
    }
}

class MovieShow {
    private final String movieName;
    private final String time;
    private final List<Seat> seats;

    public MovieShow(String movieName, String time, int goldSeats, int silverSeats, int platinumSeats) {
        this.movieName = movieName;
        this.time = time;
        this.seats = new ArrayList<>();
        addSeats(goldSeats, silverSeats, platinumSeats);
    }

    private void addSeats(int gold, int silver, int platinum) {
        for (int i = 0; i < gold; i++) seats.add(new Seat(Seat.Category.GOLD));
        for (int i = 0; i < silver; i++) seats.add(new Seat(Seat.Category.SILVER));
        for (int i = 0; i < platinum; i++) seats.add(new Seat(Seat.Category.PLATINUM));
    }

    public boolean bookTicket(Seat.Category category) {
        for (Seat seat : seats) {
            if (seat.getCategory() == category && seat.isAvailable()) {
                seat.bookSeat();
                System.out.println("Ticket booked for " + movieName + " at " + time + " in " + category + " category.");
                return true;
            }
        }
        System.out.println("No available seats in " + category + " category for " + movieName + " at " + time);
        return false;
    }

    public void checkAvailability() {
        Map<Seat.Category, Integer> availableSeats = new HashMap<>();
        for (Seat.Category category : Seat.Category.values()) availableSeats.put(category, 0);

        for (Seat seat : seats) {
            if (seat.isAvailable()) availableSeats.put(seat.getCategory(), availableSeats.get(seat.getCategory()) + 1);
        }

        System.out.println("Availability for " + movieName + " at " + time + ": " + availableSeats);
    }

    public String getMovieName() {
        return movieName;
    }

    public String getTime() {
        return time;
    }
}

class Screen {
    private final int screenNumber;
    private final List<MovieShow> shows;

    public Screen(int screenNumber) {
        this.screenNumber = screenNumber;
        this.shows = new ArrayList<>();
    }

    public void addMovieShow(MovieShow show) {
        shows.add(show);
    }

    public void listShows() {
        System.out.println("Screen " + screenNumber + " Shows:");
        for (MovieShow show : shows) {
            System.out.println(" - " + show.getMovieName() + " at " + show.getTime());
        }
    }

    public Optional<MovieShow> getShow(String movieName, String time) {
        return shows.stream().filter(show -> show.getMovieName().equalsIgnoreCase(movieName) && show.getTime().equals(time)).findFirst();
    }
}

class Auditorium {
    private final String name;
    private final List<Screen> screens;

    public Auditorium(String name) {
        this.name = name;
        this.screens = new ArrayList<>();
    }

    public void addScreen(Screen screen) {
        screens.add(screen);
    }

    public void listScreens() {
        System.out.println("Auditorium: " + name);
        for (Screen screen : screens) {
            screen.listShows();
        }
    }

    public Optional<Screen> getScreen(int screenNumber) {
        return screens
                .stream()
                .filter(screen -> screenNumber == screenNumber)
                .findFirst();
    }
}

public class Program10 {
    public static void main(String[] args) {
        Auditorium auditorium = new Auditorium("Grand Cinema");

        Screen screen1 = new Screen(1);
        screen1.addMovieShow(new MovieShow("Avatar", "6:00 PM", 5, 5, 3));
        screen1.addMovieShow(new MovieShow("Inception", "9:00 PM", 4, 4, 2));

        Screen screen2 = new Screen(2);
        screen2.addMovieShow(new MovieShow("Titanic", "7:00 PM", 6, 6, 4));
        screen2.addMovieShow(new MovieShow("Interstellar", "10:00 PM", 5, 5, 3));

        auditorium.addScreen(screen1);
        auditorium.addScreen(screen2);

        auditorium.listScreens();

        // Book tickets
        Optional<Screen> screenOpt = auditorium.getScreen(1);
        if (screenOpt.isPresent()) {
            Optional<MovieShow> showOpt = screenOpt.get().getShow("Avatar", "6:00 PM");
            showOpt.ifPresent(show -> show.bookTicket(Seat.Category.GOLD));
        }

        // Check availability
        Optional<Screen> screenOpt2 = auditorium.getScreen(2);
        if (screenOpt2.isPresent()) {
            Optional<MovieShow> showOpt2 = screenOpt2.get().getShow("Titanic", "7:00 PM");
            showOpt2.ifPresent(MovieShow::checkAvailability);
        }
    }

}