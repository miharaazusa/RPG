
public class Thief  extends Character {

	public Thief(String name, int hp, int mp, int power) {
		super(name,hp,mp,power);
	}

	@Override
	public void introduce() {
		System.out.println("オレは"+name+"！体力は"+hp+"だ！");
	}
	@Override
	public void attack(Character target) {
		System.out.println(name+"の攻撃！");
		target.damage(power);
		steal();
	}

	public void steal() {
		System.out.println(name+"の攻撃！"+power+"のダメージを与えた！");
	}
}

