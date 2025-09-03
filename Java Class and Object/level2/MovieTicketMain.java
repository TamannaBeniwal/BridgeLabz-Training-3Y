import java.util.Scanner;

public class MovieTicketMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        System.out.println("Welcome to the Movie Ticket Booking System!");

        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter seat number: ");
        String seatNumber = scanner.nextLine();

        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();

        ticket.bookTicket(movieName, seatNumber, price);
        ticket.displayTicketDetails();

        scanner.close();
    }
}
