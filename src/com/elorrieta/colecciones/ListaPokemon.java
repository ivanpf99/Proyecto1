package com.elorrieta.colecciones;

import java.util.ArrayList;

import com.elorrieta.objetos.Pokemon;

public class ListaPokemon {

	static Pokemon pMasCaro = new Pokemon();
	static Pokemon pMenosCaro = new Pokemon();

	public static void main(String[] args) throws Exception {

		pMenosCaro.setPrecio(Integer.MAX_VALUE);

		ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

		Pokemon p = new Pokemon();
		p.setNombre("Pikachu");
		p.setPrecio(1000);
		p.setBrillante(true);
		pokemons.add(p);

		p = new Pokemon();
		p.setNombre("Charmander");
		p.setPrecio(500);
		p.setBrillante(false);
		pokemons.add(p);

		p = new Pokemon();
		p.setNombre("Bulbasaur");
		p.setPrecio(5);
		p.setBrillante(true);
		pokemons.add(p);

		p = new Pokemon();
		p.setNombre("Doraemon");
		p.setPrecio(100);
		p.setBrillante(true);
		pokemons.add(p);

		for (Pokemon pokemon : pokemons) {
			float pokemonMasCaro = pMasCaro.getPrecio();
			float pokemonMenosCaro = pMenosCaro.getPrecio();
			float pokemonActual = pokemon.getPrecio();

			if (pokemonMasCaro < pokemonActual) {
				pMasCaro = pokemon;
			} // if

			if (pokemonMenosCaro > pokemonActual) {
				pMenosCaro = pokemon;
			} // if
		} // for
		System.out.println("El mas caro es:" + pMasCaro.getNombre());
		System.out.println("El menos caro es:" + pMenosCaro.getNombre());
	}// main

}// class
