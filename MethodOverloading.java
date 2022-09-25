class Sample {
    // 1
    int add(int a, int b) {
        return a + b;
    }

    // 3 1.0, 1.1, 1.2
    float add(int a, int b, float c) {
        return (float) (a + b + c);
    }


    // 2 1,2,3,4,5
    int add(int a, int b, int c) {
        return a + b + c;
    }

    
}

public class MethodOverloading {
    public static void main(String[] args) {
        Sample s = new Sample();
        float x = s.add(3, 4, 5.0f);
        System.out.println(x);
    }
}