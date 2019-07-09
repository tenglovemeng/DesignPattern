package ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperture;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public  void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
       for(int i=0;i<observers.size();i++) {
           Observer observer = observers.get(i);
           observer.update(temperture,humidity,pressure);
       }
    }

    private void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperture,float humidity,float pressure) {
        this.temperture = temperture;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
