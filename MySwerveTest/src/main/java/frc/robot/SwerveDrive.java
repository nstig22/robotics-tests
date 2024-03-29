//Following this guide:
//https://jacobmisirian.gitbooks.io/frc-swerve-drive-programming/content/
//in an attempt to understand how to program swerve drive

package frc.robot;

public class SwerveDrive {
    //FIXME -- replace values with distances between wheel axles
    public final double L = 28;
    public final double W = 28;

    public void drive(double x1, double y1, double x2){
        double r = Math.sqrt((L * L) + (W * W));
        y1 *= -1;

        double a = x1 - x2 * (L / r);
        double b = x1 + x2 * (L / r);
        double c = y1 - x2 * (W / r);
        double d = y1 + x2 * (W / r);

        double backRightSpeed = Math.sqrt((a * a) + (d * d));
        double backLeftSpeed = Math.sqrt((a * a) + (c * c));
        double frontRightSpeed = Math.sqrt((b * b) + (d * d));
        double frontLefttSpeed = Math.sqrt((b * b) + (c * c));

        double backRightAngle = Math.atan2(a, d) / Math.PI;
        double backLeftAngle = Math.atan2(a, c) / Math.PI;
        double frontRightAngle = Math.atan2(b, d) / Math.PI;
        double frontLeftAngle = Math.atan2(b, c) / Math.PI;
    }
}
