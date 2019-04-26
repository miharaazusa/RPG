
public class Magician extends Character {

	public Magician(String name, int hp, int mp, int power) {
		super(name,hp,mp,power);
	}

	public void introduce() {
		System.out.println("私は"+this.name+"！体力は"+this.hp+"です！");
	}

	public void attack(Character target) {
		magic();
		target.damage(power);

	}
	public void magic() {
		System.out.println(name+"の攻撃！"+power+"のダメージを与えた！");
	}

}
