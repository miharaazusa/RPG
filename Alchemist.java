
public class Alchemist extends Character{

	public Alchemist(String name, int hp, int mp, int power) {
		super(name,hp,mp,power);
	}

	@Override
	public void introduce() {
		System.out.println("ぼくは"+name+"！は"+hp+"だ！");
	}

	@Override
	public void attack(Character target) {
		System.out.println(name+"の攻撃！");
		target.damage(power);
		alchemy();
	}

	public void alchemy() {
		System.out.println(name+"の攻撃！"+power+"のダメージを与えた！");
	}

}