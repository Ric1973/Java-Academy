package helloWorld;

import java.time.Duration;

import pattern.command.Command;
import pattern.command.ExtendedCommand;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Command command = new ExtendedCommand(Duration.parse("pt1s"));
		System.out.println("Command must run at: " + command.timeToRun());
		command.run();

	}

}
