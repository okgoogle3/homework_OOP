package com.proj;

public class VolatileDataStorage extends LocalDataStorage{
    @Override
    public Object getData() {
        return this.data;
    }

    @Override
    public void setData(Object data) {
        this.data=data;
    }

    @Override
    void defragmentation() {
        /*some code*/
    }
}