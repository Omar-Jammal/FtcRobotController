package org.firstinspires.ftc.teamcode.practice;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class GamePadPractice extends OpMode{

    @Override
    public void init() {}

    @Override
    public void loop() {
        double speedForward = gamepad1.left_stick_y / 2.0;
        double diffXJoysticks = gamepad1.left_stick_x - gamepad1.right_stick_x;


        telemetry.addData("Left X", gamepad1.left_stick_x);
        telemetry.addData("Left Y", speedForward);
        telemetry.addData("Right X", gamepad1.right_stick_x);
        telemetry.addData("Right Y", gamepad1.right_stick_y);
        telemetry.addData("Difference X", diffXJoysticks);

        telemetry.addData("A button", gamepad1.a);
        telemetry.addData("B button", gamepad1.b);


    }
}
