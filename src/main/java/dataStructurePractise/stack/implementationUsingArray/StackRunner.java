package dataStructurePractise.stack.implementationUsingArray;

import org.testng.annotations.Test;

public class StackRunner {

    public StackImplementationUtil stackImplementationUtil;

    @Test
    public void testme(){
        stackImplementationUtil =  new StackImplementationUtil(10);
        System.out.println("Peek without adding any element:"+stackImplementationUtil.peek());
        System.out.println("Check if the stack is empty:"+stackImplementationUtil.isEmpty());
        stackImplementationUtil.push(1);
        System.out.println("Peek after adding an element:"+stackImplementationUtil.peek());
        stackImplementationUtil.push(2);
        stackImplementationUtil.push(3);
        stackImplementationUtil.push(4);
        stackImplementationUtil.push(5);
        System.out.println("Peek after adding all elements:"+stackImplementationUtil.peek());
        System.out.println("Peek poped:"+stackImplementationUtil.pop());
        System.out.println("Peek after deleting all elements:"+stackImplementationUtil.peek());
        System.out.println("Check if the stack is empty:"+stackImplementationUtil.isEmpty());
    }
}
