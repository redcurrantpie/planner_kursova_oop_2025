public class Bus extends Vehicle
{
    // поля екземпляра
    private int people;
    private int max_people;

    // конструктор з параметрами
    public Bus(int aPeople, int aMaxPeople, double aPetrolAmount, double aTankVolume)
    {
        super(aPetrolAmount, aTankVolume);
        people = aPeople;
        max_people = aMaxPeople;
    }

    // методи доступу до полів
    public int getPeopleCount()
    {
        return people;
    }
    public int getMaxPeople()
    {
        return max_people;
    }

    @Override
    public boolean arrive()
    {
        if (!super.arrive()) return false;
        Base.people_on_base += people;
        people = 0;
        return true;
    }

    @Override
    public boolean leave()
    {
        if (!super.leave()) return false;

        int bye_bye_people = Math.min(max_people, Base.people_on_base);
        people = bye_bye_people;
        Base.people_on_base -= people;

        return true;
    }

    public boolean set(double petrol, int aPeople) {
        if (isOnBase || petrol > tank_volume || petrol < 0 || aPeople < 0 || aPeople > max_people) return false;
        petrol_amount = petrol;
        people = aPeople;
        return true;
    }
}
