//create a graphical user interface (GUI) using a library like Swing or JavaFX, and then use graphics to draw the clock face, hour, minute, and second hands


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnalogClock extends JPanel implements Runnable {
    private Thread thread = null;

    public AnalogClock() {
        setDoubleBuffered(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Get the current time
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        // Calculate the angles for the hour, minute, and second hands
        int angleHour = (hour * 30) + (minute / 2);
        int angleMinute = minute * 6;
        int angleSecond = second * 6;

        // Set the color for the hands
        g.setColor(Color.BLACK);

        // Draw the hour hand
        int xHour = (int) (Math.sin(Math.toRadians(angleHour)) * 50 + 75);
        int yHour = (int) (-Math.cos(Math.toRadians(angleHour)) * 50 + 75);
        g.drawLine(75, 75, xHour, yHour);

        // Draw the minute hand
        int xMinute = (int) (Math.sin(Math.toRadians(angleMinute)) * 60 + 75);
        int yMinute = (int) (-Math.cos(Math.toRadians(angleMinute)) * 60 + 75);
        g.drawLine(75, 75, xMinute, yMinute);

        // Draw the second hand
        g.setColor(Color.RED);
        int xSecond = (int) (Math.sin(Math.toRadians(angleSecond)) * 70 + 75);
        int ySecond = (int) (-Math.cos(Math.toRadians(angleSecond)) * 70 + 75);
        g.drawLine(75, 75, xSecond, ySecond);
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public void stop() {
        if (thread != null) {
            thread = null;
        }
    }

    public void run() {
        while (thread != null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            repaint();
        }
        thread = null;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Analog Clock");
        AnalogClock clock = new AnalogClock();
        frame.add(clock);
        frame.setSize(150, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clock.start();
    }
}
