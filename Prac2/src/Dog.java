public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int dogAge_toHuman(){
        return this.age*7;
    }

    public String toString(){
        return "Name: " + name + "Age: " + Integer.toString(age);
    }
}
