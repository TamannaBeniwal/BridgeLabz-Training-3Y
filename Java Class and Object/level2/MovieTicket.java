public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    public MovieTicket() {
        this.movieName = "";
        this.seatNumber = "";
        this.price = 0.0;
        this.isBooked = false;
    }


    public void bookTicket(String movieName, String seatNumber, double price) {
        if (!isBooked) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket successfully booked!");
        } else {
            System.out.println("Ticket is already booked.");
        }
    }

    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("\n Ticket Details ");
            System.out.println("Movie Name : " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price:  " + price);
        } else {
            System.out.println("No ticket has been booked yet.");
        }
    }
}
