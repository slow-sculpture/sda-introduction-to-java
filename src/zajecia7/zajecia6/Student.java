package zajecia7.zajecia6;

public class Student extends Person{
    private int noIndex;
    private String destination;
    private String univName;

    public Student(int noIndex, String destination, String univName){
        this.noIndex = noIndex;
        this.destination = destination;
        this.univName = univName;
    }

    public int getNoIndex() {
        return noIndex;
    }

    public void setNoIndex(int noIndex) {
        this.noIndex = noIndex;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }
}
