package com.bridgelabz.deckofcards;

public class ShuffleCards {

        public void shuffleCards(String[][] array){
            String temp;
            for (int i =0;i<4;i++) {
                for (int j = 0;j<13;j++) {
                    int x = (int)(Math.random()*10)%4;
                    int y = (int)(Math.random()*10)%13;
                    temp = array[i][j];
                    array[i][j] = array[x][y];
                    array[x][y] = temp;
                }
            }
        }
    }

