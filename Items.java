
public class Items {
private String name;
private String desc;

public Items(String n,String d) {
	name = n;
	desc = d;
}
public String toString() {
	return name;
}
public String getname() {
		return name;
}

public void setname(String i) {
	i = name;
}

public String getdesc() {
	return desc;
}
public void setdesc(String i) {
	i = desc;
}
public void open(String i) {
	Game.print("You can't open that!");
}
public void use(String i) {
	Game.print("You can't use that!");
}
}
