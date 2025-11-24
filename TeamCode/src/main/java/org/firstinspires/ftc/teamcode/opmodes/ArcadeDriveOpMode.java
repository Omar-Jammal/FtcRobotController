package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.ArcadeDrive;


@TeleOp
public class ArcadeDriveOpMode extends OpMode {
    ArcadeDrive drive = new ArcadeDrive();

    double forward, rotate;
    @Override
    public void init(){
        drive.init(hardwareMap);
    }

    @Override
    public void loop() {
        forward = gamepad1.left_stick_y;
        rotate = -gamepad1.right_stick_x;


        telemetry.addData("Forward", forward);
        telemetry.addData("Rotate", rotate);

        drive.drive(rotate, forward);
    }
}
