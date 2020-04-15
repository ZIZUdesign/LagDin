package sample;

import javafx.concurrent.Task;

public class ThreadAdded extends Task<Integer> {

private int value;

public  ThreadAdded (int value){
    this.value= value;
}


    @Override
    protected Integer call() throws Exception {

       try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // gjør ikke noe her, men hvis hvis du er i en løkke
            // burde løkkes stoppes med break hvis isCancelled() er true...
        }

        // 50/50 sannsynlighet for å kaste et avvik:
        if(Math.random() >= 0.5) {
            throw new ArithmeticException("Ups!");
        }

        return value*2;
    }


    }

