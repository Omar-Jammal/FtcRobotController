package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.ServoPosTest;


@TeleOp
public class ServoPosTestOpMode extends OpMode{
    ServoPosTest bench = new ServoPosTest();


    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            bench.setServoPos(0);
        }
        else {
            bench.setServoPos(1.0);
        }
    }
}
