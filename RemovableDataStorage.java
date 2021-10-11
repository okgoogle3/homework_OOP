package com.proj;

public class RemovableDataStorage extends DataStorage{
    private double massOfDevice;
    public double getMassOfDevice(){
        return this.massOfDevice;
    }

    @Override
    public Object getData() {
        return "3";
    }

    @Override
    public void setData(Object data) {
        this.data=data;
    }
}
