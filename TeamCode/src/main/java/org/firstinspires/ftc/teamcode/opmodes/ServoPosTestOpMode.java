package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.ServoPosTest;


@TeleOp
public class ServoPosTestOpMode extends OpMode{
    ServoPosTest servo0 = new ServoPosTest();
    ServoPosTest servo1 = new ServoPosTest();


    @Override
    public void init() {
        servo0.init(hardwareMap, "servo_positional_0");
        servo1.init(hardwareMap, "servo_positional_1");
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            servo0.setServoPos(0);
            servo1.setServoPos(0);
        }
        else {
            servo0.setServoPos(1.0);
            servo1.setServoPos(1.0);
        }
    }
}
