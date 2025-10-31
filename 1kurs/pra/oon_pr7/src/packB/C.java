package packB;

public class C extends B
{
    public void printInfo()
    {
        System.out.println("\nC (printInfo):");
        System.out.println("iPub = " + iPub); //є прямий доступ
        // System.out.println("iPriv = " + iPriv);
        System.out.println("getIPriv = " + getIPriv()); //немає прямого доступу
        System.out.println("iProt = " + iProt); //є прямий доступ
        System.out.println("i = " + i); //є прямий доступ
    }
}