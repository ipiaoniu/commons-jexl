/* Generated By:JJTree: Do not edit this line. ASTSubtractNode.java */

package org.apache.commons.jexl.parser;

public class ASTSubtractNode extends SimpleNode {
  public ASTSubtractNode(int id) {
    super(id);
  }

  public ASTSubtractNode(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}