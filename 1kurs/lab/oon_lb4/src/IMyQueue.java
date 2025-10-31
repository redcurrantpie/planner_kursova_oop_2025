interface IMyQueue
{
    void enqueue(double val); //додати елемент в кінець черги
    double dequeue(); //забрати елемент з початку черги
    double peek(); //подивитись на початок черги (не забирати)
    int getSize();  //кількість елементів в черзі
    void clear();   //очистити чергу
}
