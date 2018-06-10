package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by ospen on 9/13/2017.
 */
public final class Variables {
    static HashMap<String, String> variables = new HashMap<>();
    static HashMap<String, String> funcToFunc = new HashMap<>();
    static HashMap<String, String> typeToTemplate = new HashMap<>();

    static {
        funcToFunc.put("write", "printf");
        funcToFunc.put("writeln", "printf");
        funcToFunc.put("read", "scanf");
        funcToFunc.put("readln", "scanf");
        typeToTemplate.put("int", "%d");
        typeToTemplate.put("double", "%f");
        typeToTemplate.put("char", "%c");

    }

    static public void putVar(String type, String ident) {
        variables.put(ident, type);
    }

    static public void putVar(String type, String[] idents) {
        for (String ident : idents) {
            variables.put(ident, type);
        }
    }

    static public String getFunc(String func, String[] args) {
        StringBuilder ans = new StringBuilder("");
        ans.append(funcToFunc.get(func.toLowerCase()));
        ans.append("(\"");
        for (String arg : args) {
            ans.append(typeToTemplate.get(variables.get(arg)));
        }
        if (func.endsWith("ln")) {
            ans.append("\\n");
        }
        ans.append("\"");
        for (String arg : args) {
            ans.append(", ").append(arg);
        }
        ans.append(");");

        return ans.toString();
    }

    static public String getFunc(String func, String arg) {
        StringBuilder ans = new StringBuilder();
        ans.append(funcToFunc.get(func));
        if (arg.equals("")) {
            ans.append("();");
        } else {
            ans.append("(\"");
            ans.append(typeToTemplate.get(variables.get(arg)));
            if (func.endsWith("ln")) {
                ans.append("\n");
            }
            ans.append("\"");

            ans.append(");");
        }
        return ans.toString();
    }


}
