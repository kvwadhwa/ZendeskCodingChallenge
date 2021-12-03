package com.zendesk.kunal;

import org.zendesk.client.v2.model.Ticket;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    private static Scanner SCANNER;
    private static ZendeskClient ZD;

    public static void main(String[] args) {
        setupScanner();
        setupZendeskClient();

        while (true) {
            displayMenu();
            System.out.print("Please select an option and hit ENTER: ");
            int choice = SCANNER.nextInt();
            SCANNER.nextLine();
            if (choice == 3) { break; }
            processChoice(choice);
        }
        System.exit(0);
    }

    private static void setupScanner() {
        SCANNER = new Scanner(System.in);
    }

    private static void setupZendeskClient() {
        System.out.println("Enter your Zendesk URL: ");
        String url = SCANNER.nextLine();
        System.out.println("Enter your Username (Email): ");
        String username = SCANNER.nextLine();
        System.out.println("Enter your Password: ");
        String password = SCANNER.nextLine();

        ZD = new ZendeskClient(username, password, url);
    }

    private static void processChoice(int choice) {
        switch (choice) {
            case 1:
                try {
                    viewAllTickets();
                } catch (Exception ex) {
                    printException(ex);
                }
                break;
            case 2:
                try {
                    System.out.print("Enter valid Ticket ID: ");
                    long ticketId = SCANNER.nextLong();
                    SCANNER.nextLine();
                    viewTicket(ticketId);
                } catch (Exception ex) {
                    printException(ex);
                }
                break;
            default:
                System.out.println("Invalid choice, please choose again from the menu.");
                break;
        }
    }

    private static void printException(Exception ex) {
        System.out.println("Encountered an exception: " + ex.getClass().getCanonicalName());
        System.out.println(ex.getMessage());
    }

    private static void viewTicket(long ticketId) {
        Ticket ticket = ZD.getTicket(ticketId);
        TicketPrinter.printTicketWithDescription(ticket);
    }

    private static void viewAllTickets() {
        Stream<List<Ticket>> ticketStream = ZD.getTickets();
        ticketStream.forEach(tickets -> {
            tickets.forEach(TicketPrinter::printTicketListing);
            System.out.println("Hit ENTER to continue.");
            SCANNER.nextLine();
        });
    }

    private static void displayMenu() {
        System.out.println("\n\nMenu");
        System.out.println("Choice 1: View all tickets.");
        System.out.println("Choice 2: View specific ticket.");
        System.out.println("Choice 3: Exit.");
    }
}
