package org.firstinspires.ftc.teamcode.mechanisms;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MotorTest{

    private DcMotor motor;
    public void init(HardwareMap hwMap) {
        motor = hwMap.get(DcMotor.class, "front_right_motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void setMotorSpeed(double speed){
            motor.setPower(speed);
    }
}

