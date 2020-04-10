package com.directi.training.dip.exercise_refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter implements IWriter
{
    @Override
    public void write(String encodedLine) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt"));
        writer.write(encodedLine);
        writer.close();
    }
}
