public class Person {
    private int id;
    private String phone;
    private String name;
    private int exp;

    public int getId() {
        return id;
    }

    public Person(int id, String phone, String name, int exp) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.exp = exp;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return id + "|" + phone + "|" + name + "|" + exp;
    }
}

