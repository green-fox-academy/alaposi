package pokemon;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Pokemon> pokemonOfAsh = initializePokemons();

    // Every pokemon has a name and a type.
    // Certain types are effective against others, e.g. water is effective against fire.

    // Ash has a few pokemon.
    // A wild pokemon appeared!

    Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

    // Which pokemon should Ash use?
    for (int i = 0; i < pokemonOfAsh.size(); i++) {
      if (pokemonOfAsh.get(i).isEffectiveAgainst(wildPokemon)) {
        System.out.println("I choose you, " + pokemonOfAsh.get(i).name);
      }
    }

    // szebb megoldás:
    int index = 0;
    while (!pokemonOfAsh.get(index).isEffectiveAgainst(wildPokemon)) {
      index++;
    }
    System.out.println("I choose you, " + pokemonOfAsh.get(index).name);



    System.out.println(pokemonOfAsh.get(0).sameType(wildPokemon));
    System.out.println(wildPokemon.name);


  }

  private static List<Pokemon> initializePokemons() {
    List<Pokemon> pokemon = new ArrayList<>();

    pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
    pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
    pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
    pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
    pokemon.add(new Pokemon("Kingler", "water", "fire"));

    return pokemon;
  }

}