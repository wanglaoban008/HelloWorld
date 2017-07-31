package org.mll.com;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 302294马丽丽
 * @description TODO(方法详细描述说明、方法参数的具体涵义)
 * @date 2017/7/28 17:53
 * @return
 * @see
 */
public class AtInterfaceTest {
    public static void main(String[] args) {
        System.err.println("11");
    }
}

class Student{
    void say(){
        System.err.println("我是一名学生");
    }
}

class Person{
    @Autowired
    void aa(){
        System.err.println();
    }
}