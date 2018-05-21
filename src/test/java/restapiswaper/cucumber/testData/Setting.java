package restapiswaper.cucumber.testData;

public class Setting{
    String type;
    String name;
    boolean value;

    public Setting(String name, boolean value, String type){
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public boolean getValue(){
        return value;
    }
}