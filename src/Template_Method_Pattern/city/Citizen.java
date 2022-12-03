package Template_Method_Pattern.city;

public class Citizen {
	private String id;
	private int age;
	private String name;
	private String position;
	private int strength;
	private int agility;
	private int intelligence;

	@Override
	public String toString() {
		return "Citizen{" +
				"id='" + id + '\'' +
				", age=" + age +
				", name='" + name + '\'' +
				", position='" + position + '\'' +
				", strength=" + strength +
				", agility=" + agility +
				", intelligence=" + intelligence +
				'}';
	}

	public Citizen(Citizen citizen) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.position = position;
		this.strength = strength;
		this.agility = agility;
		this.intelligence = intelligence;
	}

	public void updateStrength(int stat){
		strength+=stat;
	}

	public void updateAgility(int stat){
		agility+=stat;
	}

	public void updateIntelligence(int stat){
		intelligence+=stat;
	}

	public Citizen(String id, int age, String name, String position, int strength, int agility, int intelligence) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.position = position;
		this.strength = strength;
		this.agility = agility;
		this.intelligence = intelligence;
	}

	public Citizen() {
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getStrength() {
		return strength;
	}

	public int getAgility() {
		return agility;
	}

	public int getIntelligence() {
		return intelligence;
	}
}
