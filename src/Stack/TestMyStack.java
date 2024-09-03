package Stack;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        myStack.push("A");
        myStack.push("B");
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
    }
}
