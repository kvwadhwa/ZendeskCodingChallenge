package com.zendesk.kunal;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    public static String TEST_URL = "https://ENTER_URL.zendesk.com";
    public static String TEST_USERNAME = "ENTER_USERNAME";
    public static String TEST_PASSWORD = "ENTER_PASSWORD";

    @Test
    void viewAllTicketsTest() {
        ByteArrayInputStream in = new ByteArrayInputStream(
                (TEST_URL + "\n"
                        + TEST_USERNAME + "\n"
                        + TEST_PASSWORD + "\n"
                        + "1\n"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "3\n").getBytes());
        System.setIn(in);
        assertDoesNotThrow(() -> {
            Main.main(new String[]{});
        });
    }

    @Test
    void viewSingleTicketTest() {
        ByteArrayInputStream in = new ByteArrayInputStream(
                (TEST_URL + "\n"
                        + TEST_USERNAME + "\n"
                        + TEST_PASSWORD + "\n"
                        + "2\n"
                        + "1\n"
                        + "3\n").getBytes());
        System.setIn(in);
        assertDoesNotThrow(() -> {
            Main.main(new String[]{});
        });
    }

    @Test
    void gracefulExceptionHandling() {
        ByteArrayInputStream in = new ByteArrayInputStream(
                (TEST_URL + "\n"
                        + TEST_USERNAME + "\n"
                        + TEST_USERNAME + "\n"
                        + "2\n"
                        + "1\n"
                        + "3\n").getBytes());
        System.setIn(in);
        assertDoesNotThrow(() -> {
            Main.main(new String[]{});
        });
    }

    @Test
    void invalidOptionValidOption() {
        ByteArrayInputStream in = new ByteArrayInputStream(
                (TEST_URL + "\n"
                        + TEST_USERNAME + "\n"
                        + TEST_PASSWORD + "\n"
                        + "10\n"
                        + "2\n"
                        + "1\n"
                        + "3\n").getBytes());
        System.setIn(in);
        assertDoesNotThrow(() -> {
            Main.main(new String[]{});
        });
    }

}