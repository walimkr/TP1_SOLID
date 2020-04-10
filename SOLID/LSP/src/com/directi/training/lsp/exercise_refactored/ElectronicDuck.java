package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements IDuck
{
    private boolean _on = false;

    @Override
    public void quack() throws DuckOff
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new DuckOff("Can't quack when off");
        }
    }

    @Override
    public void swim() throws DuckOff
    {
        if (_on) {
            System.out.println("Electronic duck swim...");
        } else {
            throw new DuckOff("Cant swim when off");
        }
    }

    public void turnOn()
    {
        this._on = true;
    }

    public void turnOff()
    {
        this._on = false;
    }
    
}
