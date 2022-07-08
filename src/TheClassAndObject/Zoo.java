package TheClassAndObject;

public class Zoo {
    private String name;
    private Double weight;
    private String classifcation;

    public Zoo(String name, Double weight, String classifcation) {
        this.name = name;
        this.weight = weight;
        this.classifcation = classifcation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getClassifcation() {
        return classifcation;
    }

    public void setClassifcation(String classifcation) {
        this.classifcation = classifcation;
    }

    public  void printinfo(){
        System.out.println("name:::" + name);
        System.out.println("weight:::" + weight);
        System.out.println("classfication:::" +classifcation);
    }
}
