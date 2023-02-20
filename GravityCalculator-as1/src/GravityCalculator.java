//It's a mini code that calculates the final position of an object free fell.
public class GravityCalculator {
    public static void main(String[] args) {
        double gravity =-9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;  //x(t) = 0.5 × at^2 + vit + xi
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        finalPosition = 0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}
//didn't you feel any shame for putting this? yok, hiç.
