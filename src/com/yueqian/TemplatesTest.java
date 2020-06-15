package com.yueqian;

import com.yueqian.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author chenjinze
 * @date 2020/6/15 0015 - 22:51
 * <p>
 * IDEA中代码末班所处的位置：settings-editor-Live Templaties /Postfix Completion
 */
public class TemplatesTest {
    //模版1：psvm
    public static void main(String[] args) {
        //模版
        System.out.println("helloworld");
        //变形：soutp打印形参/soutm打印方法名/soutv打印变量/xxx.sout打印变量
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);
        int i = 10;
        System.out.println("i = " + i);
        System.out.println("i = " + i);
        int j = 20;
        System.out.println("j = " + j);

        //模版3 fori
        String[] arr = new String[]{"TOM", "Jerry", "xiaoming"};
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int k = 0; k < arr.length; k++) {
            String s = arr[k];
            System.out.println("s = " + s);
        }
        //模版四:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(4456);
        list.add(46);
        for (Object o : list) {

        }

        //变形：list.fori
        for (int i1 = 0; i1 < list.size(); i1++) {

        }
        //变形：list.forr倒序遍历
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {
        }


    }

    public void method() {
        System.out.println("TemplatesTest.method");

        //模版5：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(4456);
        list.add(46);
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }

        //变形:xxx.nn /xxx.null
        if (list == null) {

        }
        if (list != null) {

        }
    }

    //模版6：prsf
    private static final Customer cust = new Customer();
    //变形：psf
    public static final int NUM=1;
    //变形：psfi
    public static final int NUM2=2;
    //变形：psfs
    public static final String s=null;
}
