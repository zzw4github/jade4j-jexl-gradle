package me.zzw.gradle.jexl;


import org.apache.commons.jexl3.*;

/**
 * Created by infosea on 2016/1/29.
 */
public class App {
    public static void main(String[] args ){
        // Create or retrieve an engine
        JexlEngine jexl = new JexlBuilder().create();

        // Create an expression
        String jexlExp = "foo.innerFoo.bar()";
//        String jexlExp = "foo.bar()";
        JexlExpression e = jexl.createExpression( jexlExp );

        // Create a context and add data
        JexlContext jc = new MapContext();
        jc.set("foo", new Foo() );

        // Now evaluate the expression, getting the result
        Object o = e.evaluate(jc);
        System.out.println((String)o);
    }
}
