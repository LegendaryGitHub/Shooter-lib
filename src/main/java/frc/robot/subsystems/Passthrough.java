// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Passthrough extends SubsystemBase {
  public CANSparkMax motor = new CANSparkMax(13, MotorType.kBrushless);
  //Note for future: the second motor is NOT connected to the belt system
  public CANSparkMax backMotor = new CANSparkMax(14, MotorType.kBrushless);
  
  /** Creates a new Passthrough. */
  public Passthrough() {
    //TODO: Clear the sticky faults
    motor.clearFaults();
    backMotor.clearFaults();
    backMotor.follow(motor);
  }
  //Slow speeds for passthough
  public void intake(){
    motor.set(0.1);//adjust speed as fit
  }

  public void eject(){
    motor.set(-0.1);//adjust speed as fit
  } 

  public void stop(){
    motor.set(0.0);
  }

  public void setPower(double speed){
    motor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
