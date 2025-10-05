package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class VariablePractice extends OpMode {

    @Override
    public void init() {
        int teamNumber = 27124;
        int motorAngle = 54;
        int grade = 9;
        double motorSpeed = 0.8;
        boolean hasBall = false;
        String teamName = "Robo Owls";

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Motor Angle", motorAngle);
        telemetry.addData("Has Ball", hasBall);
        telemetry.addData("Team Name", teamName);
        telemetry.addData("Grade", grade);
    }

    @Override
    public void loop() {}
}