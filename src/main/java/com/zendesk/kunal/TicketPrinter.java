package com.zendesk.kunal;

import org.zendesk.client.v2.model.Ticket;

public class TicketPrinter {

    public static void printTicketListing(Ticket ticket) {
        System.out.println(
                "Ticket ID: " + ticket.getId() +
                        "; Creation time: " + ticket.getCreatedAt() +
                        "; Requested by: " + ticket.getRequester() +
                        "; Assigned to: " + ticket.getAssigneeId()
        );
        System.out.println("\tSubject: " + ticket.getSubject() + "\n");
    }

    public static void printTicketWithDescription(Ticket ticket) {
        System.out.println(
                "Ticket ID: " + ticket.getId() +
                        "; Creation time: " + ticket.getCreatedAt() +
                        "; Requested by: " + ticket.getRequester() +
                        "; Assigned to: " + ticket.getAssigneeId()
        );
        System.out.println("\tSubject: " + ticket.getSubject());
        System.out.println("=== Description BEGINS ===");
        System.out.println(ticket.getDescription());
        System.out.println("=== Description ENDS ===\n");
    }
}
