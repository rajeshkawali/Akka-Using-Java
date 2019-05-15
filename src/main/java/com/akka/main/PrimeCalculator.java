package com.akka.main;

import com.akka.actors.PrimeListener;
import com.akka.entity.NumberRangeMessage;
import com.akka.workers.PrimeMaster;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class PrimeCalculator {
	public void calculate(long startNumber, long endNumber) {
		System.out.println("PrimeCalculator.calculate()");
		// Create our ActorSystem, which owns and configures the classes
		ActorSystem actorSystem = ActorSystem.create("PrimeCalculator");
		// Create our listener
		final ActorRef primeListener = actorSystem.actorOf(Props.create(PrimeListener.class), "primeListener");
		// Create the PrimeMaster: we need to define an UntypedActorFactory so that we
		// can control
		// how PrimeMaster instances are created (pass in the number of workers and
		// listener reference
		ActorRef primeMaster = actorSystem.actorOf(Props.create(PrimeMaster.class, 10, primeListener), "primeMaster");
		// Start the calculation
		primeMaster.tell(new NumberRangeMessage(startNumber, endNumber), primeMaster);
	}

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("See ReadMe.txt file.We have to pass the two args like 4 6");
			System.out.println("Usage the command: java com.akka.main.PrimeCalculator <start-number> <end-number>");
			System.exit(0);
		}
		long startNumber = Long.parseLong(args[0]);
		long endNumber = Long.parseLong(args[1]);
		PrimeCalculator primeCalculator = new PrimeCalculator();
		primeCalculator.calculate(startNumber, endNumber);
		System.out.println("PrimeCalculator.main()");
	}
}