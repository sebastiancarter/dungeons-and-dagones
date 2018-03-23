package dungeonsndumbasses;

public class TheMainEvent {
		/* Determine Encounter Data
		run when new room entered
		3-4 monsters max per room
		20%-1 mob, 50%-2 mobs, 20%-3 mobs, 10%-4 mobs
		Rand0_9s1: 0-1: 1 mob, 2-6: 2 mobs, 7-8: 3 mobs, 9: 4 mobs
		
		monster types/spawn rate
		Grunt: 40%, Warrior: 25%, Caster: 20%, Healer: 10%, Epic: 5%
		Rand0_19: 0-7:Grunt, 8-12:Warrior, 13-16:Caster, 17-18:Healer, Epic:19
		
		Monster Characteristics
		(type1)Grunt: 	Damage:8
						Health:20
		(type2)Warrior:	Damage:10
						Health:50
		(type3)Caster:	Damage:20
						Health:30
		(type4)Healer:	Heals:20
						Health:20
		(type5)Epic:	Damage:34
						Health:100
		(type0)Dead/DNE
		
		Combat Data
		Run after each player turn
		Combat: Each surviving monster will do its attack/heal at the end of each turn
		*/
			
	
			//type
			private int num = 0;
	
			//data
			private int Damage;
			private int Health;
			private boolean Healer;
			//data
			
			void datasetter(int type) {
				num = type;
				
				//TYPE 1 GRUNT
				if(num == 1)
				{
					Damage = 8;
					Health = 20;
					Healer = false;
				}
				
				//TYPE 2 WARRIOR
				if(num == 2)
				{
					Damage = 10;
					Health = 50;
					Healer = false;
				}
				
				//TYPE 3 CASTER
				if(num == 3)
				{
					Damage = 20;
					Health = 30;
					Healer = false;
				}
				
				//TYPE 4 HEALER
				if(num == 4)
				{
					Damage = 10;
					Health = 20;
					Healer = true;
				}
				
				//TYPE 5 EPIC
				if(num == 5)
				{
					Damage = 34;
					Health = 100;
					Healer = false;
				}
				
				//TYPE 0 DEAD AS FUCK
				if(num == 0)
				{
					Damage = 0;
					Health = 0;
					Healer = false;
				}
			}
			
			//changes mobs health with players damage
			void HitRecieve(int playerdamage) {
				Health = Health - playerdamage;
			    if(Health <= 0)
				{
					datasetter(0);
				}
			}
			
			//this is used when the healer heals an ally
			void HealRecieve() {
				Health = Health + 10;
			}
			
			int DamageGet() {
					return Damage;
			}
			
			//to tell player the mobs health
			int HealthGet() {
				return Health;
			}
			
			boolean HealerGet() {
				return Healer;
			}
			
			
		
	}

