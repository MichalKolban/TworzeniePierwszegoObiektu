package TworzeniePierwszychObiektow;

public class Client {



    public String CompanyName = "YoMamaSoFat" ;

    private String name;
    private String lastName;
    private Adress adress;



    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public Adress adress(){
        return adress;
    }
    public void setAdress(Adress adress){
        this.adress = adress;
    }
}
