package TworzeniePierwszychObiektow;

public class ShopMain {


    public static void main(String[] args) {


        Client clientMichael = new Client();

        clientMichael.setName("Michael");
        clientMichael.setLastName("Kolban");

        Adress michaelAdress = new Adress();

        michaelAdress.setPostCode("08-090");
        michaelAdress.setPostOffice("Szczecin Drzymały");


        System.out.println(clientMichael.getLastName());
        System.out.println(clientMichael.CompanyName);

    }
}