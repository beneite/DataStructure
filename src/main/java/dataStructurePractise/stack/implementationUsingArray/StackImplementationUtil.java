/**
 * this class contains the user defined methods for stack using Arrays
 * 1. peek
 * 2. pop
 * 3. push
 * 4. isEmpty
 */
package dataStructurePractise.stack.implementationUsingArray;

public class StackImplementationUtil {

    public int[] stack;
    public final int stackSize;
    public int top;

    StackImplementationUtil(int size){
        stackSize = size;
        stack = new int[size];
        top = -1;
    }

    public Integer peek(){

        if(top == -1){
            return -1;
        }

        return stack[top];
    }

    public void push(int element){

        if(top >= stackSize-1){
            throw new RuntimeException();
        }

        stack[top+1] = element;
        top +=1;
    }

    public Boolean isEmpty(){
        if(top == -1){
            return Boolean.TRUE;
        }else {
            return Boolean.FALSE;
        }
    }

    public void printStack(){
        for (int i=0; i<stackSize; i++){
            System.out.println(stack[i]);
        }
    }

    public int pop(){
        if(top == -1){
            throw new RuntimeException();
        }

        int ele = stack[top];
        stack[top] = 0;
        top--;
        return ele;
    }

}
