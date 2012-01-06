
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Fri Jan 06 23:50:07 CET 2012
//----------------------------------------------------

package com.dubture.twig.core.parser.ast;

import java.util.LinkedList;
import java.util.List;
import com.dubture.twig.core.parser.ast.node.TwigCallExpression;
import com.dubture.twig.core.parser.ast.node.TwigModuleDeclaration;
import com.dubture.twig.core.parser.ast.node.BlockStatement;
import com.dubture.twig.core.parser.ast.node.Variable;
import com.dubture.twig.core.parser.ast.node.PrintStatement;
import com.dubture.twig.core.parser.ast.node.StringLiteral;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

/** CUP v0.10k generated parser.
  * @version Fri Jan 06 23:50:07 CET 2012
  */
public class TwigAstParser extends AbstractAstParser {

  /** Default constructor. */
  public TwigAstParser() {super();}

  /** Constructor which sets the default scanner. */
  public TwigAstParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\020\000\002\003\003\000\002\002\004\000\002\006" +
    "\004\000\002\006\002\000\002\007\003\000\002\007\003" +
    "\000\002\007\003\000\002\005\005\000\002\004\006\000" +
    "\002\010\004\000\002\010\002\000\002\011\003\000\002" +
    "\011\003\000\002\013\006\000\002\012\003\000\002\012" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\030\000\014\002\ufffe\004\ufffe\006\ufffe\012\ufffe\013" +
    "\ufffe\001\002\000\004\002\032\001\002\000\014\002\001" +
    "\004\011\006\006\012\010\013\014\001\002\000\004\014" +
    "\027\001\002\000\014\002\ufffc\004\ufffc\006\ufffc\012\ufffc" +
    "\013\ufffc\001\002\000\014\002\ufff3\004\ufff3\006\ufff3\012" +
    "\ufff3\013\ufff3\001\002\000\010\005\ufff7\012\ufff7\013\ufff7" +
    "\001\002\000\014\002\ufffd\004\ufffd\006\ufffd\012\ufffd\013" +
    "\ufffd\001\002\000\014\002\ufffb\004\ufffb\006\ufffb\012\ufffb" +
    "\013\ufffb\001\002\000\022\002\ufff2\004\ufff2\005\ufff2\006" +
    "\ufff2\007\ufff2\011\ufff2\012\ufff2\013\ufff2\001\002\000\014" +
    "\002\uffff\004\uffff\006\uffff\012\uffff\013\uffff\001\002\000" +
    "\010\005\021\012\022\013\014\001\002\000\014\005\ufff8" +
    "\007\ufff8\011\ufff8\012\ufff8\013\ufff8\001\002\000\014\005" +
    "\ufff5\007\ufff5\011\ufff5\012\ufff5\013\ufff5\001\002\000\014" +
    "\002\ufffa\004\ufffa\006\ufffa\012\ufffa\013\ufffa\001\002\000" +
    "\016\005\ufff3\007\ufff3\010\024\011\ufff3\012\ufff3\013\ufff3" +
    "\001\002\000\014\005\ufff6\007\ufff6\011\ufff6\012\ufff6\013" +
    "\ufff6\001\002\000\010\011\ufff7\012\ufff7\013\ufff7\001\002" +
    "\000\010\011\026\012\022\013\014\001\002\000\014\005" +
    "\ufff4\007\ufff4\011\ufff4\012\ufff4\013\ufff4\001\002\000\010" +
    "\007\ufff7\012\ufff7\013\ufff7\001\002\000\010\007\031\012" +
    "\022\013\014\001\002\000\014\002\ufff9\004\ufff9\006\ufff9" +
    "\012\ufff9\013\ufff9\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\030\000\006\003\003\006\004\001\001\000\002\001" +
    "\001\000\012\004\012\005\006\007\014\012\011\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\010\015\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\011\016\012" +
    "\022\013\017\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\010\024\001\001\000\010\011\016\012\022\013\017" +
    "\001\001\000\002\001\001\000\004\010\027\001\001\000" +
    "\010\011\016\012\022\013\017\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$TwigAstParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$TwigAstParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$TwigAstParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
    /* Change the method report_error so it will display the line and
       column of where the error occurred in the input as well as the
       reason for the error which is passed into the method in the
       String 'message'. */
    public void report_error(String message, Object info) {
   
        /* Create a StringBuffer called 'm' with the string 'Error' in it. */
        StringBuffer m = new StringBuffer("Error");
   
        /* Check if the information passed to the method is the same
           type as the type java_cup.runtime.Symbol. */
        if (info instanceof java_cup.runtime.Symbol) {
            /* Declare a java_cup.runtime.Symbol object 's' with the
               information in the object info that is being typecasted
               as a java_cup.runtime.Symbol object. */
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
   
            /* Check if the line number in the input is greater or
               equal to zero. */
            if (s.left >= 0) {                
                /* Add to the end of the StringBuffer error message
                   the line number of the error in the input. */
                m.append(" in line "+(s.left+1));   
                /* Check if the column number in the input is greater
                   or equal to zero. */
                if (s.right >= 0)                    
                    /* Add to the end of the StringBuffer error message
                       the column number of the error in the input. */
                    m.append(", column "+(s.right+1));
            }
        }
   
        /* Add to the end of the StringBuffer error message created in
           this method the message that was passed into this method. */
        m.append(" : "+message);
   
        /* Print the contents of the StringBuffer 'm', which contains
           an error message, out on a line. */
        System.err.println(m + " tralala");
    }
   
    /* Change the method report_fatal_error so when it reports a fatal
       error it will display the line and column number of where the
       fatal error occurred in the input as well as the reason for the
       fatal error which is passed into the method in the object
       'message' and then exit.*/
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
       
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$TwigAstParser$actions {
  private final TwigAstParser parser;

  /** Constructor */
  CUP$TwigAstParser$actions(TwigAstParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$TwigAstParser$do_action(
    int                        CUP$TwigAstParser$act_num,
    java_cup.runtime.lr_parser CUP$TwigAstParser$parser,
    java.util.Stack            CUP$TwigAstParser$stack,
    int                        CUP$TwigAstParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$TwigAstParser$result;

      /* select the action based on the action number */
      switch (CUP$TwigAstParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // statement ::= T_CONSTANT_ENCAPSED_STRING 
            {
              Statement RESULT = null;
		int stringleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left;
		int stringright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right;
		String string = (String)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).value;
		
					    	RESULT = new StringLiteral(stringleft, stringright, string);
					    
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(8/*statement*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // statement ::= T_VARIABLE 
            {
              Statement RESULT = null;
		int stmtleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left;
		int stmtright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right;
		String stmt = (String)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).value;
		 
					        RESULT = new Variable(stmtleft, stmtright, stmt); 
					    
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(8/*statement*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // function ::= T_VARIABLE T_OPEN_PARENTHESE inner_statement_list T_CLOSE_PARENTHESE 
            {
              TwigCallExpression RESULT = null;
		int idleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-3)).value;
		int openleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).left;
		int openright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).right;
		Object open = (Object)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).value;
		int stmtleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).left;
		int stmtright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).right;
		List stmt = (List)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).value;
		int closeleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left;
		int closeright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right;
		Object close = (Object)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).value;
		
    						RESULT = new TwigCallExpression(openleft, closeright, id, stmt);
    					
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(9/*function*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // inner_statement ::= function 
            {
              Statement RESULT = null;
		int functionleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left;
		int functionright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right;
		TwigCallExpression function = (TwigCallExpression)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).value;
		
					    	RESULT = function;
					    
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(7/*inner_statement*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // inner_statement ::= statement 
            {
              Statement RESULT = null;
		int statementleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left;
		int statementright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right;
		Statement statement = (Statement)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).value;
		 
					        RESULT = statement; 
					    
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(7/*inner_statement*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // inner_statement_list ::= 
            {
              List RESULT = null;
		 
					        RESULT = new LinkedList(); 
					    
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(6/*inner_statement_list*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // inner_statement_list ::= inner_statement_list inner_statement 
            {
              List RESULT = null;
		int statementListleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).left;
		int statementListright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).right;
		List statementList = (List)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).value;
		int statementleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left;
		int statementright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right;
		Statement statement = (Statement)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).value;
		
							// Ignore null statements
							if(statement != null) {
							    statementList.add(statement);
							}
							RESULT = statementList;
					    
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(6/*inner_statement_list*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // block ::= TWIG_STMT_OPEN T_BLOCK_NAME inner_statement_list TWIG_STMT_CLOSE 
            {
              BlockStatement RESULT = null;
		int startleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-3)).left;
		int startright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-3)).right;
		Object start = (Object)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-3)).value;
		int nameleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).value;
		int innerleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).left;
		int innerright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).right;
		List inner = (List)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left;
		int endright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).value;
		
		                	BlockStatement stmt = new BlockStatement(startleft, endright, name, inner);
		                    RESULT = stmt;
		                
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(2/*block*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // var ::= TWIG_VAR_OPEN inner_statement_list TWIG_VAR_CLOSE 
            {
              PrintStatement RESULT = null;
		int startleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).left;
		int startright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).right;
		Object start = (Object)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).value;
		int innerleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).left;
		int innerright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).right;
		List inner = (List)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left;
		int endright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).value;
		
							PrintStatement stmt = new PrintStatement(startleft, endright, inner);
							RESULT = stmt;
						
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(3/*var*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // top_statement ::= block 
            {
              Statement RESULT = null;
		int bleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right;
		BlockStatement b = (BlockStatement)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).value;
		
							RESULT = b; 
						
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(5/*top_statement*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // top_statement ::= var 
            {
              Statement RESULT = null;
		int vleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right;
		PrintStatement v = (PrintStatement)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).value;
		
							RESULT = v; 
						
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(5/*top_statement*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // top_statement ::= statement 
            {
              Statement RESULT = null;
		int statementleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left;
		int statementright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right;
		Statement statement = (Statement)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).value;
		
							RESULT = statement;
						
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(5/*top_statement*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // top_statement_list ::= 
            {
              List RESULT = null;
		 
							RESULT = new LinkedList();
						
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(4/*top_statement_list*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // top_statement_list ::= top_statement_list top_statement 
            {
              List RESULT = null;
		int sListleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).left;
		int sListright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).right;
		List sList = (List)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).value;
		int statementleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left;
		int statementright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right;
		Statement statement = (Statement)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).value;
		
							if(statement != null) {
								sList.add(statement);
							}
							RESULT = sList;
						
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(4/*top_statement_list*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= module EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).right;
		TwigModuleDeclaration start_val = (TwigModuleDeclaration)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).value;
		RESULT = start_val;
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$TwigAstParser$parser.done_parsing();
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // module ::= top_statement_list 
            {
              TwigModuleDeclaration RESULT = null;
		int sListleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left;
		int sListright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right;
		List sList = (List)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).value;
		                 
                    		TwigModuleDeclaration module = parser.getModuleDeclaration();
                    		module.setStatements(sList);
                    		System.err.println("create module...");
                    		RESULT = module;
                 		
              CUP$TwigAstParser$result = new java_cup.runtime.Symbol(1/*module*/, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-0)).right, RESULT);
            }
          return CUP$TwigAstParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
