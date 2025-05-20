public class Truck extends Vehicle
{
    // поля екземпляра
    private double cargo;
    private double max_cargo;

    // конструктор з параметрами
    public Truck(double aCargo, double aMaxCargo, double aPetrolAmount, double aTankVolume) {
        super(aPetrolAmount, aTankVolume);
        cargo = aCargo;
        max_cargo = aMaxCargo;
    }

    // методи доступу до полів
    public double getCurrentcargo()
    {
        return cargo;
    }
    public double getMaxcargo()
    {
        return max_cargo;
    }

    @Override
    public boolean arrive() {
        if (!super.arrive()) return false;
        Base.goods_on_base += cargo;
        cargo = 0;
        return true;
    }

    @Override
    public boolean leave()
    {
        if (!super.leave()) return false;

        double canTake = Math.min(max_cargo, Base.goods_on_base);
        cargo = canTake;
        Base.goods_on_base -= cargo;

        return true;
    }

    public boolean set(double petrol, double aCargo)
    {
        if (isOnBase || petrol > tank_volume || petrol <= 0 || aCargo > max_cargo || aCargo < 0) return false;
        petrol_amount = petrol;
        cargo = aCargo;
        return true;
    }
}
