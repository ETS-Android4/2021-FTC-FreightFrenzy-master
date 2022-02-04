package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by ashley.peake on 8/30/2018.
 * Modified by Julia Zhou
 * Double modified by Claire Black 2021
 */



@Autonomous (name= "Autonomous", group= "Linear Opmode")
public class AutonomousTeam extends LinearOpMode {

    //wheels (Legacy)
    public DcMotor leftFront;
    public DcMotor leftBack;
    public DcMotor rightFront;
    public DcMotor rightBack;
    //General Motors (arm and slide)(Legacy) -sparks
    public DcMotor armLeft;
    public DcMotor armRight;
    public DcMotor leftSlide;
    public DcMotor rightSlide;
    //servos (Legacy) -sparks
    public CRServo sweeperLeft;
    public CRServo sweeperRight;
    public Servo boxLid;
    public CRServo duckSpin;
    Hardware Legacy = new Hardware();



    // ElapsedTime runtime = new ElapsedTime();
    @Override
    public void runOpMode() throws InterruptedException {

        System.out.println("Starting up");
        telemetry.addData("init pressed", "about to initialize");
        telemetry.update();
        System.out.println("Initialize Robot");
        Legacy.initializeRobot(hardwareMap);
        System.out.println("Robot Initialized");
        telemetry.addData("Status", "Ready!");
        telemetry.update();

        HardwareMap HWMap = hardwareMap;


        //initialize Wheels
        leftFront = HWMap.dcMotor.get("leftFront");
        leftBack = HWMap.dcMotor.get("leftBack");
        rightFront = HWMap.dcMotor.get("rightFront");
        rightBack = HWMap.dcMotor.get("rightBack");
        // general motors (Legacy) -sparks
        armLeft = HWMap.dcMotor.get("armLeft");
        armRight = HWMap.dcMotor.get("armRight");
        leftSlide = HWMap.dcMotor.get("leftSlide");
        rightSlide = HWMap.dcMotor.get("rightSlide");
        //type(arm) = HWMap.dcMotor.get("leftFront");
        //type(slide) = HWMap.dcMotor.get("leftFront");

        //servos (Legacy) -sparks
        //duckSpin is just duck spinner shortened
        sweeperLeft = HWMap.crservo.get("sweeperLeft");
        sweeperRight = HWMap.crservo.get("sweeperRight");
        boxLid = HWMap.servo.get("boxLid");
        duckSpin = HWMap.crservo.get("duckSpin");
        waitForStart();
        Legacy.driveForwardTime(.2,1500);
        Legacy.driveRightTime(.3, 950);
        Legacy.driveBackTime(.1, 1750);
        Legacy.stopDriving(0);
        Legacy.spinDuckTime(1, 15000);
        Legacy.driveForwardTime(.2, 1900);
        Legacy.stopDrivingTime(0,100000);




        while (opModeIsActive()) {

        }
    }
}
