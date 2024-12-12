import java.util.HashMap;

public class Room{
	private String description;
	private Room east; 
	private Room west;
	private Room south;
	private Room north;
	private Room up;
	private Room down;
	private boolean lock = false;
	private String Name;
	private HashMap<String,Items> item = new HashMap<String, Items>();
	private HashMap<String,NPC> npcs = new HashMap<String, NPC>();
;
	
	
	
	public Room(String string,String Name) {
		description =  string;
		
		this.Name = Name;
	}
	public Room getExit(char dir){
		if(dir == 'e') {
			return east;
		}
		else if(dir == 'w') {
			return west;
		}
		else if(dir == 's') {
			return south;
		}
		else if(dir == 'n') {
			return north;
		}
		else if(dir == 'u') {
			return up;
		}
		else if(dir == 'd') {
			return down;
		}
		else	{
			return null;
		}
		
	}
	public void addExit(Room r, char dir) {
		if(dir == 'e') {
			east = r;
		}
		else if(dir == 'w') {
			west = r;
		}
		else if(dir == 's') {
			south = r;
		}
		else if(dir == 'n') {
			north = r;
		}
		else if(dir == 'u') {
			up = r;
		}
		else if(dir == 'd') {
			down = r;
		}
		else	{
			r = null;
		}
	}
	public String toString() {
		return description;
	}
	public Items getitem(String name) {
		return item.get(name);
	}
	
	public void setitem(Items i1){
		item.put(i1.getname(),i1);
	}
	
	public void removeitem(String name) {
		item.remove(name);
	}
	
	public boolean getlock() {
		return lock;
	}
	public void setlock(boolean open) {
		 lock = open;
	}
	public boolean getName() {
		return lock;
	}
	public void setName(String New) {
		 Name = New;
	}
}
