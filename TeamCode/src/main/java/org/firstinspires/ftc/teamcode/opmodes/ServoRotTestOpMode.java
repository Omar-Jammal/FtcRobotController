package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.ServoRotTest;

@TeleOp
public class ServoRotTestOpMode extends OpMode {

    ServoRotTest rotbench = new ServoRotTest();

    @Override
    public void init() {
        rotbench.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1.b) {
            rotbench.setServoRot(1.0);
        }
        else {
            rotbench.setServoRot(0);
        }
    }
}
