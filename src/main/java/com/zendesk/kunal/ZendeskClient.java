package com.zendesk.kunal;

import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.Ticket;

import java.util.List;
import java.util.stream.Stream;

public class ZendeskClient {

    private Zendesk client;
    private static int TICKET_PAGE_LIMIT = 25;

    public ZendeskClient(String username, String password, String url) {
        this.client = new Zendesk.Builder(url)
                .setUsername(username)
                .setPassword(password)
                .build();
    }

    public Ticket getTicket(long ticketId) {
        return this.client.getTicket(ticketId);
    }

    public Stream<List<Ticket>> getTickets() {
        Iterable<Ticket> tickets = this.client.getTickets();
        return Streams.stream(Iterables.partition(tickets, TICKET_PAGE_LIMIT));
    }
}
