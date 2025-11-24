package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class ServoRotTest {
    private CRServo servoRot;

    public void init(HardwareMap hwMap) {
        servoRot = hwMap.get(CRServo.class, "servo_rotational");
    }

    public void setServoRot(double power) {
        servoRot.setPower(power);
    }
}
