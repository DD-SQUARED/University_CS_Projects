package Java_Projects.Airline_Reservations;

// Test class
public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight("SA123");

        Passenger p1 = new Passenger("Alice", 101, "12345");
        Passenger p2 = new Passenger("Bob", 102, "67890");
        Passenger p3 = new Passenger("Alice", 101, "12345"); // duplicate

        flight.reserveTicket(p1);
        flight.reserveTicket(p2);
        flight.reserveTicket(p3);

        flight.displayPassengers();
        flight.displayPassengersNoDuplicates();
    }
}
