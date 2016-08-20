import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class test {
    public static void main(String [ ] args){


        String inp="0.5*e^y+x";
        //Enter a function you like

        long startTime = System.currentTimeMillis();
        ThreeDimensionalGraphing tdg=new ThreeDimensionalGraphing(inp);
        long endTime   = System.currentTimeMillis();

        String[] ss= tdg.getPostfixOperations();
        String sss="";
        for(int i=0;i<ss.length;i++){
            sss=sss+"  "+ss[i];
        }
        System.out.println( );
        System.out.println("INPUT  :  "+inp);
        System.out.println("INSTFIX:  "+tdg.getInfixOperations());
        System.out.println("POSTFIX:"+sss);



        System.out.println("RESULTS:\n"+tdg.toString());

        System.out.println("Generating z values takes "+(endTime - startTime)+"ms");

    }


}