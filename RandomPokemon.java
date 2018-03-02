/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import java.util.Random; 
import java.util.Scanner;

public class RandomPokemon {
    private Scanner sc = new Scanner(System.in);
    private Bag  bag;
    Random rand = new Random(); 
    
    public void find(){
        
        String name[] = {"weedle","wurmple","caterpie"};
        String type = name[rand.nextInt(3)];
        System.out.println("Pokemon is "+ type);
        
        catchMon(type);
        
        
    }
    
    private void catchMon(String type){
        
        int mood = rand.nextInt(10)+1;
        int ball = selectBall();
        int result = 0;
        if(ball==1){
            result = mood*8;
        }
        else if(ball==2){
            result = mood*9; 
        }
        else if(ball==3){
            result = mood*10; 
        }
        
        if(result >= 50){
            System.out.println("Success");
             bag = new Bag();
             addPokemon(type);
             
        }else{
            System.out.println("Fail");
        }
        
        
    }
    
    private int selectBall(){
        System.out.println("\nSelect Ball:");
        System.out.println("Type 1 is Pokeball");
        System.out.println("Type 2 is Greatball");
        System.out.println("Type 3 is Ultraball");
        int ball = sc.nextInt();
        return ball;
    }
    
    	private void addPokemon(String type){
                //sc.nextLine();
                System.out.print("name :");
		String name = sc.next();
                System.out.print("weight :");
		float weight = sc.nextFloat();
                System.out.print("step length :");
		float stepLength = sc.nextFloat();
                int level=(int)Math.random()*10;
                

            switch(type){
                case "weedle":
                    Weedle weedle = new Weedle(name, weight, stepLength,level);
                    bag.addPokemon(weedle);
                    break;
                case "wurmple":
                    Wurmple wurmple = new Wurmple(name, weight, stepLength,level);
                    bag.addPokemon(wurmple);
                    break;
                case "caterpie": 
                    Caterpie caterpie = new Caterpie(name, weight, stepLength,level);
                    bag.addPokemon(caterpie);
                    break;
                default:
                    break;
            }

	}
    
}
