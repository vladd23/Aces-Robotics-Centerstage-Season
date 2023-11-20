package teamcode.RobotTimm;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import java.util.List;

public class Hardware {
    public DcMotorEx motordreaptaspate;
    public DcMotorEx motordreaptafata;
    public DcMotorEx motorstangaspate;
    public DcMotorEx motorstangafata;
    public DcMotorEx motorglisiera1;
    public DcMotorEx motorglisiera2;
    public Servo servoincheietura;
    public Servo servogripper;

    public Hardware(HardwareMap hardwareMap) {
        motordreaptafata = hardwareMap.get(DcMotorEx.class, "dreapta fata");
        motordreaptaspate = hardwareMap.get(DcMotorEx.class, "dreapta spate");
        motorstangafata = hardwareMap.get(DcMotorEx.class, "stanga fata");
        motorstangaspate = hardwareMap.get(DcMotorEx.class, "stanga spate");

        motorglisiera1 = hardwareMap.get(DcMotorEx.class, "glisiera stanga");
        motorglisiera2 = hardwareMap.get(DcMotorEx.class, "glisiera dreapta");

        servogripper = hardwareMap.get(Servo.class, "servo gripper");
        servoincheietura = hardwareMap.get(Servo.class, "servo incheietura");

        servoincheietura.setPosition(0.5);
        servogripper.setPosition(0.5);

        motordreaptafata.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorstangafata.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motordreaptaspate.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorstangaspate.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        motorglisiera1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorglisiera2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

    }

}
