package pokemongame;


import java.util.*;

public class Pokemon{
	private String name;
	private float weight;
	private float stepLength;
	private int step;
        private int level;
	private float gainingWeightStep;
	private String[] types;
        private float mood;

        
        

	public Pokemon(String name,
		       float weight,
		       float stepLength,
                       int level,
		       float gainingWeightStep,
		       String[] types){
		this.name = name;
		this.weight = weight;
		this.stepLength = stepLength;
		this.gainingWeightStep = gainingWeightStep;
                this.level=level;
            
		step = 0;

		if(types == null)
			this.types = new String[] {"bug"};
		else
			this.types = types;
	}
        public String getName(){
            return name;
        }
	public void walk(){
		step += 1;
	}

	public void eat(){
		weight += gainingWeightStep;
	}

        public void exercise(){
                weight -= gainingWeightStep;
                this.walk();
        }
        public void fight(){
                level+=1;
        }
	public void print(){
		System.out.println("Pokemon name: " + name);
 		System.out.print("        Type: ");
		for(String type: types){
			System.out.print(type+",");
		}
		System.out.println();
		System.out.println("      Weight: " + weight);
		System.out.println(" Step length: " + stepLength);
		System.out.println("  Today Step: " + step);
                System.out.println("        Level : "+level);
		System.out.println("------------------------------------------");
	}
        public float getMood(){
            mood=(float) Math.random();
            return mood;
        }

}
