package br.fai.projeto04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}
	
	private void start() {
		
		Scanner scan = new Scanner(System.in);
		usandoWhile();
		usandoDoWhile();
		usandoFor();
		
	}
	
	private void usandoWhile() {
		
		int i=0;
		
		while(i<20)
		{
			i++;
			System.out.println(i);		
		}

	}
	
	private void usandoDoWhile() {
		
		int i=0;

		do
		{
			i++;
			System.out.println(i);
		}while(i<20);

	}
	private void usandoFor() {

		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
		}
	}
}
