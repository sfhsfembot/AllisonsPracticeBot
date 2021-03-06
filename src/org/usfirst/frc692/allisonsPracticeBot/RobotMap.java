// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc692.allisonsPracticeBot;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController mecanumDriveTrainfrontLeftMotor;
    public static SpeedController mecanumDriveTrainfrontRightMotor;
    public static SpeedController mecanumDriveTrainbackLeftMotor;
    public static SpeedController mecanumDriveTrainbackRightMotor;
    public static RobotDrive mecanumDriveTrainmecanumDriveTrain;
    public static SpeedController gatherergatherMotorTwo;
    public static SpeedController gatherergatherMotorOne;
    public static SpeedController elevatorelevatorMotorUpDwon;
    public static DoubleSolenoid elevatorflapper;
    public static Compressor pneumaticsflapperPressure;
    public static SpeedController caterpillarcaterpillarMotorTwo;
    public static SpeedController caterpillarcaterpillarMotorOne;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        mecanumDriveTrainfrontLeftMotor = new TalonSRX(0);
        LiveWindow.addActuator("mecanumDriveTrain", "frontLeftMotor", (TalonSRX) mecanumDriveTrainfrontLeftMotor);
        
        mecanumDriveTrainfrontRightMotor = new TalonSRX(1);
        LiveWindow.addActuator("mecanumDriveTrain", "frontRightMotor", (TalonSRX) mecanumDriveTrainfrontRightMotor);
        
        mecanumDriveTrainbackLeftMotor = new TalonSRX(2);
        LiveWindow.addActuator("mecanumDriveTrain", "backLeftMotor", (TalonSRX) mecanumDriveTrainbackLeftMotor);
        
        mecanumDriveTrainbackRightMotor = new TalonSRX(9);
        LiveWindow.addActuator("mecanumDriveTrain", "backRightMotor", (TalonSRX) mecanumDriveTrainbackRightMotor);
        
        mecanumDriveTrainmecanumDriveTrain = new RobotDrive(mecanumDriveTrainfrontLeftMotor, mecanumDriveTrainfrontRightMotor,
              mecanumDriveTrainbackLeftMotor, mecanumDriveTrainbackRightMotor);
        
        mecanumDriveTrainmecanumDriveTrain.setSafetyEnabled(true);
        mecanumDriveTrainmecanumDriveTrain.setExpiration(0.1);
        mecanumDriveTrainmecanumDriveTrain.setSensitivity(0.5);
        mecanumDriveTrainmecanumDriveTrain.setMaxOutput(1.0);
        mecanumDriveTrainmecanumDriveTrain.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        mecanumDriveTrainmecanumDriveTrain.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        mecanumDriveTrainmecanumDriveTrain.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        mecanumDriveTrainmecanumDriveTrain.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        gatherergatherMotorTwo = new TalonSRX(7);
        LiveWindow.addActuator("gatherer", "gatherMotorTwo", (TalonSRX) gatherergatherMotorTwo);
        
        gatherergatherMotorOne = new Talon(8);
        LiveWindow.addActuator("gatherer", "gatherMotorOne", (Talon) gatherergatherMotorOne);
        
        elevatorelevatorMotorUpDwon = new TalonSRX(4);
        LiveWindow.addActuator("elevator", "elevatorMotorUpDwon", (TalonSRX) elevatorelevatorMotorUpDwon);
        
        elevatorflapper = new DoubleSolenoid(0, 0, 1);      
        LiveWindow.addActuator("elevator", "flapper", elevatorflapper);
        
        pneumaticsflapperPressure = new Compressor(0);
        
        
        caterpillarcaterpillarMotorTwo = new TalonSRX(5);
        LiveWindow.addActuator("caterpillar", "caterpillarMotorTwo", (TalonSRX) caterpillarcaterpillarMotorTwo);
        
        caterpillarcaterpillarMotorOne = new TalonSRX(6);
        LiveWindow.addActuator("caterpillar", "caterpillarMotorOne", (TalonSRX) caterpillarcaterpillarMotorOne);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
