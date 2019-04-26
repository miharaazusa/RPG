
public class Magician2 extends Character {

	public Magician2(String name, int hp, int mp, int power) {
		super(name,hp,mp,power);
	}

	@Override
	public void introduce() {
		System.out.println("私は"+this.name+"！体力は"+this.hp+"です！");
	}

	@Override
	public void attack(Character target) {
		System.out.println(name+"の攻撃！");
		target.damage(power);
		magic();
	}
	public void magic() {
		System.out.println(name+"の攻撃！"+power+"のダメージを与えた！");
	}
}
