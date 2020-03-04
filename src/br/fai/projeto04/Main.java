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
		
		while(i<20)
		{
			i++;
			System.out.println(i);		
		}
		i=0;
		do
		{
			i++;
			System.out.println(i);
		}while(i<20);
		for(i=1;i<=20;i++)
		{
			System.out.println(i);
		}
		
	}

}
