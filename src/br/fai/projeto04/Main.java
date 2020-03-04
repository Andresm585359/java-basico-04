package br.fai.projeto04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}
	
	private void start() {
		
		int i=0;
		Scanner scan = new Scanner(System.in);
		double lala;
		lala = scan.nextDouble();
		
		while(i<20)
		{
			i++;
			System.out.println(lala);		
			
		}
	}

}
