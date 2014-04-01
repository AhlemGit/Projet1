import jade.core.Agent;

public class AgentPGCD extends Agent {
	int x; int y;
	
	protected void setup() {
		System.out.println("Nom de l'agent est : " + getLocalName());
		Object[] args = getArguments();
		if(args != null) {
			x = Integer.valueOf(args[0].toString());
			y = Integer.valueOf(args[1].toString());
			while (x!=y) {
				if(x>y) x = x-y;
				else y = y-x;
			}
			
			System.out.println("Le PGDC est : " + x);
		}
		doDelete();
	}
}
