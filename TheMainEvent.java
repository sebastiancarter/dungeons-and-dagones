package dungeonsndumbasses;

public class TheMainEvent {
		//Pseudo code
		
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
			private int num;
	
			//data
			private int Alive;
			private int Damage;
			private int Health;
			private boolean Healer;
			//data
			
			void typesetter(int type) {
				num = type;
			}
			
			void datasetter() {
				//TYPE 1 GRUNT
				if(num == 1)
				{
					Alive = 1;
					Damage = 8;
					Health = 20;
					Healer = false;
				}
				
				//TYPE 2 WARRIOR
				if(num == 2)
				{
					Alive = 1;
					Damage = 10;
					Health = 50;
					Healer = false;
				}
				
				//TYPE 3 CASTER
				if(num == 3)
				{
					Alive = 1;
					Damage = 20;
					Health = 30;
					Healer = false;
				}
				
				//TYPE 4 HEALER
				if(num == 4)
				{
					Alive = 1;
					Damage = 20;
					Health = 20;
					Healer = true;
				}
				
				//TYPE 5 EPIC
				if(num == 5)
				{
					Alive = 1;
					Damage = 34;
					Health = 100;
					Healer = false;
				}
				
				//TYPE 0 DEAD AS FUCK
				if(num == 0)
				{
					Alive = 0;
					Damage = 0;
					Health = 0;
					Healer = false;
				}
			}
			
			
			
			int HitRecieve(int playerdamage) {
				Health = Health - playerdamage;
			    if(Health <= 0)
				{
					num = 0;
				}
			    return Health;
			}
			
			
			int DamageGet() {
					return(Damage);
			};
			
			int HealthGet() {
				return(Health);
			};
			
			
			
		
	}

