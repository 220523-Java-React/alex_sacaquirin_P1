package Model.example.model;

public enum Make {
    JEEP("JEEP"), Jeep("Jeep"),
    HONDA("HONDA"), Honda("Honda"),
    BMW("BMW"), Bmw("Bmw"),
    FORD("FORD"),Ford("Ford");

    public final String value;

    Make(String value){
        this.value = value;
    }

}
