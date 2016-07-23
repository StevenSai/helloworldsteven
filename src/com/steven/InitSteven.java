package com.steven;

public class InitSteven {
	
	private String name = "石艺赛";
	
	public void show(){
		int score = 0;
		class MInner{
			int score = 100;
			public int getScore() {
				return score-10;
			}
		}
		MInner x2 = new MInner();
		score = x2.getScore();
		System.out.println("name:"+name+"\nscore:"+score);
	}

	public static void main(String[] args) {
		InitSteven x1 = new InitSteven();
		x1.show();
	}

}