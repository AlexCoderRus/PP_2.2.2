package web.model;

public class Car {
    private String model;
    private String named;
    private int series;

    public Car(String model, String named, int series) {
        this.model = model;
        this.named = named;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNamed() {
        return named;
    }

    public void setNamed(String named) {
        this.named = named;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

}
