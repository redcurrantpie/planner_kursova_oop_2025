import packB.B;
import packB.C;
import packD.D;

public class Main
{
    public static void main(String[] args)
    {
        A a=new A(); //Клас цього ж пакету
        System.out.println("A:");
        System.out.println("iPub ="+a.iPub);
        //System.out.println(“A private int iPriv=”+a.iPriv); //є прямий доступ
        System.out.println("getIPriv ="+a.getIPriv()); //немає прямого доступу
        System.out.println("iProt = " + a.iProt); //є прямий доступ
        System.out.println("i (default) = " + a.i); //є прямий доступ

        a.printInfo(); //Той же клас

        B b=new B(); //Клас в іншому пакеті
        System.out.println("\nB:");
        System.out.println("iPub ="+b.iPub); //є прямий доступ
        //System.out.println("B private int iPriv="+b.iPriv);
        System.out.println("getIPriv ="+b.getIPriv()); //немає прямого доступу
        //System.out.println("iProt = " + b.iProt);
        System.out.println("getIProt = " + b.getIProt());//немає прямого доступу
        //System.out.println("i (default) = " + b.i);
        System.out.println("getI = " + b.getI());//немає прямого доступу

        C c=new C();//Підклас класу в одному пакеті(в іншому відносно main)
        c.printInfo();

        D d=new D();//Підклас класу в іншому пакеті(в іншому відносно main)
        d.printInfo();
    }
}