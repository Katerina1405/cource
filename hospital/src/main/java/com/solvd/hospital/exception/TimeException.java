package com.solvd.hospital.exception;

public class TimeException extends NotFoundException
{
    public TimeException(double message) { super("\"" + message + "\" Time for work is over.");
    }
}
