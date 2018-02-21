/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

/**
 *
 * @author Acer
 */
public class RandomPokemon {
    private Pokemon pokemon;
    private Caterpie caterpie ;
    private Weedle weedle;
    private Wurmple wurmple;
    float r=(float)Math.random();
    private String name;
    private float weight;
    private float stepLength;
    private int level;
    
    public RandomPokemon(name,weight,stepLength,level){
        
        this.name = name;
        this.level =level;
        this.stepLength=stepLength;
        this.weight=weight;
        if(r<0.3){
            caterpie = new Caterpie(name, weight, stepLength,level);
        }
        else if(r>=0.3&&r<0.6){
            weedle = new Weedle(name, weight, stepLength,level);
        }
        else {
            wurmple = new Wurmple(name, weight, stepLength,level);   
        }
    }
    

    public Pokemon randomGetPokemon(){
        if(r<0.3){
            return caterpie;
        }
        else if(r>=0.3&&r<0.6){
            return weedle;
        }
        else{
            return wurmple;
        }
            
        
    }
  
    
    
    public String randomGetGene(){
        
        if(r<0.3){
           
            return "Caterpie";
        }
        else if(r>=0.3&&r<0.6){
            
            return "Weedle";
        }
        else {
            
            return "Wurmple";
        }
    }
    
    public float randomGetMood(){
        return pokemon.getMood();
    }

    private void randomGetGene(String name, float weight, float stepLength, int level) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
}
