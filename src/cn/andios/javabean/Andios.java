package cn.andios.javabean;
/*
andios javaBean
 */
public class Andios {
    private Person teaXu;
    private Person stu;
    private String location;

    public Andios() {
    }

    public Andios(Person teaXu, Person stu, String location) {
        this.teaXu = teaXu;
        this.stu = stu;
        this.location = location;
    }

    public Person getTeaXu() {
        return teaXu;
    }

    public void setTeaXu(Person teaXu) {
        this.teaXu = teaXu;
    }

    public Person getStu() {
        return stu;
    }

    public void setStu(Person stu) {
        this.stu = stu;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

