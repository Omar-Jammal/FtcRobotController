package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {}

    @Override
    public void loop() {
        // runs 50 times a second
        //double speedForwardLeftStick = -gamepad1.left_stick_y / 2.0;
        //double speedForwardRightStick = -gamepad1.right_stick_y / 2.0;
        // The "-" sign is to make the value the opposite (so forward becomes 1 and backward becomes -1) and the division is so that the robot moves slower.
        double joysticksXDifference = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumTriggers = gamepad1.left_trigger + gamepad1.right_trigger;


        telemetry.addData("Left Stick X", gamepad1.left_stick_x);
        telemetry.addData("Left Stick Y", gamepad1.left_stick_y);

        telemetry.addData("Right Stick X", gamepad1.right_stick_x);
        telemetry.addData("Right Stick Y", gamepad1.right_stick_y);

        telemetry.addData("A_Is_Pressed", gamepad1.a);
        telemetry.addData("B_Is_Pressed", gamepad1.b);

        telemetry.addData("Difference in joystick X value", joysticksXDifference);
        telemetry.addData("Sum of triggers values", sumTriggers);



    }
}
