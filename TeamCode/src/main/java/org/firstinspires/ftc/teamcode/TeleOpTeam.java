package org.firstinspires.ftc.teamcode;

import android.media.MediaCodecInfo;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.navigation.Position;

import java.util.Base64;

/**
 * Created by ashley.peake on 8/30/2018.
 * Modified by Julia Zhou
 * Double modified by Claire Black 2021
 */



@TeleOp (name= "TeleOpTeam1", group= "Linear Opmode")
public class TeleOpTeam extends LinearOpMode {

    Hardware Legacy = new Hardware();

    // ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() throws InterruptedException {
        // arm crap
       /* Legacy.armLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Legacy.armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Legacy.armLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Legacy.armLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Legacy.armRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Legacy.armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Legacy.armRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Legacy.armRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Legacy.armLeft = hardwareMap.dcMotor.get("armLeft");
        Legacy.armRight = hardwareMap.dcMotor.get("armRight"); */
        //int currentArmPower = 0;
        //int currentArmPosition = 0;
        //stuff thats always here lol (last year stuff) -sparks
        System.out.println("Starting up");
        telemetry.addData("init pressed", "about to initialize");
        telemetry.update();

        System.out.println("Initialize Robot");
        Legacy.initializeRobot(hardwareMap);
        System.out.println("Robot Initialized");

        telemetry.addData("Status", "Ready!");

        telemetry.update();
       // Legacy.armRight.setPower(currentArmPower);
       // Legacy.armLeft.setPower(currentArmPower);

        waitForStart();

        while (opModeIsActive()) {

            double fwdBack = gamepad1.left_stick_y;
            double strafe = gamepad1.left_stick_x;
            double turn = gamepad1.right_stick_x;
           //Lt and Rt madness -Sparks + Hale
            float isLTpressed = gamepad1.left_trigger;
            float isRTpressed = gamepad1.right_trigger;
            //Lb and Rb stuff -Sparks
            boolean left_bumper;
            boolean right_bumper;
            //Dpad tings for the arm -sparks
            boolean dpad_up;
            boolean dpad_down;
            //misc -sparks
            boolean a;
            boolean b;
            //boolean armIsOff = true;
            //int upPosition = 1440 / 3;
            //int downPosition = 100;
            //int armPosition = Legacy.armLeft.getCurrentPosition();
            //int armPositionB = Legacy.armLeft.getCurrentPosition();







        //literally amazing hale and sparks are pros -sparks
            // sliding things
            if (isLTpressed != 0){
                Legacy.leftSlide.setPower(-.35);
                Legacy.rightSlide.setPower(-.35);
            } else {
                Legacy.rightSlide.setPower(0);
                Legacy.leftSlide.setPower(0);
            }
            if (isRTpressed != 0){
                Legacy.leftSlide.setPower(.35);
                Legacy.rightSlide.setPower(.35);
            } else {
                Legacy.rightSlide.setPower(0);
                Legacy.leftSlide.setPower(0);
            }
            //i am trying this one myself -sparks
            //check line 138-142 in hardware for tings
            //sweeper stuff
            if (gamepad1.left_bumper) {
                Legacy.sweeperLeft.setPower(.5);
                Legacy.sweeperRight.setPower(.5);
            }
            if (gamepad1.right_bumper) {
                Legacy.sweeperLeft.setPower(-.5);
                Legacy.sweeperRight.setPower(-.5);
            } else {
                Legacy.sweeperLeft.setPower(0);
                Legacy.sweeperRight.setPower(0);
            }
            //arm stuff -sparks

           /* if (gamepad1.dpad_down) {
                Legacy.armLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
                Legacy.armRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
                Legacy.armLeft.setPower(0.4);
                Legacy.armRight.setPower(-0.4);
            }
            if (gamepad1.dpad_up) {
                Legacy.armLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
                Legacy.armRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
                Legacy.armLeft.setPower(-0.4);
                Legacy.armRight.setPower(0.4);
            } */




            /*if (currentArmPower > 0) {
                Legacy.armLeft.getCurrentPosition();
                Legacy.armLeft.setTargetPosition(currentArmPosition);
                Legacy.armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                Legacy.armLeft.setPower(.3);
                Legacy.armRight.getCurrentPosition();
                Legacy.armRight.setTargetPosition(currentArmPosition);
                Legacy.armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                Legacy.armRight.setPower(.3);
            } else if (currentArmPower > 0){
                Legacy.armLeft.getCurrentPosition();
                Legacy.armLeft.setTargetPosition(currentArmPosition);
                Legacy.armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                Legacy.armLeft.setPower(.3);
                Legacy.armRight.getCurrentPosition();
                Legacy.armRight.setTargetPosition(currentArmPosition);
                Legacy.armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                Legacy.armRight.setPower(.3);
                }
            */
            /*if (currentArmPower > 0) {
                Legacy.armRight.getCurrentPosition();
                Legacy.armRight.setTargetPosition(currentArmPosition);
                Legacy.armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                Legacy.armRight.setPower(.3);
            } else if (currentArmPower > 0) {
                Legacy.armRight.getCurrentPosition();
                Legacy.armRight.setTargetPosition(currentArmPosition);
                Legacy.armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                Legacy.armRight.setPower(.3);
            }
            */


            //duck spinner finally -sparks
            if (gamepad1.a) {
                Legacy.duckSpin.setPower(1);
            } else {
                Legacy.duckSpin.setPower(0);
            }

            //










































































            /*if (gamepad1.dpad_up) {
                Legacy.armLeft.setPower(-0.30);
                Legacy.armRight.setPower(0.30);
                armIsOff = false;
            } else if (gamepad1.dpad_down) {
                Legacy.armLeft.setPower(0.30);
                Legacy.armRight.setPower(-0.30);
                armIsOff = false;
            } else
                Legacy.armLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
                Legacy.armRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
                armIsOff = true;

            Legacy.armLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            while (Legacy.armLeft.getCurrentPosition() != 0) {
                idle();
            }
            Legacy.armLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            Legacy.armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            armPosition = 1440 / 3;
            armPositionB = 0;

            Legacy.armRight = hardwareMap.dcMotor.get("armRight");
            Legacy.armRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            Legacy.armRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            while (Legacy.armRight.getCurrentPosition() != 0) {
                idle();
            }
            Legacy.armLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            Legacy.armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            if (gamepad1.dpad_up) {
                Legacy.armLeft.setTargetPosition(upPosition);
                Legacy.armRight.setTargetPosition(upPosition);
            }
            if (Legacy.armLeft.isBusy()) {
                Legacy.armLeft.setPower(.3);
            } else {
                Legacy.armLeft.setPower(0);
                while (Legacy.armLeft.getCurrentPosition() != 0) {
                    idle();
                }
                Legacy.armRight.setTargetPosition(armPosition);
                Legacy.armLeft.setTargetPosition(armPositionB);
                Legacy.armLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
                Legacy.armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                Legacy.armRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
                Legacy.armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            }
            if (gamepad1.dpad_down) {
                Legacy.armLeft.setTargetPosition(downPosition);
                Legacy.armRight.setTargetPosition(downPosition);
            }
            if (Legacy.armRight.isBusy()) {
                Legacy.armRight.setPower(-.3);
            } else {
                Legacy.armRight.setPower(0);
                Legacy.armLeft.setPower(0);
                Legacy.armRight.setTargetPosition(armPosition);
                Legacy.armRight.setTargetPosition(armPositionB);
                Legacy.armRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
                Legacy.armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                Legacy.armLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
                Legacy.armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            }
            */

/*
            //boxLid stuff -sparks
            if (gamepad1.a) {
                Legacy.boxLid.setPower(.40);
                if(gamepad1.a){
                    Legacy.boxLid.setPower(-.40);
                }
            }
           // to be contiued if (Legacy.boxLid. = 10)


            //duckSpin tings? this is going to be written when there are NO servos on the robot so yolo-sparks
            if (gamepad1.a) {
                Legacy.duckSpin.setPower(.40);
            } else {
                Legacy.duckSpin.setPower(0);
            }

*/

            if (gamepad1.start) {

                Legacy.leftFront.setPower((fwdBack + 1.25 * strafe - turn) * .25);
                Legacy.leftBack.setPower((fwdBack - 1.25 * strafe - turn) * .25);
                Legacy.rightFront.setPower((-fwdBack + 1.25 * strafe - turn) * .25);
                Legacy.rightBack.setPower((-fwdBack - 1.25 * strafe - turn) * .25);

            } else { // drive robot normally at full speed

                Legacy.leftFront.setPower((fwdBack + strafe - turn));
                Legacy.leftBack.setPower((fwdBack - strafe - turn));
                Legacy.rightFront.setPower((-fwdBack + strafe - turn));
                Legacy.rightBack.setPower((-fwdBack - strafe - turn));
            }


            /*Julia - try this, likely needs modification.
             * I have declared and initialized scissorLiftB in HardwareRoverRucks
             * The two lifts will move in the same direction together
             */


            /* if (gamepad2.dpad_up) {
                Rover.bigWheelA(1.0);
                //Rover.bigWheelB(1.0);
            } else if (gamepad2.dpad_down) {
                Rover.bigWheelA(-1.0);
                // Rover.bigWheelB(-1.0);
            } else {
                Rover.bigWheelA(0);
                // Rover.bigWheelB(0);


            }
             */

           /* if (gamepad2.right_bumper) {
                Rover.smallWheels(1);
            } else if (gamepad2.left_bumper) {
                Rover.smallWheels(-1);
            } else {
                Rover.smallWheels(0);
            }


            if (gamepad2.a) {
                Rover.clawA.setPower(0.9);
                Rover.clawB.setPower(0.7);
            } else if (gamepad2.b) {
                Rover.clawA.setPower(0.5);
                Rover.clawB.setPower(0.5);
            } else if (gamepad2.y) {
                Rover.clawA.setPower(0);
                Rover.clawB.setPower(0);
            } else if (gamepad2.x){
                    Rover.clawA.setPower(0);
                }

            */

            }
        }
    }




