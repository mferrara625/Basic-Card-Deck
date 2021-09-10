package com.company;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Deck deck = new Deck();
        deck.createDeck();
        Collections.shuffle(deck.fullDeck);
        for(int i = 0; i < 5; i++){
            System.out.println(deck.fullDeck.get(deck.fullDeck.size() - 1).name + " of " + deck.fullDeck.get(deck.fullDeck.size() - 1).suit);
            deck.fullDeck.remove(deck.fullDeck.size() - 1);
        }
    }
}
