import java.util.Random;

public class RNG {
	
	private Random Dice=new Random();
	int num;
	
	int Dice0_10s1() { //random 0-10 steps of 1
		num=Dice.nextInt(11);
		return(num);
	};
	
	int Dice0_100s10() { //random 0-100 steps of 10
		num=Dice.nextInt(101)*10;
		return(num);
	};
	
	int Dice0_20s2() { //random 0-20 steps of 2
		num=Dice.nextInt(11)*2;
		return(num);
	};

}
