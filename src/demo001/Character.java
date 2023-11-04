package demo001;

public class Character {

	String name;
	int hp;
	int mp;

	Character(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	void run() {
		System.out.println(name + "is running");

	}

	void attack() {
		System.out.println(name + "is attacking");
	}

}
