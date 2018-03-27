
public class Loot {
/* Percentage chance for loot
 * Hp pot: 20%
 * Res pot: 30%
 * Sword: 20%
 * Armor: 20%
 */
	int[] Rewards() {
		int[] Loot= {0,0,0};
		int num;
		RNG Dice=new RNG();
		//HP pot
		num=Dice.Dice0_4s1();
		if(num==0) {
			Loot[0]=1;
		};
		//Res Pot
		num=Dice.Dice0_9s1();
		if(num==0||num==1||num==2) {
			Loot[1]=1;
		};
		//Sword
		num=Dice.Dice0_4s1();
		if(num==0) {
			Loot[2]=Dice.Dice10_40s1();
		};
		return Loot;
	};
	
	
	
	
	
}
