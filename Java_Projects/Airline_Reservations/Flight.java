package Java_Projects.Airline_Reservations;

class Flight {
    private String flightNumber;
    private MyLinkedList<Passenger> passengers;

    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
        passengers = new MyLinkedList<>();
    }

    public void reserveTicket(Passenger p) {
        passengers.append(p);
    }

    public void cancelTicket(Passenger p) {
        passengers.delete(p);
    }

    public boolean checkTicket(Passenger p) {
        return passengers.contains(p);
    }

    public void displayPassengers() {
        System.out.println("Passengers on Flight " + flightNumber + ":");
        System.out.println(passengers.toString());
    }

    public void displayPassengersNoDuplicates() {
        System.out.println("Unique Passengers on Flight " + flightNumber + ":");
        System.out.println(passengers.checkDouble().toString());
    }
}
