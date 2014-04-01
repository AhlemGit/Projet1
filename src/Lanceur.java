import java.util.Scanner;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.*;

public class Lanceur {
	public static void main (String[] args) {
		int x, y; 
		Scanner s = new Scanner(System.in);
		Object[] arg = new Object[2]; //parce qu'on veut créer 2 agents
		System.out.println("Donner deux valeurs");
		x = s.nextInt();
		y = s.nextInt();
		arg[0] = x; arg[1] = y;
		
		try {
			Runtime rt = Runtime.instance();
			ProfileImpl p = new ProfileImpl("localhost", 1099, "RSHP");
			ContainerController mc = rt.createMainContainer(p);
			AgentController ag1 = mc.createNewAgent("Agent1", "AgentPGCD", arg);
			AgentController ag2 = mc.createNewAgent("Agent2", "AgentPPCM", arg);
			
			ag1.start();
			ag2.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
