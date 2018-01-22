package org.usfirst.frc.team2791.robot.commands;

import org.usfirst.frc.team2791.robot.OI;
import org.usfirst.frc.team2791.robot.*;
import org.usfirst.frc.team2791.robot.commands.*;
import org.usfirst.frc.team2791.robot.ShakerJoystick.*;
import org.usfirst.frc.team2791.robot.subsystems.*;
import org.usfirst.frc.team2791.robot.util.*;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;


public class IntakeOff extends Command{
	public IntakeOff(){
	}
	protected void initialize(){
	}
	
	protected void execute(){
		Robot.intake.motorOffIntakeA();
		}
	protected boolean isFinished(){
		return false;
	}
	protected void end(){
	}
	protected void interrupted(){
		end();
	}
}