public class Main
{
    public static void main(String[] args)
    {
        // Створення з помилковим параметром
        try
        {
            MySimpleContainer mc = new MySimpleContainer(4);
        }
        catch (MyWrongParamException ex)
        {
            System.out.println(ex.getMessage());
        }

        try
        {
            // Створення з правильним параметром
            MySimpleContainer mcN = new MySimpleContainer(6);

            for (int i=0; i<6; i++)
            {
                mcN.addToEnd(43);// Перевірка  addToEnd
            }
            System.out.println("Заповнений: " + mcN);
            mcN.addToEnd(43);
        }
        catch (MyWrongParamException ex)
        {
            System.out.println("Помилка: " + ex.getMessage());
        }
        catch (MyFullContainerException ex)
        {
            System.out.println("Помилка: " + ex.getMessage());
        }

        try// Перевірка removeEl
        {
            MySimpleContainer c = new MySimpleContainer(6);
            // Видалення
            for (int i=0; i<c.size(); i++)
            {
                c.removeEl();
            }
            System.out.println("Видалено все");
            c.removeEl();
        }
        catch (Exception ex)
        {
            System.out.println("Помилка: " + ex.getMessage());
        }

        try // Перевірка getEl
        {
            MySimpleContainer c = new MySimpleContainer(6);
            c.getEl(8);
        }
        catch (Exception ex)
        {
            System.out.println("Помилка: " + ex.getMessage());
        }

        try// Перевірка  replaceEl
        {
            MySimpleContainer c = new MySimpleContainer(6);
            c.replaceEl(6, 7);
        }
        catch (Exception ex)
        {
            System.out.println("Помилка: " + ex.getMessage());
        }
    }
}