public class Main
{
    public static void main(String[] args)
    {
        //Конструктори
        Stakan stakan1 = new Stakan(13,30.8,5);
        Stakan stakan2 = new Stakan();

        // Вивід 1-го об'єкту, застосування методів доступу
        System.out.print("Glass 1:\n  Mass: "+stakan1.getMass()+"g\n  Volume: "+stakan1.getVolume()+"ml\n  Content: "+stakan1.getContent()+"\n");

        // Застосування методів модифікації
        System.out.println("Зміна маси cтакану#2 на 40.0: " + stakan2.setMass(8.0));
        System.out.println("Зміна об’єму cтакану#2 на -89.0: " + stakan2.setVolume(-89));
        System.out.println("Зміна вмісту cтакану#2 на 44.0: " + stakan2.setContent(44.0));

        System.out.println("Glass2:\n  "+stakan2);// Вивід 2-го об'єкту, застосування методy з class Stakan

        // Створити масив об’єктів
        System.out.println("\nМасив стаканів:");
        Stakan[] glasses = new Stakan[3];
        glasses[0] = stakan1;
        glasses[1] = stakan2;
        glasses[2] = new Stakan(-8, 5, 3);

        for (Stakan glass: glasses)
        {

            System.out.println("  "+glass);
        }
    }
}
