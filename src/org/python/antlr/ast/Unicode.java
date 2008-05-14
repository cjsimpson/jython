// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Unicode extends exprType {
    public String s;

    public static final String[] _fields = new String[] {"s"};

    public Unicode(PythonTree tree, String s) {
        super(tree);
        this.s = s;
    }

    public String toString() {
        return "Unicode";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitUnicode(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

    public int getLineno() {
        return getLine();
    }

    public int getCol_offset() {
        return getCharPositionInLine();
    }

}