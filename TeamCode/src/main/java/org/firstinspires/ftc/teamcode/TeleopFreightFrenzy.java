package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp (name = "TeleopFreightFrenzy")

public class TeleopFreightFrenzy extends LinearOpMode {

    HardwareFreightFrenzy Legacy = new HardwareFreightFrenzy();

    @Override
    public void runOpMode() throws InterruptedException {

        System.out.println("Starting up");
        telemetry.addData("init pressed", "about to initialize");
        telemetry.update();

        System.out.println("Initialize Robot");
        Legacy.InitializeRobot(hardwareMap);
        System.out.println("Robot Initialized");

        telemetry.addData("Status", "Ready!");

        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {

            double fwdBack = gamepad1.left_stick_y;
            double strafe = gamepad1.left_stick_x;
            double turn = gamepad1.right_stick_x;

            if (gamepad1.start) {

                Legacy.leftFront.setPower((fwdBack - 1.5 * strafe - turn) * .25);
                Legacy.leftBack.setPower((fwdBack + 1.5 * strafe - turn) * .25);
                Legacy.rightFront.setPower((-fwdBack - 1.5 * strafe - turn) * .25);
                Legacy.rightBack.setPower((-fwdBack + 1.5 * strafe - turn) * .25);

            } else { // drive robot normally at full speed

                Legacy.leftFront.setPower((fwdBack - strafe - turn));
                Legacy.leftBack.setPower((fwdBack + strafe - turn));
                Legacy.rightFront.setPower((-fwdBack - strafe - turn));
                Legacy.rightBack.setPower((-fwdBack + strafe - turn));

            }
            { if (gamepad2.a) {
                Legacy.spinner.setPower(.5);

            } else if (gamepad2.b) {
                Legacy.spinner.setPower(0);

            }


            }


        }


    }
}





