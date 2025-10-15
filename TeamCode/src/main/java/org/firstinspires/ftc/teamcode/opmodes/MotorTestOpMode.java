package org.firstinspires.ftc.teamcode.opmodes;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
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
        if (gamepad1.x) {
            board.setMotorSpeed(1);
        }
        
    }

 }
