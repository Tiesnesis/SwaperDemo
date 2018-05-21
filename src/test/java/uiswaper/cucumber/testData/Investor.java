package uiswaper.cucumber.testData;

public class Investor {

    public String name = "Ulvis Goldbergs";
    public String id = "310791-11768";
    public String phone = "+371 27446401";
    public String address = "Adress1 adreees2";
    public String type = "Private Person";
    public String country = "Latvia";
    public String email = "ulvisgoldbergs@gmail.com";
    public String password = "Password!1";


    private static Investor instance = null;

    public static Investor getInstance(){
        if(instance==null){
            instance = new Investor();
        }
        return instance;
    }
}