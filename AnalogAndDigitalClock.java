import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnalogAndDigitalClock extends JPanel implements Runnable {
    private Thread thread = null;
    private Font font = new Font("Arial", Font.BOLD, 16);

    public AnalogAndDigitalClock() {
        setDoubleBuffered(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Get the current time
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        // Draw the analog clock
        drawAnalogClock(g, hour, minute, second);

        // Draw the digital clock
        drawDigitalClock(g, hour, minute, second);
    }

    private void drawAnalogClock(Graphics g, int hour, int minute, int second) {
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

    private void drawDigitalClock(Graphics g, int hour, int minute, int second) {
        String time = String.format("%02d:%02d:%02d", hour, minute, second);
        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString(time, 30, 130);
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
        JFrame frame = new JFrame("Analog and Digital Clock");
        AnalogAndDigitalClock clock = new AnalogAndDigitalClock();
        frame.add(clock);
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clock.start();
    }
}
