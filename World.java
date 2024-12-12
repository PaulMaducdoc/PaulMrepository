
public class World {
	public static Room buildWorld() {
	Room livingRoom = new Room("You are in the living room.\n","Living Room\n");
	Room kitchen = new Room("You are in the kitchen.\n","Kitchen\n");
	Room basement = new Room("You are in the basement.\n","Basement\n");
	Room attic = new Room("You are in the attic.\n","Attic\n");
	Room bedroom = new Room("You are in the bedroom.\n","Bedroom\n");
	Room bathroom = new Room("You are in the bathroom.\n","Bathroom\n");
	
	Items skibidi = new Items("Skibidi Toilet","dobdobdobyesyes\n");
	Items Plunger = new Items("Plunger","Can be Used on toilet\n");
	Items ToiletPaper = new Items("Plunger","Looks clogged\n");

	Items JohnPork = new Items("John Pork","is calling\n");
	Items chair = new Items("chair","Looks comfortable\n");
	Items gun = new Items("Gun","Chamber is empty\n");
	Items pillow = new Items("Pillow","Appears to have an object inside it\n");
	Items matches = new Items("Matches","Box full of them\n");
	Items key = new Items("key","A rusty key\n");
	Items diamond = new Items("diamond","shiny\n");
	
	NPC Diddy = new NPC("Diddy","Not a party without him");
	
	livingRoom.addExit(kitchen, 'e');
	livingRoom.addExit(basement, 'd');
	livingRoom.addExit(bedroom, 'u');
	
	livingRoom.setitem(chair);
	
	kitchen.addExit(livingRoom, 'w');
	
	kitchen.setitem(JohnPork);

	bedroom.addExit(bathroom, 'w');
	bedroom.addExit(livingRoom, 'd');
	bedroom.addExit(attic, 'u');
	bedroom.setlock(true);
	
	bedroom.setitem(pillow);
	
	bathroom.addExit(bedroom, 'e');
	
	bathroom.setitem(skibidi);
	bathroom.setitem(Plunger);
	bathroom.setitem(ToiletPaper);

	
	basement.addExit(livingRoom,'u');
	
	basement.setitem(gun);
	basement.setitem(key);

	
	attic.addExit(bedroom, 'd');
	
	attic.setitem(matches);
	
	return livingRoom;
	}
}
