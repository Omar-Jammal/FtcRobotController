package org.firstinspires.ftc.teamcode.opmodes;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.mechanisms.MotorTest;


@TeleOp()
public class MotorTestOpMode extends OpMode {
    MotorTest board = new MotorTest();


    @Override
    public void init() {
        board.init(hardwareMap);
    }
    @Override
    public void loop() {
        if (gamepad1.y) {
            board.setMotorSpeed(0.5);
        }
        else {
            board.setMotorSpeed(0.0);
        }
        if (gamepad1.a) {
            board.setMotorZeroBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }
        else {
            board.setMotorZeroBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        }

        telemetry.addData("Motor Revs", board.getMotorRevs());
    }

 }
