
public class Character {
   protected String name;
   protected static int hp;
   protected int mp;
   protected int power;

	public Character(String name, int hp, int mp, int power) {
		this.name= name;
		Character.hp= hp;
		this.mp=mp;
		this.power=power;
	}

	public void introduce() {
		System.out.println(name+"です。"+hp+"はです。");
	}
	
	public void damage(int power) {
		hp=hp-power;
		System.out.println(name+"は"+power+"のダメージを受けた！");
	}
	public void attack(Character target) {
		System.out.println(name+"の攻撃！");
		target.damage(power);
	}



	
	
	
	
	
	//public int getAge() {
	//	return age;
	//}
	//public void setAge(int age) {
	//	this.age= age;
	//}


}


