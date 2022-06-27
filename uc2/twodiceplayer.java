//Repeat till the Player reaches the winning position 100.

package com.example.demo;

public class twodiceplayer extends check_play_dice {
	static final int NOPLAY=0,SNAKE=1,LADDER=2;
	
	public static void main(String[] args) {
		int position1=new snack().position;
		int position2=new snack().position;
		int position=0,diceroll;
		boolean player1 = true;
		
		while((position1<100)&&(position2<100)) {
			diceroll=getDiceRoll();
			switch(getOption()) {
			case NOPLAY->{
			}
			case SNAKE-> position -= diceroll;
			case LADDER->{
				position += diceroll;
				continue;
			}
		}
	}System.out.println("player restarts from zero");
 }
}