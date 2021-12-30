package frc.robot;

public class Constants {

    //Elevator Constants

    public static final int ELEVATOR_SOFT_LIMIT = 52650;

    public static final double ELEVATOR_UP_OUTPUT_PERCENT = 1.0;
    public static final double ELEVATOR_DOWN_OUTPUT_PERCENT = -0.4;

    public static final double ELEVATOR_F_UP = 0.08;
    public static final double ELEVATOR_F_DOWN = ELEVATOR_F_UP - 0.030;
    // public static final double ELEVATOR_ZERO_F = -0.0732;
    public static final double ELEVATOR_ZERO_F = -0.1;
    // public static final double ELEVATOR_ZERO_F = 0.0;

    public static final double ELEVATOR_P = 0.04;
    public static final double ELEVATOR_I = 0.0;
    public static final double ELEVATOR_D = 0.4;

    public static final double ELEVATOR_F_VELOCITY = 0.26;
    public static final double ELEVATOR_P_VELOCITY = 0.7;
    public static final double ELEVATOR_I_VELOCITY = 0.0;
    public static final double ELEVATOR_D_VELOCITY = 4.0;
    public static final double ELEVATOR_AUX_F_VELOCITY = 0.1367;

    public static final double ELEVATOR_ZERO = 0.0;

    public static final double ELEVATOR_LOW_GOAL = 2700;
    public static final double ELEVATOR_CARGO = 11500;
    public static final double ELEVATOR_MIDDLE = 22950;
    public static final double ELEVATOR_HIGH = 47250;
    public static final double ELEVATOR_MAX_HEIGHT = 52650;

    public static final double ELEVATOR_ZERO_NEUTRAL_POSITION = 3000.0;
    public static final double ELEVATOR_ZERO_NEUTRAL_POSITION_DEADBAND = 1000.0;

    public static final double ELEVATOR_ERROR_TOLERANCE = 2000.0;
    public static final double ELEVATOR_MANUAL_DEADBAND_UP = 0.2;
    public static final double ELEVATOR_MANUAL_DEADBAND_DOWN = -0.2;
    public static final double ELEVATOR_MANUAL_DPOS_SCALAR = 10000.0;

    //Output Percents
    public static final double ELEVATOR_OUTPUT_PERCENT = 1.0;

}
