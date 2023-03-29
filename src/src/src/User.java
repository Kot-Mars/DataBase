import java.util.HashMap;
import java.util.Objects;

public class User implements  CheakPassport {
    private String name;
    private int id;
    private boolean havePassport;
    private int age;

    public User() {
    }


    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        setHavePassport();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isHavePassport() {
        return havePassport;
    }

    public void setHavePassport() {
        if(getAge()>18)
            this.havePassport = true;
        else this.havePassport = false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void cheakPassport(HashMap<Integer, String>  hashMap) {
        if(isHavePassport()) {
            hashMap.put(getId(), getName());
        //    System.out.println(getId()+ " имеет паспорт");
        }
      //  else System.out.println(getId() + " не имеет паспорта");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && havePassport == user.havePassport && age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, havePassport, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", havePassport=" + havePassport +
                ", age=" + age +
                '}';
    }
}
