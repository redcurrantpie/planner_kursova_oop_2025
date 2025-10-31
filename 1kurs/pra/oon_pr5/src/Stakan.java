public class Stakan
{
    // поля екземпляра
    private double mass;
    private double volume;
    private double content ;

    // конструктор за замовчуванням
    public Stakan()
    {
        mass = 30.0;
        volume = 200.0;
        content= 0.0;
    }

    // конструктор з параметрами
    public Stakan(double aMass, double aVolume, double aContent)
    {
        if(aMass>0 && aVolume>0 && aContent>=0)
        {
            mass = aMass;
            volume = aVolume;
            content = aContent;
        }
        else
        {
            mass = 30.0;
            volume = 200.0;
            content = 0.0;
        }
    }

    // методи доступу до полів
    public double getMass()
    {
        return mass;
    }

    public double getVolume()
    {
        return volume;
    }

    public double getContent()
    {
        return content;
    }

    @Override
    public String toString()
    {
        return String.format("Mass: %.1f g, Volume: %.1f ml, Content: %.1f ml", mass, volume, content);
    }

    // методи модифікації
    public boolean setMass(double aMass) //повертає true у випадку успіху
    {
        if (aMass > 0)
        {
            mass = aMass;
            return true;
        }
        return false;
    }

    public boolean setVolume(double aVolume)
    {
        if (aVolume > 0)
        {
            volume = aVolume;
            return true;
        }
        return false;
    }

    public boolean setContent(double aContent)
    {
        if (aContent >= 0 && aContent <= volume)
        {
            content = aContent;
            return true;
        }
        return false;
    }
}