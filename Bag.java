/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Bag {
    private ArrayList<Pokemon> pokemons;
    private float pokeball,greatball,ultraball;
    private RandomPokemon random;
    private Scanner sc;
    private String ball;
    private boolean isRunning;
    private String name;
    private float weight;
    private float stepLength;
    private int level;
   
    
    public Bag(){
	pokemons = new ArrayList<Pokemon>();
        pokeball=0.8f;
        greatball=0.9f;
        ultraball=1.0f; 
        sc=new Scanner(System.in);
        isRunning = true;
       
        
        }
    public void random(){
        isRunning = true;
        
        while(isRunning){
           
            name="???";
            weight=(float)Math.random()*10;
            stepLength=0;
            level=(int)Math.random()*10;
            random =new RandomPokemon(name,weight,stepLength,level);
       
            System.out.println("You meet "+random.randomGetGene()+" !!!");
            System.out.println("Choose your pokeball :");
            ball=sc.next();
            if(ball.equals("pokeball")){
                if( pokeball*random.randomGetMood()>0.5){
                        
                    this.addPokemonBag();
        
                }
            }
            else if(ball.equals("greatball")){
                if( greatball*random.randomGetMood()>0.5){
               
                    this.addPokemonBag();
        
                }
                
            }
            else if(ball.equals("ultraball")){
                if( ultraball*random.randomGetMood()>0.5){
               
                    this.addPokemonBag();
        
                }
                
            } 
            else if(ball.equals("run")){
            
                this.goFarm();
                isRunning=false;  
            }
        }
    }
        
    private void addPokemonBag(){
    
        
        pokemons.add(random.randomGetPokemon());
      
    }
  
    public void goFarm(){
        //return pokemon in your bag to pokemon farm
        
    }
    
}
