package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;

public class Demo2 {

	PrintWriter pw = new PrintWriter(System.out, true);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// More init code here

	Locale usLocale = Locale.US;
	Locale frLocale = Locale.FRANCE;
	Locale zhLocale = new Locale("zh", "CN");
	Locale ruLocale = new Locale("ru", "RU");
	Locale currentLocale = Locale.getDefault();

	ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);

	public Demo2() {
		// TODO Auto-generated constructor stub
	}

	public void printMenu() {
		pw.println("=== Localization App ===");
		pw.println("1. " + messages.getString("menu1"));
		pw.println("2. " + messages.getString("menu2"));
		pw.println("3. " + messages.getString("menu3"));
		pw.println("4. " + messages.getString("menu4"));
		pw.println("5. " + messages.getString("menu5"));
		pw.println("6. " + messages.getString("menu6"));
		pw.println("q. " + messages.getString("menuq"));
		pw.println(messages.getString("menucommand"));

	}

	public void run() {
		String line = "";
		while (!(line.equals("q"))) {
			this.printMenu();
			try {
				line = this.br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}

			switch (line) {
			case "1": setEnglish(); break;
			case "2":
				setFrench();
				break;
			// case "3": setChinese(); break;
			 case "4": setRussian(); break;
			// case "5": showDate(); break;
			// case "6": showMoney(); break;
			}
		}
	}

	public void setEnglish() {
		messages = 
				ResourceBundle.getBundle("MessagesBundle", currentLocale);
	}
	
	public void setFrench() {
		currentLocale = frLocale;
		messages = 
				ResourceBundle.getBundle("MessagesBundle", currentLocale);
	}
	public void setRussian() {
		currentLocale = ruLocale;
		messages = 
				ResourceBundle.getBundle("MessagesBundle", currentLocale);
	}
	
	// more init code here

	public static void main(String[] args) {
		Demo2 ui = new Demo2();
		ui.run();
	}

}
