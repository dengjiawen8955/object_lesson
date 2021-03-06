package com.dengjiawen.design01;

/**
 * @Author Jarvan
 * @create 2020/9/14 10:55
 * this is a counter
 */
public class Counter {
    public static int staticCounter;
    public  int counter;

    public Counter() {
        //init field
        counter = 0;
        //static field ++
        staticCounter ++;
    }
    /**
     * because of java have not destructor,so there we imitate a destructor
     * this destructor will minus one
     */
    public   void destructor(){
        //static field --
        staticCounter --;
    }

    public static int getStaticCounter() {
        return staticCounter;
    }

    public int getCounter() {
        return counter;
    }
}
