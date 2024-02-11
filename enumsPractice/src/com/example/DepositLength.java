package com.example;

public enum DepositLength
{
    // Only allowed instances of DepositLength enum
    THREE_MONTHS(90),
    SIX_MONTHS(180),
    ONE_MONTH();

    private int days;

    DepositLength()
    {

    }

    private DepositLength(int days)
    {
        this.days = days;
    }

    public int getDays()
    {
        return this.days;
    }
}

