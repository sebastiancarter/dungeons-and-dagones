import java.util.Scanner;
public class PTR {
	 
	
	 
	
	 
  
	
	 
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
		int bonusdamage = 20;
		int hpPots = 5;
		int rsPots = 5;
	 	RNG rng;
	 	rng = new RNG();
	 	int looot = 0;
	 	L00t loot;
	 	 loot =	new L00t();
	 	 int[] lootguy;
	 	 lootguy = loot.Rewards();
	 	Monsters monster1;
	 	monster1 = new Monsters();
	 	Monsters monster2;
	 	monster2 = new Monsters();
	 	Monsters monster3;
	 	monster3 = new Monsters();
	 	Monsters monster4;
	 	monster4 = new Monsters();
	 	Monsters Setup=new Monsters();
	 	
	 	
	 	
	 	
	 	
	    int	spelldam = 0;
	   //rng.Dice0_20s2();
	  // int Damage =   rng.Dice0_20s2() + PH;
	 
	 		Scanner input; 
			do{ 
		 	int numMobsAct = 0;
			int numMobs=Setup.numMonsters();
			switch(numMobs){
				case 0:
				case 1:
					monster1.datasetter();
					monster2.dead();
					monster3.dead();
					monster4.dead();
					numMobsAct=1;
					break;
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					monster1.datasetter();
					monster2.datasetter();
					monster3.dead();
					monster4.dead();
					numMobsAct=2;
					break;
				case 7:
				case 8:
					monster1.datasetter();
					monster2.datasetter();
					monster3.datasetter();
					monster4.dead();
					numMobsAct=3;
					break;
				case 9:
					monster1.datasetter();
					monster2.datasetter();
					monster3.datasetter();
					monster4.datasetter();
					numMobsAct=4;
					break;
				
			};
			do{
			if(Health <= 0 || Rescources <= 0) 
			 { 
			 	System.out.println("GAME OVER, YOU WENT THROUGH"+"  "+  rooms  +"  "+"ROOMS"); 
			 	encounter = encounter + 1;
			 	numMobsAct = 0;
			 }else{
			input = new Scanner(System.in); 
			System.out.println("Menu");
			System.out.println("Room number: " + rooms);
			System.out.println("You are facing "+numMobsAct+" monsters");
			System.out.println("Monster 1 Health: " + monster1.HealthGet() );
			System.out.println("Monster 2 Health: " + monster2.HealthGet() ); 
			System.out.println("Monster 3 Health: " + monster3.HealthGet() );
			System.out.println("Monster 4 Health: " + monster4.HealthGet() );
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
	 			switch(numMobs){
				case 0:
				case 1:
					System.out.println("Which Opponent?");
	 				System.out.println("1.   First Target");
					break;
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					System.out.println("Which Opponent?");
	 				System.out.println("1.   First Target");
	 				System.out.println("2.   Second Target");
					break;
				case 7:
				case 8:
					System.out.println("Which Opponent?");
	 				System.out.println("1.   First Target");
	 				System.out.println("2.   Second Target");
	 				System.out.println("3.   Third Target");
					break;
				case 9:
					System.out.println("Which Opponent?");
	 				System.out.println("1.   First Target");
	 				System.out.println("2.   Second Target");
	 				System.out.println("3.   Third Target");
	 				System.out.println("4.   Fourth Target");
					break;
				
			};
	 			
	 			int opponent = input.nextInt();
	 			int Op = opponent;
	 			if(Op == 1) {
	 				if(monster1.HealthGet()>0){
	 					int Damage =   rng.Dice0_20s2() + bonusdamage;
	 					monster1.HitRecieve(Damage);
	 					System.out.println("You attacked and dealt"+ "  "+  Damage+"  "    + "damage"); 
	 					if(monster1.HealthGet()<=0){
	 						monster1.dead();
	 						numMobsAct=numMobsAct-1;
	 					};
	 					encounter = encounter + 1;
	 				}else{
	 					System.out.println("Its already dead");
	 				};
	 			}
	 			if(Op == 2) {
	 				if(monster2.HealthGet()>0){
	 					int Damage =   rng.Dice0_20s2() + bonusdamage;
	 					monster2.HitRecieve(Damage);
	 					System.out.println("You attacked and dealt"+ "  "+  Damage+"  "    + "damage"); 
	 					if(monster2.HealthGet()<=0){
	 						monster2.dead();
	 						numMobsAct=numMobsAct-1;
	 					};
	 					encounter = encounter + 1;
	 				}else{
	 					System.out.println("Its already dead");
	 				};
	 			}
	 			if(Op == 3) {
	 				if(monster3.HealthGet()>0){
	 					int Damage =   rng.Dice0_20s2() + bonusdamage;
	 					monster3.HitRecieve(Damage);
	 					System.out.println("You attacked and dealt"+ "  "+  Damage+"  "    + "damage"); 
	 					if(monster3.HealthGet()<=0){
	 						monster3.dead();
	 						numMobsAct=numMobsAct-1;
	 					};
	 					encounter = encounter + 1;
	 				}else{
	 					System.out.println("Its already dead");
	 				};
	 			}
	 			if(Op == 4) {
	 				if(monster4.HealthGet()>0){
	 					int Damage =   rng.Dice0_20s2() + bonusdamage;
	 					monster4.HitRecieve(Damage);
	 					System.out.println("You attacked and dealt"+ "  "+  Damage+"  "    + "damage"); 
	 					if(monster4.HealthGet()<=0){
	 						monster4.dead();
	 						numMobsAct=numMobsAct-1;
	 					};
	 					encounter = encounter + 1;
	 				}else{
	 					System.out.println("Its already dead");
	 				};
	 			}
				 
			} 
	 		 
	  		if(bobby==2){ 
	 			System.out.println("What kind of spell?"); 
	 			System.out.println("1.   Damage Spell"); 
	 			System.out.println("2.   Healing Spell");
	 			int boyy = input.nextInt(); 
		int boii = boyy; 
		        // if(Rescources > 29)
		         {
 			      if(boii == 1) 
 			      { 
 		 			
 		 				 spelldam = rng.Dice0_20s2() + 15; ;
				    	 System.out.println("You attacked and dealt"+ " "+     spelldam + " "+  "Damage"); 
				    	 if(monster1.HealthGet()>0){
				    		 monster1.HitRecieve(spelldam);
				    		 if(monster1.HealthGet()<=0){
			 						monster1.dead();
			 						numMobsAct=numMobsAct-1;
			 					};
				    	 };
				    	 if(monster2.HealthGet()>0){
				    		 monster2.HitRecieve(spelldam);
				    		 if(monster2.HealthGet()<=0){
			 						monster2.dead();
			 						numMobsAct=numMobsAct-1;
			 					};
				    	 };
				    	 if(monster3.HealthGet()>0){
				    		 monster3.HitRecieve(spelldam);
				    		 if(monster3.HealthGet()<=0){
			 						monster3.dead();
			 						numMobsAct=numMobsAct-1;
			 					};
				    	 };
				    	 if(monster4.HealthGet()>0){
				    		 monster4.HitRecieve(spelldam);
				    		 if(monster4.HealthGet()<=0){
			 						monster4.dead();
			 						numMobsAct=numMobsAct-1;
			 					};
				    	 };
	 			    	 encounter = encounter + 1; 
	 			    	 Rescources = Rescources - 30;
		     	} 
	 			      if(boii == 2) 
	 			      { 
	 			    	  System.out.println("You casted and healed"+" "+"15"+ " "+"Health"); 
	 			    	  Health = Health + 15; 
	 			    	  Rescources = Rescources - 30;
	 			      } 
	 			 
	 			     
	 		}
	 	    
	  		} 
	 		 
	 		if(bob == 3) 
	 		{ 
	 			 
			    System.out.println("What Type of Potion?"); 
	 			System.out.println("1.    Rescource Potion: " + rsPots); 
	 			System.out.println("2.    Health Potion: " + hpPots); 
	 			int boy = input.nextInt(); 
				int boi = boy; 
				if(boi == 1) 
				{ 
	 				if(rsPots>0){
					System.out.println("you drank a Rescource potion and got 25 Rescource"); 
	 				Rescources = Rescources + 25;
	 				rsPots=rsPots-1;
	 				encounter = encounter + 1;
	 				}else{
	 					System.out.println("Your out of that potion");
	 				}
	 			} 
	 			if(boi == 2) 
	 			{ 
	 				if(hpPots>0){
	 				System.out.println("you drank a health potion and recovered 25 Health"); 
	 				Health = Health + 25;
	 				hpPots=hpPots-1;
	 				encounter = encounter + 1; 
	 				}else{
	 					System.out.println("Your out of that potion");
	 				}
	 			} 
	 			 
	 			 
			} 
	 		
	 
	 
	 		if(encounter == 1) 
			{ 
	 			int MobDmg=monster1.DamageGet() + monster2.DamageGet() + monster3.DamageGet() + monster4.DamageGet();
	 		  	System.out.println("You were attacked and you took"+"  "+  MobDmg   +"  "+"Damage"); 
				Health = Health - MobDmg; 
				 
	 			encounter = encounter - 1; 
	 			 
	  
	 
	 
	 		} 
			 }
			}while(numMobsAct!=0);
			if(Health > 0 && Rescources > 0)
			{
			rooms = rooms + 1;
			System.out.println("You moved on to the next room");
			}
	/*if(looot == 1)
	 {
		chest = chest + 1; 
		 
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
	 	}*/ 
	 
	 
	 
	 
 }while(Health > 0 && Rescources > 0); 
	 
	 
	 	 
	 	/*if(encounter == 1) 
	129 	{ 
	130 		System.out.println("You were attacked and you took"+  PH   +"Damage"); 
	131 		Health = Health - PH; 
	132 		 
	133 		encounter = encounter - 1; 
	134 	}*/ 
	 	 
		 
	 //}while(encounter != 2); 
	 	}

		private static RNG Dice0_20s2() {
			// TODO Auto-generated method stub
			return null;
		}
		private static RNG Dice0_100s1(){
			return null;
		} 
	 } 
	 
	 


