package teamcode.RobotDemoPunk;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "auto gol")
public class AutoEmpty extends LinearOpMode{
    Hardware robot;
    @Override
    public void runOpMode() throws InterruptedException{
        robot = new Hardware(hardwareMap);
        robot.pivot.setPosition(0.5);
        robot.glisiera.setPower(0);
        robot.gripper.setPosition(0.5);
        waitForStart();

    }
}





