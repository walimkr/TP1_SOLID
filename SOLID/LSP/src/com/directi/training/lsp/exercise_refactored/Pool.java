package com.directi.training.lsp.exercise_refactored;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(IDuck... ducks)
    {
        for (IDuck duck : ducks) {
        	 try {
                 duck.quack();
             } catch (DuckException e) {
                 e.printStackTrace();
             }
        }
    }

    private void swim(IDuck... ducks)
    {
        for (IDuck duck : ducks) {
        	try {
                duck.swim();
            } catch (DuckException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
