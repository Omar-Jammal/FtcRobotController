package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class ControlHubIMU {
    private IMU imu;
    private DcMotor motor;


    public void init(HardwareMap hwMap) {
        imu = hwMap.get(IMU.class, "imu");
        motor = hwMap.get(DcMotor.class, "front_right_motor");


        RevHubOrientationOnRobot RevOrientation = new RevHubOrientationOnRobot (
                RevHubOrientationOnRobot.LogoFacingDirection.UP,
                RevHubOrientationOnRobot.UsbFacingDirection.FORWARD // May be a problem if there is no usb
        );

        imu.initialize(new IMU.Parameters(RevOrientation));

        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public double getHeading() {
        return imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.DEGREES);
    }

    public void setMotor(double power) {
        motor.setPower(power);
    }

}
