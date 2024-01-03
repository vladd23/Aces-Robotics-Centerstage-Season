package teamcode.RobotDemoPunk;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "auto")
public class Auto extends LinearOpMode{
    Hardware robot;
    @Override
    public void runOpMode() throws InterruptedException{
        robot = new Hardware(hardwareMap);

        waitForStart();
        robot.stfata.setPower(0.3);
        robot.stspate.setPower(0.3);
        robot.drfata.setPower(-0.3);
        robot.drspate.setPower(-0.3);
        robot.glisiera.setPower(0);
        robot.gripper.setPosition(0);
        robot.avion.setPosition(0);
        robot.pivot.setPosition(0);


        sleep(2500);
        robot.stfata.setPower(0);
        robot.stspate.setPower(0);
        robot.drfata.setPower(0);
        robot.drspate.setPower(0);
        robot.glisiera.setPower(0);

    }
}





