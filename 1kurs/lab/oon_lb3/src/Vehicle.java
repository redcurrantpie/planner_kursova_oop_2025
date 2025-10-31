public class Vehicle
{
    // поля екземпляра
    protected double petrol_amount;
    protected double tank_volume;
    protected boolean isOnBase;

    // конструктор з параметрами
    public Vehicle(double aPetrolAmount, double aTankVolume)
    {
        petrol_amount = aPetrolAmount;
        tank_volume = aTankVolume;
        isOnBase = false;
    }

    // методи доступу до полів
    double getTankVolume()
    {
        return tank_volume;
    }
    double getPetrolAmount()
    {
        return petrol_amount;
    }
    public boolean isOnBase()
    {
        return isOnBase;
    }

    public boolean arrive()
    {
        if (isOnBase) return false;
        isOnBase = true;
        Base.people_on_base += 1;
        Base.vehicles_on_base += 1;
        return true;
    }

    public boolean leave()
    {
        double needP = tank_volume - petrol_amount;
        if (!isOnBase || Base.people_on_base < 1 || Base.petrol_on_base < needP) return false;

        Base.people_on_base -= 1;
        Base.vehicles_on_base -= 1;
        Base.petrol_on_base -= needP;

        petrol_amount = tank_volume;
        isOnBase = false;
        return true;
    }

    public boolean set(double petrol)
    {
        if (isOnBase || petrol > tank_volume || petrol <= 0) return false;
        petrol_amount = petrol;
        return true;
    }
}
