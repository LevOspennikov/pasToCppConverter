import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import gen.*;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.*;


/**
 * Created by ospen on 9/13/2017.
 */
public class Main {

    public static void main(String[] args) {
        String fileName = args[0];
        CharStream input;
        try {
            input = CharStreams.fromFileName(fileName);
        } catch (IOException err) {
            err.printStackTrace();
            return;
        }
        PasGrammarLexer pasLexer = new PasGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(pasLexer);
        PasGrammarParser pasParser = new PasGrammarParser(tokens);
        PasGrammarParser.ProgramContext program = pasParser.program();
        String code = program.text;

        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.c"), "UTF-8"))) {
            writer.write(code);
        }catch (Exception err) {
            err.printStackTrace();
        }


    }
}
