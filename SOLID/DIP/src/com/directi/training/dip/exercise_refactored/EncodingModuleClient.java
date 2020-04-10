package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();

        IReader reader = new MyFileReader();
        IWriter writer = new MyFileWriter();
        encodingModule.encode(reader, writer);

        reader = new MyNetworkReader();
        writer = new MyDatabaseWriter();
        encodingModule.encode(reader, writer);
    }
}
