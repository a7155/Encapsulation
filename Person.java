/**
 *
 * @author 4715
 */
//Superclass Person
public class Person {
    //Variable Intance
    private String name;
    private String address;
    
    //construktor
    public Person(String name, String address){
    this.name = name;
    this.address = address;
    }
    
    //getter

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    public String toString(){
    return name + "Alamat :" + address ;
    }
    
}

