package Model.example;

public enum CarTypes {
    Coupe("coupe"),
    Suv("Suv"),
    Crossover("Crossover"),
    Luxery("Luxery"),
    Sedan("Sedan");
    public final String value;
    CarTypes(String value){
        this.value=value;
    }

}
