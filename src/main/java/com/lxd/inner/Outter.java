package com.lxd.inner;

/**
 * <Description> <br>
 *
 * @author lixiaodong11<br>
 * @since 2021/01/26
 */
public class Outter {

    public int out_a1 = 10;

    public static int out_sta_a2 = 20;

    public void getA(){
        System.out.println("outter a1 :"+out_a1);
        System.out.println("outter a2 :"+out_sta_a2);
        System.out.println("outter a3 :"+new Outter().new Inner().inner_a3);
        System.out.println("outter a4 :"+ new InnerStatic().innerStatic_a4);
        System.out.println("outter a5 :"+ InnerStatic.innerStatic_static_a5);
    }



    public class Inner{
        public int inner_a3 = 30;
        public void getA(){
            System.out.println("inner a1:"+Outter.this.out_a1);
            System.out.println("inner a2:"+Outter.out_sta_a2);
            System.out.println("inner a3:"+this.inner_a3);
        }
    }

    public static class InnerStatic{
        public int innerStatic_a4 = 40;
        public static int innerStatic_static_a5 = 50;
        public void getA(){
            //静态内部类无法获取外部类的非静态成员变量
            // System.out.println("inner a1:"+Outter.this.out_a1);
            System.out.println("inner a2:"+Outter.out_sta_a2);
            System.out.println("inner a4:"+this.innerStatic_a4);
            System.out.println("inner a5:"+InnerStatic.innerStatic_static_a5);
        }

    }




}
