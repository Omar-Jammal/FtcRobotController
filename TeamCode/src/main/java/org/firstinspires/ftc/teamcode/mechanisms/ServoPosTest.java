package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class ServoPosTest {

    private Servo servoPos;

    public void init(HardwareMap hwMap) {
        servoPos = hwMap.get(Servo.class, "servo_positional");
    }

    public void setServoPos(double angle) {
        servoPos.setPosition(angle);
    }



}
