import java.util.Scanner;
public class Gain {	
public static void main(String[] args) {	
 int Potions, Weapons, Resources, isChestopen;
 String Common, uncommon, rare, epic, legendary;
 Potions = 1;
 Weapons = 2;
 Resources = 3;
 Scanner Chestopen = new Scanner(System.in);
 Scanner pause = new Scanner(System.in);
 System.out.print("A chest appears in front of you\n");
 System.out.print("It appears to be old and mossy\n");
 System.out.print("do you wish to open the chest?\n");
 System.out.print("(1 is open, anything else is leave)\n");
 isChestopen = Chestopen.nextInt();
 if(isChestopen==1)
  {
   System.out.print("You open the chest to find...\n");
   int wait = pause.nextInt();
   
   System.out.print("placeholder");
  }
 }
}