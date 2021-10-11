package com.proj;

abstract class DataStorage
{
    private int size;
    protected Object data;
    public int getSize(){
        return this.size;
    }
    abstract public Object getData();
    abstract public void setData(Object data);
}