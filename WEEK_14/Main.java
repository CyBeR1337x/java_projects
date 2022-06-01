
public class Main {
	public static void main(String[] args) {
		Eater[] eaters = new Eater[5];
		
		eaters[0] = new Eater("Eater");
		eaters[1] = new Horse("Black Beauty");
		eaters[2] = new Rabbit("Bunny");
		eaters[3] = new Hen("Chickoo");
		eaters[4] = new Horse("Golden Pearl");
		
		for (int i = 0; i < eaters.length; i++) {
			eaters[i].My_name_is();
			eaters[i].I_eat();
		}
			
	}

}
