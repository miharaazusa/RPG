
public class Alchemist extends Character{

	public Alchemist(String name, int hp, int mp, int power) {
		super(name,hp,mp,power);
	}

	public void introduce() {
		System.out.println("ぼくは"+name+"！は"+hp+"だ！");
	}

	public void attack(Character target) {
		alchemy();
		target.damage(power);
	}

	public void alchemy() {
		System.out.println(name+"の攻撃！"+power+"のダメージを与えた！");
	}

}
