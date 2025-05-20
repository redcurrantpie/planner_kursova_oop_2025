public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(9.1);
        q.enqueue(2.0);
        q.enqueue(8.3);
        System.out.println("MyQueue:");
        System.out.println("  Peek: " + q.peek() +
                "\n  Size: " + q.getSize() +
                "\n  Dequeue: " + q.dequeue() +
                "\n  Size: " + q.getSize());


        MyStack s = new MyStack();
        s.push(6.3);
        s.push(1.5);
        s.push(3.33);
        System.out.println("\nMyStack:");
        System.out.println("  Peek: " + s.peek() +
                "\n  Size: " + s.getSize() +
                "\n  Pop: " + s.pop() +
                "\n  Size: " + s.getSize());
        s.clear();
        System.out.println("  Clear + Size: " + s.getSize());


        Container[] containers = new Container[2];
        containers[0] = new MyQueue2();
        containers[1] = new MyStack2();

        System.out.println("\nMyQueue2 & MyStack2:");
        for (int i = 0; i < containers.length; i++) {
            containers[i].put(i * 8);
            containers[i].put(i * 41);
            System.out.println("\nContainer " + i + ":" +
                    "\n  Peek: " + containers[i].peek() +
                    "\n  Size: " + containers[i].getSize() +
                    "\n  Get: " + containers[i].get() +
                    "\n  Size: " + containers[i].getSize());
        }
    }
}