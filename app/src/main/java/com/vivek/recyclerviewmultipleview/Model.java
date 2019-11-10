package com.vivek.recyclerviewmultipleview;

public class Model
{
    public static final int TEXT_TYPE=0;
    public static final int RADIO_TYPE=1;
    public static final int IMAGE_TYPE=2;
    public static final int RATING_TYPE=3;

    public int type;
    public String text;
    public int data;

    public Model(int type, String text, int data)
    {
        this.type = type;
        this.text = text;
        this.data = data;
    }
}
