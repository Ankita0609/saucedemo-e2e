package utils;

import java.awt.*;
import java.awt.event.InputEvent;

public class PopupHandler {

    // This method clicks on the Google Smart Lock popup ("Change your password" → OK button)
    public static void clickGoogleSmartLockOK() {

        try {
            // Allow popup to appear
            Thread.sleep(1500);

            Robot robot = new Robot();
            robot.setAutoDelay(150);

            // Coordinates calibrated for 1920x1080 screen
            // OK button center roughly at (1250, 495)
            int x = 1250;
            int y = 495;

            // Move mouse to OK button
            robot.mouseMove(x, y);
            Thread.sleep(200);

            // Perform mouse click
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            System.out.println("Google Smart Lock popup dismissed via Robot click.");

            Thread.sleep(300);

        } catch (Exception e) {
            System.out.println("Popup dismiss failed or popup not visible: " + e.getMessage());
        }
    }
}
