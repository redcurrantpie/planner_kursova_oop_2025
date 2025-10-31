package packD;

import packB.B;

public class D extends B {
    public void printInfo() {
        System.out.println("\nD (printInfo):");
        System.out.println("iPub = " + iPub); //є прямий доступ
        // System.out.println("iPriv = " + iPriv);
        System.out.println("getIPri = " + getIPriv()); //немає прямого доступу
        System.out.println("iProt = " + iProt); //є прямий доступ
        //System.out.println("i = " + super.i);//немає прямого доступу
    }
}
