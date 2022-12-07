package Unit5;

public class InstanceOf {
    private int age;
    private String name;
    private  String lastname;

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String getLastname(){return lastname;}
    public void setLastname(String lastname){this.lastname = lastname;
    }


    public InstanceOf(int age, String name, String lastname) {
        this.age = age;
        this.name = name;
        this.lastname = lastname;
    }
    InstanceOf ins = new InstanceOf(13,"chto","to");
    InstanceOf uns = new InstanceOf(24,"yeto","zae");
    }



