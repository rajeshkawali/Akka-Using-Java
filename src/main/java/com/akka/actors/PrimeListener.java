package com.akka.actors;

import com.akka.entity.Result;
import akka.actor.UntypedActor;

public class PrimeListener extends UntypedActor {
	@Override
	public void onReceive(Object message) throws Exception {
		System.out.println("PrimeListener.onReceive()");
		if (message instanceof Result) {
			Result result = (Result) message;
			System.out.println("Results: ");
			for (Long value : result.getResults()) {
				System.out.print(value + ", ");
			}
			System.out.println("Exit");
			// Exit
			getContext().system().shutdown();
		} else {
			unhandled(message);
		}
	}
}