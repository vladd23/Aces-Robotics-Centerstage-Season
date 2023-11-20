package teamcode.RobotTimm;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name = "Control")
public class Control extends LinearOpMode {
    Hardware robot;
    double sniperSpeed = 0.4;
    double speed, direction, right, left;
    @Override
    public void runOpMode() throws InterruptedException {
        robot = new Hardware(hardwareMap);

        waitForStart();
        if(gamepad2.a) {
            robot.servogripper.setPosition(0);
        } else {
            robot.servogripper.setPosition(0.5);
        }

        if(gamepad2.right_bumper) {
            robot.servoincheietura.setPosition(0);
        }
        if(gamepad2.left_bumper) {
            robot.servoincheietura.setPosition(0.3);
        }

        if(gamepad2.dpad_up) {
            robot.motorglisiera1.setPower(-0.4);
            robot.motorglisiera2.setPower(-0.4);
        } else if(gamepad2.dpad_down) {
            robot.motorglisiera1.setPower(0.4);
            robot.motorglisiera2.setPower(0.4);
        } else {
            robot.motorglisiera1.setPower(0);
            robot.motorglisiera2.setPower(0);
        }

        speed = gamepad1.right_trigger - gamepad1.left_trigger;
        direction = gamepad1.left_stick_x;

        right = speed - direction;
        left = speed + direction;

        if (right > 1)
            right = 1;
        if (right < -1)
            right = -1;
        if (left > 1)
            left = 1;
        if (left < -1)
            left = -1;

        if (gamepad1.right_stick_x != 0) {
            robot.motorstangaspate.setPower(gamepad1.right_stick_x * sniperSpeed);
            robot.motorstangafata.setPower(-gamepad1.right_stick_x * sniperSpeed);
            robot.motordreaptaspate.setPower(-gamepad1.right_stick_x * sniperSpeed);
            robot.motordreaptafata.setPower(gamepad1.right_stick_x * sniperSpeed);
        } else {
            robot.motorstangaspate.setPower(left * sniperSpeed);
            robot.motorstangafata.setPower(left * sniperSpeed);
            robot.motordreaptaspate.setPower(right * sniperSpeed);
            robot.motordreaptafata.setPower(right * sniperSpeed);
        }


    }
}
