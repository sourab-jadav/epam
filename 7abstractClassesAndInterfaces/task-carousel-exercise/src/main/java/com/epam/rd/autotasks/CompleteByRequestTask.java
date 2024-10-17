package com.epam.rd.autotasks;

public class CompleteByRequestTask implements Task {
    private boolean complete=false;

    @Override
    public void execute() { // no parameters
        complete();
    }

    @Override
    public boolean isFinished() {
        complete();
        execute();
        return true;
    }

    public void complete() {
        this.complete=true;
    }
}
