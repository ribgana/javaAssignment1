import java.net.SocketPermission;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Physics physics = new Physics();
        physics.getGravity();

        Scanner input = new Scanner(System.in);

        double Mass;
        double Velocity;

        System.out.println("KineticEnergy");
        System.out.println("Input-Mass");
        Mass = input.nextDouble();

        System.out.println("Input-Velocity");
        System.out.println("kineticEnergy");
        Velocity = input.nextDouble();

        input.close();
        System.out.println(Energy.KineticEnergy(Mass, Velocity));
        
        double Gf
        double Height
            
        System.out.println("GravitationalEnergy");
        System.out.println("InputMass");
        Mass = input.nextdouble();
        
        System.out.println("GravitationalEnergy");
        System.out.println("InputGf");
        Gf = input.nextdouble();
        
        System.out.println("GravitationalEnergy");
        System.out.println("InputHeight");
        Height = input.nextdouble();
        
        System.out.println(Energy.GravitationalEnergy(Mass,Height,Gf));
    }
}
