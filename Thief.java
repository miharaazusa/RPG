
public class Thief  extends Character {

	public Thief(String name, int hp, int mp, int power) {
		super(name,hp,mp,power);
	}

	public void introduce() {
		System.out.println("オレは"+name+"！体力は"+hp+"だ！");
	}
	public void attack(Character target) {
		steal();
		target.damage(power);
	}

	public void steal() {
		System.out.println(name+"の攻撃！"+power+"のダメージを与えた！");
	}
}

