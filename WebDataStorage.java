package com.proj;

public class WebDataStorage extends DataStorage{
    @Override
    public Object getData() {
        return "9/11/2001";
    }

    @Override
    public void setData(Object data) {
        this.data=data;
    }
}
