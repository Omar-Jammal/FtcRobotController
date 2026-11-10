package org.firstinspires.ftc.teamcode.practice;

public class RobotLocationPractice {
    double angle;
    double x;
    double y;

    // constructor method
    public RobotLocationPractice(double angle, double x, double y) {
        this.angle = angle;
        this.x = x;
        this.y = y;

    }

    // Angle methods
    public double getHeading() {
        // this method normalizes robot heading between -180 and 180
        // this is useful for calculating turn angles, especially when crossing the 0-360 degree boundary

        double angle = this.angle; // copy the angle of imu
        while (angle > 180) {
            angle -= 360; // subtract until in target range
        }
        while (angle <= -180) {
            angle += 360; // add until in target range

        }
        return angle; // return normalized value (meaning it is put inside a preferred range, -180 to 180)


    }
    public void turnRobot(double angleChange) {
        this.angle += angleChange;
    }
    public void setAngle(double angle) {
        this.angle = angle;

    }
    public double getAngle() {
        return this.angle;

    }

    // X methods
    public double getX() {
        return this.x;
    }
    public void changeX(double changeAmount) {
        this.x += changeAmount;
    }
    public void setX(double x) {
        this.x = x;
    }

    // Y methods
    public double getY() {
        return this.y;
    }
    public void changeY(double changeAmount) {
        this.y += changeAmount;
    }
    public void setY(double y) {
        this.y = y;
    }

}