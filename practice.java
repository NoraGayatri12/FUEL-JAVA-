class z
{
    int k;
    static int b = 100;
    int c = 30;
    int y = 0;
    static int d = 70;

    void add()
    {
        int e = 50;

        ++d;
        --e;

        y = b + c + d + e;
        System.out.println(y);

        k = y + d + b;
        System.out.println(k);
    }
}

public class practice
{
    public static void main(String[] args)
    {
        z m = new z();
        m.add();
        m.add();
        m.add();

        z n = new z();
        n.add();
        n.add();
    }
}