package com.zendesk.kunal;

import com.ginsberg.junit.exit.ExpectSystemExit;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    public static String TEST_URL = "";
    public static String TEST_USERNAME = "";
    public static String TEST_PASSWORD = "";

    @Test
    @ExpectSystemExit
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
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Main.main(new String[]{});

        assertTrue(out.toString().contains("Subject: voluptate dolor deserunt ea deserunt"));
        assertTrue(out.toString().contains("Subject: officia magna velit nostrud ullamco"));
        assertTrue(out.toString().contains("Subject: adipisicing duis quis consequat velit"));
        assertTrue(out.toString().contains("Subject: in nostrud occaecat consectetur aliquip"));
    }

    @Test
    @ExpectSystemExit
    void viewSingleTicketTest() {
        ByteArrayInputStream in = new ByteArrayInputStream(
                (TEST_URL + "\n"
                        + TEST_USERNAME + "\n"
                        + TEST_PASSWORD + "\n"
                        + "2\n"
                        + "25\n"
                        + "3\n").getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Main.main(new String[]{});

        assertTrue(out.toString().contains("Subject: voluptate dolor deserunt ea deserunt"));
    }

    @Test
    @ExpectSystemExit
    void gracefulExceptionHandling() {
        ByteArrayInputStream in = new ByteArrayInputStream(
                (TEST_URL + "\n"
                        + TEST_USERNAME + "\n"
                        + TEST_USERNAME + "\n"
                        + "2\n"
                        + "1\n"
                        + "3\n").getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{});
        assertTrue(out.toString().contains("Couldn't authenticate you"));
    }

    @Test
    @ExpectSystemExit
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
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{});
        assertTrue(out.toString().contains("Invalid choice, please choose again from the menu."));
    }

}