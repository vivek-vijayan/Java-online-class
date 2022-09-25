class Innerclass {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Static binding
        Innerclass iclass = new Innerclass();
        iclass.setNumber(100);
        System.out.println("Number : " + iclass.getNumber());
    }
}
