public class A
{
    public int iPub=1;
    private int iPriv=2;
    protected int iProt=3;
    int i=4;

    public int getIPriv()
    {
        return iPriv;
    }

    public void printInfo() {
        System.out.println("\nA (printInfo):");
        System.out.println("public: " + iPub);
        System.out.println("private: " + iPriv);
        System.out.println("protected: " + iProt);
        System.out.println("default: " + i);
    }
}
