// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  //TODO: Set CANSparkMaxs
  public CANSparkMax flywheelMotor = new CANSparkMax(15, MotorType.kBrushless);
  public CANSparkMax angleMotor = new CANSparkMax(16, MotorType.kBrushless);

  //TODO: Find the max and min angle; FYI future you home at the bottom!!!
  public final double maxAngle = 0.0;
  public final double minAngle = 0.0;

  /** Creates a new Shooter. */
  public Shooter() {
    flywheelMotor.clearFaults();
    angleMotor.clearFaults();
    //No need to declear any PIDs or Anything 
  }
  /** 
   * @param speed
   * Sets the power to the flywheel or angle
   */
  public void setPower(double speed, CANSparkMax motor){
    motor.set(speed);
  }
  /** 
   * @param speed
   * Stops the flywheel or angle
   */
  public void stop(CANSparkMax motor){
    motor.set(0.0);
  }
  /**
   * @return the angle of the angle adjuster
   */
  public double getAngle(){
    return angleMotor.getEncoder().getPosition();
  }

  //TODO: Make sure it is in the min and max range
  //TODO: Set the angle to go a position slowly
  //Future TODO: Add in lasercan detection


  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }
}
