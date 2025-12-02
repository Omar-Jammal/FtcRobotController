package org.firstinspires.ftc.teamcode.mechanisms;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MotorTest{
    private DcMotor motor;
    private double ticksPerRev; //revolution

    public void init(HardwareMap hwMap) {
        motor = hwMap.get(DcMotor.class, "front_left_motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor.getMotorType().getTicksPerRev();


    }

    public void setMotorSpeed(double speed){
            motor.setPower(speed);
    }

    public double getMotorRevs() {
        return motor.getCurrentPosition() / ticksPerRev; // "normalizes" the value, meaning,
        // it takes the total number of ticks divided by how many ticks are in one rev, so we know how many revs it has turned
        // for example, by doing this, instead of getting a high number of ticks we can get 4.5 as in, 4.5 full revolutions

    }

    public void setMotorZeroBehavior(DcMotor.ZeroPowerBehavior zeroBehavior) {
        motor.setZeroPowerBehavior(zeroBehavior);
    }
}

