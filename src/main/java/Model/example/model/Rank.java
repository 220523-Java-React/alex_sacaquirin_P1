package Model.example.model;

    public enum Rank {

        CUSTOMER("CUSTOMER"),Customer("Customer"),
        EMPLOYEE("EMPLOYEE"), Employee("Employee");

        public final String value;

        Rank(String value){
            this.value = value;
        }
    }


