import java.util.Scanner;


public class Playerstatsinteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Health, LVL, Rescources;
		Rescources = 100;
		Health = 100;
		int PH = 20;
	int	encounter = 0;
	int WeaponDamage = 2;
	int chest = 0;
	int rooms = 0;
		
		
		Scanner input;
//	do{
		do{
		input = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1.  Attack");
		System.out.println("2.  Spell");
		System.out.println("3.  Potion");
		System.out.println("Health ="+ Health);
		System.out.println("Rescources ="+ Rescources);
		
		
		int bob = input.nextInt();
		int bobby = bob;
		//
		if(bob == 1)
		{
			System.out.println("You attacked and dealt"+   PH   + "damage");
			encounter = encounter + 1;
			
		}
		
		if(bob == 2)
		{
			
			System.out.println("What kind of spell?");
			int boy = input.nextInt();
			int boi = boy;
			System.out.println("1.   Damage Spell");
			      if(boi == 1)
			      {
			    	  System.out.println("You attacked and dealt"+  PH  +  WeaponDamage  +  "Damage");
			    	  encounter = encounter + 1;
			      }
			System.out.println("2.   Healing Spell");
			      if(boi == 2)
			      {
			    	  System.out.println("You casted and healed"+""+"Health");
			    	  Health = Health + PH;
			    	  encounter = encounter + 1;
			      }
			
		}
		
		if(bob == 3)
		{
			
			System.out.println("What Type of Potion?");
			System.out.println("1.    Rescource Potion");
			System.out.println("2.    Health Potion");
			int boy = input.nextInt();
			int boi = boy;
			if(boi == 1);
			{
				System.out.println("you drank a Rescource potion and got 25 Rescource");
				Rescources = Rescources + 25;
				encounter = encounter + 1;
			}
			if(boi == 2);
			{
				System.out.println("you drank a health potion and recovered 25 Health");
				 Health = Health + 25;
				 encounter = encounter + 1;
			}
			
			
		}
		if(encounter == 1)
		{
			rooms = rooms + 1;
		}

		
		if(encounter == 1)
		{
			System.out.println("You were attacked and you took"+  PH   +"Damage");
			Health = Health - PH;
			
			encounter = encounter - 1;
			
if(Health <= 0)
{
	System.out.println("GAME OVER, YOU WENT THROUGH"+"  "+  rooms  +"ROOMS");
	encounter = encounter + 1;
}

		}

	if(chest == 1)
	{
		System.out.println("You found a chest and you found"+ PH + "Do you want to take it? (You will drop your current weapon)");
		int choice = input.nextInt();
		int choic = choice;
		  if(choic == 1)
		  {
			System.out.println("You decided to take"+" "+PH);  
			 chest = chest - 1;
		  }
          if(choic == 2)
          {
        	System.out.println("You decided not to take"+" "+PH);
        	 chest = chest - 1;
        	  
          }
	}


}while(encounter != 1);

	
	/*if(encounter == 1)
	{
		System.out.println("You were attacked and you took"+  PH   +"Damage");
		Health = Health - PH;
		
		encounter = encounter - 1;
	}*/
	
	
//}while(encounter != 2);
	}
}

/* if (train == false)
 * {
 * System.out.println("You stopped the train, Congratulations")
 * 
 * }*/
