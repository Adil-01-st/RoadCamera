import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoadCamera {
    public static void main(String[] args) throws IOException {
        //Parametr program
        int maxOncomingSpeed = 30; // km/h
        int speedFineGrade = 20; // km/h
        int finePerGrade = 100; // dollars
        int criminalSpeed = 180; // km/h

        //=============================================================

        System.out.println("Write the speed of the car:");

        //Speed car
        int oncomingSpeed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        if (oncomingSpeed >= criminalSpeed) {
            System.out.println("Police call...");
        } else if (oncomingSpeed > maxOncomingSpeed) {
            int overSpeed = oncomingSpeed - maxOncomingSpeed;
            int gradesCount = overSpeed / speedFineGrade;
            int fine = finePerGrade * gradesCount;
            System.out.println("Fine amount: " + fine);
        } else {
            System.out.println("Speed not exeeded");
        }
    }
}