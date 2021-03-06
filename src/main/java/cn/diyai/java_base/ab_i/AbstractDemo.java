package cn.diyai.java_base.ab_i;

/**
 * Created by diyai on 2018/5/31.
 */
public class AbstractDemo {

    public static void main(String[] args){
        Salary s = new Salary("salary1","salary_address");
        System.out.println(s.toString());
        s.travel();
        s.run();

        Employee e = new Salary("salary1","salary_address");
        System.out.println(e.toString());
        e.travel();
        e.run();

        System.out.println(e == s);
        System.out.println(e.equals(s));

        Employee e2 = new Salary();
        e2.travel();
        e2.run();
    }
}
