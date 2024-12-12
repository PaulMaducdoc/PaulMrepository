
public class Combination extends Items {
	private String name;
	private String desc;
	
	public Combination(String name, String desc) {
		super(name,desc);
	}

	public void use(String i) {
		super.use(i);
		Game.print("If you find a safe, try opening it!");
	}
	
}
