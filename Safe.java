
public class Safe extends Items {
	private String name;
	private String desc;
	
	public Safe(String name, String desc) {
		super(name,desc);	
		}
	
	public void open(String i) {
		super.open(i);
		if(Game.getiteminv(i).getname().equals(i)){
			Game.print("Using the combination, you open the safe and find a\n"
					+ "diamond inside! Naturally, you pocket the diamond");
			//Game.inventory.add();
		
		}
	}
}
