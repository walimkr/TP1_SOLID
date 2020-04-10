package com.directi.training.isp.exercise_refactored;

import java.util.TimerTask;

public class Timer
{
    public void register(long timeOut, final ITimer timerClient)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                timerClient.timeOutCallback();
            }
        }, timeOut);
    }
}
