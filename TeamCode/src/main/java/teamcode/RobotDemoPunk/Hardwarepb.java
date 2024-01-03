package teamcode.RobotDemoPunk;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Hardwarepb {

    public DcMotorEx stfata;
    public DcMotorEx stspate;
    public DcMotorEx drfata;
    public DcMotorEx drspate;
    public DcMotorEx inclinare;
    public Servo avion;
    public Servo intakeoutake;

    public Hardwarepb(HardwareMap hardwareMap){
        stfata = hardwareMap.get(DcMotorEx.class, "stanga_fata");
        stspate = hardwareMap.get(DcMotorEx.class, "stanga_spate");
        drfata = hardwareMap.get(DcMotorEx.class, "dreapta_fata");
        drspate = hardwareMap.get(DcMotorEx.class, "dreapta_spate");
        inclinare = hardwareMap.get(DcMotorEx.class, "inclinare");
        avion = hardwareMap.get(Servo.class, "avion");
        intakeoutake = hardwareMap.get(Servo.class, "intake_outake");

        stfata.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        stspate.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        drfata.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        drspate.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        stfata.setDirection(DcMotorSimple.Direction.REVERSE);
        stspate.setDirection(DcMotorSimple.Direction.REVERSE);

        avion.setPosition(0);
        intakeoutake.setPosition(0);


    }
}
