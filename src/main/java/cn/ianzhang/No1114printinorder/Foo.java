package cn.ianzhang.No1114printinorder;

/**
 * @Author: Ian
 * @Date: 2020/5/17 20:04
 * @Description:
 */
class Foo {
    private volatile int flag = 0;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        while (flag != 0) {

        }
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        flag = 1;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (flag != 1) {

        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        flag = 2;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (flag != 2) {

        }
        flag = 0;
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}