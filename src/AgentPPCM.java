import jade.core.Agent;

public class AgentPPCM extends Agent {
	int x; int y;
	int p1; int p2;
	
	protected void setup() {
		System.out.println("Nom de l'agent est : " + getLocalName());
		Object[] args = getArguments();
		if(args != null) {
			x = Integer.valueOf(args[0].toString());
			y = Integer.valueOf(args[1].toString());
			p1 = x; p2 = y;
			while(p1 != p2) {
				if(p1<p2) p1 = p1+x;
				else p2 = p2+y;
			}
			System.out.println("Le PPCM est : " + p1);
		}
		doDelete();
	}
}

