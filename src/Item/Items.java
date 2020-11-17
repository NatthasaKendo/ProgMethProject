package Item;

public abstract class Items {
	
	private String name = "";
	private double atk = 0;
	private double def = 0;
	private double mana = 0;
	private double health = 0;
	private String description = ""; 
	private int cost = 0;
	private double atkSpeed ;
	
	public abstract void effects ();
	
	public double getAtk() {
		return atk ;
	}

	public void setAtk(double atk) {
		this.atk = atk;
	}
	public void setDef(double def) {
		this.def = def;
	}

	public void setMana(double mana) {
		this.mana = mana;
	}

	public double getDef() {
		return def;
	}

	public double getMana() {
		return mana;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public double getAtkSpeed() {
		return atkSpeed;
	}

	public void setAtkSpeed(double atkSpeed) {
		this.atkSpeed = atkSpeed;
	}
}
