package com.lxd.inner;

/**
 * <Description> <br>
 *
 * @author lixiaodong11<br>
 * @since 2021/01/26
 */
public class InnerTest {
    public static void main(String[] args) {
        Outter outter = new Outter();
        outter.getA();

        System.out.println("inner a1 :"+outter.out_a1);
        System.out.println("inner a2 :"+Outter.out_sta_a2);

        Outter.Inner inner = outter.new Inner();
        inner.getA();
        System.out.println("inner a3 :"+inner.inner_a3);

        Outter.InnerStatic innerStatic = new Outter.InnerStatic();
        innerStatic.getA();
        System.out.println("innerStatic a4 :"+innerStatic.innerStatic_a4);
        System.out.println("innerStatic a5 :"+ Outter.InnerStatic.innerStatic_static_a5);


    }



}
