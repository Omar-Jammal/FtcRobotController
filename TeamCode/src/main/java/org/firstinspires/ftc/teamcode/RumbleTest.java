package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Disabled
@TeleOp
public class RumbleTest extends OpMode{

    @Override
    public void init() {}

    @Override
    public void loop() {
        if (gamepad1.a) {
            telemetry.addData("Rumble", "On");
            gamepad1.rumbleBlips(3);
            // Won't stop at three but will loop continuously
        }

    }

}
