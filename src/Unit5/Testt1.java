package Unit5;

public class Testt1 {
    private int age;
    private String name;
    private  String lastname;

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String getLastname(){return lastname;}
    public void setLastname(String lastname){this.lastname = lastname;}

    public Testt1() {
    }

    public Testt1(int age, String name, String lastname) {
        this.age = age;
        this.name = name;
        this.lastname = lastname;
    }

    public Testt1(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Testt1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Testt1(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Testt1 guest = (Testt1) obj;
        if (this.name == null && this.lastname == null){
            return this.age == guest.age;
        }
        if (age == guest.age && this.name.equals(guest.name) && lastname.equals(guest.lastname)) {
            return true;
        }
        return false;
    }
}
