package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.motorcontrol.Talon;

public class WheelDrive {
    public WheelDrive(int angleMotor, int speedMotor, int encoder){
        angleMotor = new WPI_TalonFX(angleMotor);
        speedMotor = new WPI_TalonFX(speedMotor);
        pidController = new PIDController(1, 0, 0, new AnalogInput(encoder), this.angleMotor);
        //PIDController = new PIDController(angleMotor, speedMotor, encoder);
        
    }
}
