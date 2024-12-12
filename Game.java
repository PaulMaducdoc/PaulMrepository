import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.*;

public class Game {
	static GUI screen;

	public static void main(String[] args) {
		screen = new GUI();
		/*
		 * Room currentRoom = World.buildWorld(); System.out.println(currentRoom);
		 * System.out.println("\nNow we'll move east!"); currentRoom =
		 * currentRoom.getExit('e'); System.out.println(currentRoom);
		 * System.out.println("\nNow we'll move west!"); currentRoom =
		 * currentRoom.getExit('w'); System.out.println(currentRoom);
		 * System.out.println("\nNow we'll move down!"); currentRoom =
		 * currentRoom.getExit('d'); System.out.println(currentRoom);
		 * System.out.println("\nNow we'll move up!"); currentRoom =
		 * currentRoom.getExit('u'); System.out.println(currentRoom);
		 * System.out.println("\nNow we'll move up!"); currentRoom =
		 * currentRoom.getExit('u'); System.out.println(currentRoom);
		 * System.out.println("\nNow we'll move west!"); currentRoom =
		 * currentRoom.getExit('w'); System.out.println(currentRoom);
		 * System.out.println("\nNow we'll move east!"); currentRoom =
		 * currentRoom.getExit('e'); System.out.println(currentRoom);
		 * System.out.println("\nNow we'll move up!"); currentRoom =
		 * currentRoom.getExit('u'); System.out.println(currentRoom);
		 */


	}
	static ArrayList<Items> inventory = new ArrayList<Items>();

	static HashMap<String, Room> Roomitems = new HashMap<String, Room>();
	
	public static void processCommand(String command) {
		String[] words = command.split(" ");

		switch (words[0]) {
		case "e":
		case "w":
		case "s":
		case "n":
		case "u":
		case "d":
			if (currentRoom.getExit(command.charAt(0)).getlock() == true) {
				print("This room is locked.\n");
			} else {
				currentRoom = currentRoom.getExit(command.charAt(0));
				print(currentRoom.toString());
			}
			break;

		case "take":
			Items i = currentRoom.getitem(words[1]);
			if (i != null) {
				inventory.add(i);
				print("you picked up a " + i.getname()+"\n");
				currentRoom.removeitem(words[1]);
				break;
			} else {
				print("There is no " + words[1] + " in this room.\n");
				break;
			}

		case "i":
			print("You have:\n");
			for (Items inv : inventory)
				print(inv+"\n");
			break;
		case "look":
			Items i1 = currentRoom.getitem(words[1]);
			if (i1 == null) {

				print("No items left around this room.\n");
			} else {
				for (Items is : inventory) {
					if (is == i1) {
						print(is.getdesc());
						break;
					}

				}
				print(i1.getdesc());

				break;
			}
		default:
			print("I don't know what you mean.\n");
		}

	}

	

	static public void saveGame(String filename) {
		File f = new File(filename);
		try {
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream stream = new ObjectOutputStream(fos);
			stream.writeObject(currentRoom);
			stream.writeObject(inventory);
			stream.writeObject(Roomitems);
			stream.close();
		} catch (FileNotFoundException e) {
			System.out.println("File" + filename + " notfound+");
			System.exit(0);
		} catch (IOException ex) {
			System.out.println("Reading/Writing Error");
		}

	}

	public void loadGame(String filename) {
		File f = new File(filename);
		try {
			FileInputStream fos = new FileInputStream(f);
			ObjectInputStream stream = new ObjectInputStream(fos);
			currentRoom = (Room) stream.readObject();
			inventory = (ArrayList) stream.readObject();
			Roomitems = (HashMap) stream.readObject();
			stream.close();
		} catch (FileNotFoundException e) {
			System.out.println("File" + filename + " notfound+");
			System.exit(0);
		} catch (IOException ex) {
			System.out.println("Reading/Writing Error");
		} catch (ClassNotFoundException ex) {
			System.out.println("Very bad error");
		}
	}

	public static void print(Object obj) {
		GUI.textarea.append(obj.toString());
	}

	public static Room get() {
		return currentRoom;
	}

	public static Items getiteminv(String n) {
		for (Items x : inventory) {
			if (x.getname().equals(n)) {
				return x;
			}
		}
		return null;
	}

	public static Room currentRoom = World.buildWorld();

	public static Scanner inp = new Scanner(System.in);

	public static void rungame() {

		/*String command;
		do {
			System.out.println(currentRoom);
			System.out.println("Where do you want to go?");
			command = inp.nextLine();
			String[] words = command.split(" ");

			switch (words[0]) {
			case "e":
			case "w":
			case "s":
			case "n":
			case "u":
			case "d":
				if (currentRoom.getExit(command.charAt(0)).getlock() == true) {
					System.out.println("This room is locked.");
				} else {
					currentRoom = currentRoom.getExit(command.charAt(0));

				}
				break;

			case "take":
				Items i = currentRoom.getitem(words[1]);
				if (i != null) {
					inventory.add(i);
					System.out.println("you picked up a " + i.getname());
					inventory.remove(i);
					break;
				} else {
					System.out.println("There is no " + words[1] + " in this room.");
					break;
				}

			case "i":
				System.out.println("You have:");
				for (Items inv : inventory)
					System.out.println(inv);
				break;
			case "look":
				Items i1 = currentRoom.getitem(words[1]);
				if (i1 == null) {

					System.out.println("No items left around this room.");
				} else {
					for (Items is : inventory) {
						if (is == i1) {
							System.out.println(is.getdesc());
							break;
						}

					}
					System.out.println(i1.getdesc());

					break;
				}
			default:
				System.out.println("I don't know what you mean.");
			}

		} while (!command.equals("x"));
		inp.close();

	}*/
}
}
