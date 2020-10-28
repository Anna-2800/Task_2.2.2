package web.controller;

public class Car {

    private int index;
    private String model;
    private int series;

    public Car(){}

    public Car(int index, String model, int series){
        this.index = index;
        this.model = model;
        this.series = series;
    }

    public int getIndex(){
        return index;
    }

    public String getModel(){
        return model;
    }

    public int getSeries(){
        return series;
    }

}
