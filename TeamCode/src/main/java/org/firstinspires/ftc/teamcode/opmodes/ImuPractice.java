package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.ControlHubIMU;

@TeleOp
public class ImuPractice extends OpMode {

    ControlHubIMU controlHubIMU = new ControlHubIMU();
    double heading;


    @Override
    public void init() {
        controlHubIMU.init(hardwareMap);
    }

    @Override
    public void loop() {
        heading = controlHubIMU.getHeading();

        if (heading < 0.5 && heading > -0.5) {
            controlHubIMU.setMotor(0.0);
        }
        else if (heading > 0.5) {
            controlHubIMU.setMotor(0.5); 
        }
        else {
            controlHubIMU.setMotor(-0.5);
        }


        telemetry.addData("Heading", controlHubIMU.getHeading()); // Will get the heading in degrees, not radians
    }

}
