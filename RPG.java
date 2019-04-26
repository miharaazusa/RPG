
public class RPG {
	public static void main(String[] args) {

		Character[] teamA = new Character[2];
		teamA[0] = new Magician("魔法使い", 500, 200, 50);
		teamA[1] = new Magician2("魔法使い2", 500, 200, 50);

		Character[] teamB = new Character[2];
		teamB[0] =  new Alchemist("錬金術師", 400, 150, 30);
		teamB[1] =  new Thief("泥棒",500, 100, 50);

		int teamAHp;
		int teamBHp;
		while(true) {
			teamAHp=Magician.hp+ Magician2.hp;
			teamBHp=Alchemist.hp+Thief.hp;

			for(int i=0; i<teamA.length;i++) {
				teamA[i].introduce();
				teamA[i].attack(teamB[i]);
				System.out.println("***次のこうげき***");
			}
			if(teamAHp<=0) {
				System.out.println("teamBの勝利！！");
				break;
			}

			for(int i=0; i<teamB.length;i++) {
				teamB[i].introduce();
				teamB[i].attack(teamA[i]);
				System.out.println("***次のこうげき***");
			}
			if(teamBHp<=0) {
				System.out.println("teamAの勝利！！");
				break;
			}
		}
	}
}





