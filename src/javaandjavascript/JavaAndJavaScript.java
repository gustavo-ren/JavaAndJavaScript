package javaandjavascript;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Gustavo
 */
public class JavaAndJavaScript {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws javax.script.ScriptException
     * @throws java.lang.NoSuchMethodException
     */
    public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        
        engine.eval(new FileReader("C:\\Users\\Gustavo\\Documents\\NetBeansProjects\\JavaAndJavaScript\\src\\javaandjavascript\\script.js"));

        Invocable invocable = (Invocable) engine;

        Object result = invocable.invokeFunction("sum", 5);
        System.out.println(result);
        System.out.println(result.getClass());
    }

}
