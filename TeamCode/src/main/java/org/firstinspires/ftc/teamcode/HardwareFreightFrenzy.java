package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import static java.lang.Thread.sleep;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;

public class HardwareFreightFrenzy {

    //Wheels
    public DcMotor leftFront;
    public DcMotor leftBack;
    public DcMotor rightFront;
    public DcMotor rightBack;

    //outtake slingshot thingy
   // public DcMotor leftoutake;
   // public DcMotor rightoutake;



    int driveTime;


    //-------------------------------------Initialization----------------------

    public void InitializeRobot(HardwareMap hardwareMap) {
        HardwareMap HWMap = hardwareMap;

        //initialize motors

        leftFront = HWMap.dcMotor.get("leftFront");
        leftBack = HWMap.dcMotor.get("leftBack");
        rightFront = HWMap.dcMotor.get("rightFront");
        rightBack = HWMap.dcMotor.get("rightBack");

    }


    //------------------------------------Basic Driving--------------------

    public void DriveStraight(double power, long totalSeconds, int Direction) throws InterruptedException {

        leftFront.setPower(power * Direction);
        leftBack.setPower(power * Direction);
        rightFront.setPower(power * -Direction);
        rightBack.setPower(power * -Direction);

        Thread.sleep(totalSeconds);

        // stops all motion

        leftFront.setPower(0.0);
        leftBack.setPower(0.0);
        rightFront.setPower(0.0);
        rightBack.setPower(0.0);
    }

    public void DriveTurn(double power, long totalSeconds, int Direction) throws InterruptedException {
        leftFront.setPower(power * Direction);
        leftBack.setPower(power * Direction);
        rightFront.setPower(power * Direction);
        rightBack.setPower(power * Direction);

        Thread.sleep(totalSeconds);


        // stops all motion

        leftFront.setPower(0.0);
        leftBack.setPower(0.0);
        rightFront.setPower(0.0);
        rightBack.setPower(0.0);
    }

    public void DriveSideways(double power, long totalSeconds,  int leftFrontDirection, int leftBackDirection, int rightFrontDirection, int rightBackDirection) throws InterruptedException {
        leftFront.setPower(power * leftFrontDirection);
        leftBack.setPower(power * leftBackDirection);
        rightFront.setPower(power * rightFrontDirection);
        rightBack.setPower(power * rightBackDirection);

        Thread.sleep(totalSeconds);
        // stops all motion

        leftFront.setPower(0.0);
        leftBack.setPower(0.0);
        rightFront.setPower(0.0);
        rightBack.setPower(0.0);
    }

   // public void Outake(double power) {
    //    leftoutake.setPower(power);
    //    rightoutake.setPower(power);
    }




