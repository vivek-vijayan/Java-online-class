import java.util.ArrayList;
import java.util.Vector;

class Aadhar {
    int x = 0;
    Aadhar(int x) {
        this.x = x;
    }
}

public class Arrays {
    public static void main(String[] args) {
        
        int data[] = new int[2];

        data[0] = 1;
        data[1] = 2;

        for(int x : data) {
            System.out.println(x);
        }

        // Array List
        ArrayList<Aadhar> newlist = new ArrayList<Aadhar>();

        newlist.add(new Aadhar(99));
        newlist.add(new Aadhar(98));

        for(Aadhar x : newlist) {
            System.out.println(x.x);
        }


    }
}
