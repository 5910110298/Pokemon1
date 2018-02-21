package pokemongame;

import java.util.*;
import java.io.*;

public class CommandParser{
	private PokemonFarm pokemonFarm;
        private Bag bag;
	private Scanner commandScanner;
	private boolean isRunning;

	public CommandParser(PokemonFarm pokemonFarm){
		this.pokemonFarm = pokemonFarm;
                
		commandScanner = new Scanner(System.in);
		isRunning = false;
	}

	public void run(){
		isRunning = true;
		String command;

		System.out.println("Hello Pokemon Game");
		while(isRunning){
			System.out.print("\nWhat do you want? Type: ");
			command = commandScanner.next();
			// System.out.println("You type \'"+command+"\'");
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
			}
			else if(command.equals("add"))
				this.addPokemon();
			else if(command.equals("list"))
				this.listPokemons();
			else if(command.equals("feed"))
				this.feedPokemons();
                        else if(command.equals("exercise"))
                                this.exercisePokemons();
                        else if(command.equals("fight"))
                                this.upLevel();
                        else if(command.equals("catch"))
                                this.catchPokemons();
		}

	}

	private void addPokemon(){
		//commandScanner.nextLine();
		// input name weight length
                System.out.print("Pokemon: ");
		String pokemonType =commandScanner.next();
                System.out.print("Pokemon name: ");
		String name =commandScanner.next();
                System.out.print("Pokemon weight: ");
		float weight =commandScanner.nextFloat();
                System.out.print("Pokemon stepLength: ");
		float stepLength =commandScanner.nextFloat();
                int level=1;
                
		if(pokemonType.equals("Caterpie")){
			Caterpie caterpie = new Caterpie(name, weight, stepLength,level);
			pokemonFarm.addPokemon(caterpie);
		}
                else if(pokemonType.equals("Weedle")){
			Weedle weedle = new Weedle(name, weight, stepLength,level);
			pokemonFarm.addPokemon(weedle);
		}
                else if(pokemonType.equals("Wurmple")){
			Wurmple wurmple = new Wurmple(name, weight, stepLength,level);
			pokemonFarm.addPokemon(wurmple);
		}

	}

	private void listPokemons(){
		System.out.println("==========================================");
		System.out.println("Pokemon List");
		System.out.println("==========================================");
		this.pokemonFarm.list();
		System.out.println("==========================================");
	}

	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.feed("all");
		}
                else{
                        this.pokemonFarm.feed(name);
                }
	}

        private void exercisePokemons(){
            System.out.print("Which pokemon do you want to exercise? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.exercise("all");
		}
                else{
                        this.pokemonFarm.exercise(name);
                }
        }
        private void upLevel(){
            System.out.print("Which pokemon do you want to fight? ");
		String name = this.commandScanner.next();
               if(name.equals("all")){
			this.pokemonFarm.fight("all");
		}
                else{
                        this.pokemonFarm.fight(name);
                }
       }
        
        private void catchPokemons() {
           
             bag =new Bag();
             bag.random();
        
        }




}


