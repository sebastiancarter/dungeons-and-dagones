import java.util.Scanner;
public class Gain {		

	private int replacement=0;

public void uiloot() {	
 int isChestopen; //Potions, Weapons, Resources,// 
 int[] prize
 prize=loot.rewards;
 /*Potions = 1;
 Weapons = 2;
 Resources = 3;*/
 Scanner Userinput = new Scanner(System.in);
 Scanner pause = new Scanner(System.in);
 System.out.print("A chest appears in front of you\n");
 System.out.print("It appears to be old and mossy\n");
 System.out.print("do you wish to open the chest?\n");
 System.out.print("(1 is open, anything else is leave)\n");
 isChestopen = Userinput.nextInt();
 if(isChestopen==1)
  {
   System.out.print("You open the chest to find...\n");
   int wait = pause.nextInt();
   
   if(prize[0]==1){
	   System.out.print("A health potion\n");
   };
   if(prize[1]==1){
	   System.out.print("A mana potion\n");
   };
   if(prize[2]!=0){
	   System.out.print("A sword with "+prize[2]+" damage\n");
	   System.out.print("Do you wish to replace your sword?\n");
	   System.out.print("(1 is yes, anything else is no)\n");
	   int num=Userinput.nextInt();
	   if(num==1){
		   replacement=1;
	   };
   };
  };
}


int retReplacement(){
	return(replacement);
};
}