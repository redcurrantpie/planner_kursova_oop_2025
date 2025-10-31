public class Main 
{
    public static void main(String[] args) 
    {
        // Створення з помилковим параметром
        try
        {
            MySimpleContainer<Object> mc = new MySimpleContainer<>(2);
        }
        catch (MyWrongParamException ex)
        {
            System.out.println(ex.getMessage());
        }

        // Тестування з Integer
        try 
        {
            MySimpleContainer<Integer> intCont = new MySimpleContainer<>(4);

            for (int i=0; i<4; i++)
            {
                intCont.addToEnd(i*8);// Перевірка  addToEndToEnd
            }
            System.out.println("\nInteger: " + intCont);

            int oldVal = intCont.replaceEl(1, 25);
            System.out.println("Старе значення: " + oldVal);
            System.out.println("Після replaceEl: " + intCont);

            // Вилучення останнього
            int removed = intCont.remove();
            System.out.println("Вилучено: " + removed);
            System.out.println("Після remove: " + intCont);

            // Спроба додати понад межу
            intCont.addToEnd(40);
            intCont.addToEnd(50); 
        } 
        catch (Exception ex) 
        {
            System.out.println("Integer Exception: " + ex.getMessage());
        }

        // Тестування з String
        try 
        {
            MySimpleContainer<String>  stringCont= new MySimpleContainer<>(3);
            stringCont.addToEnd("string");
            stringCont.addToEnd("cont");
            System.out.println("\nString container: " + stringCont);

            // Спроба отримати за недопустимим індексом
            System.out.println(stringCont.getEl(9)); 
        } 
        catch (Exception ex) 
        {
            System.out.println("String Exception: " + ex.getMessage());
        }

        // Тестування з Double
        try 
        {
            MySimpleContainer<Double> doubleCont = new MySimpleContainer<>(9);
            doubleCont.addToEnd(8.88);
            System.out.println("\nDouble container: " + doubleCont);
            doubleCont.remove();
            System.out.println("Після видалення: " + doubleCont);
            doubleCont.remove();
        }
        catch (Exception ex)
        {
            System.out.println("Double Exception: " + ex.getMessage());
        }
    }
}
