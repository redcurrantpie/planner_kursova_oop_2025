import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class Main
{
    public static void main(String[] args)
    {
        Map<String, Integer> m = new TreeMap<>();

        try
        {
            Scanner sc1 = new Scanner(new File("src/m1.txt"));

            // Читання слів
            while (sc1.hasNext())
            {
                String s = sc1.next();
                s = s.replaceAll("[=><.,!?:;()\"“”„«»\\-]", "").toUpperCase();
                if(s.isEmpty()) continue;
                m.put(s, m.getOrDefault(s, 0) + 1);
            }
            sc1.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
            return;
        }

        // Виведення словника
        System.out.println("Слово\t\tКількість");

        Set<String> ks = m.keySet();
        Iterator<String> it = ks.iterator();

        for (String s : m.keySet())
        {
            System.out.printf("%-15s| %d\n", s, m.get(s));
        }
    }
}
