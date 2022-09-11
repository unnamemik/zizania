package zizania;

import static zizania.Fram.*;
import static zizania.Vars.*;

public class LptOut7 extends Thread {
    
    @Override
   public void run () {
        while (flagauto==1)
            {if (flagwait==1){
                 {jTextField7.setText("●"); out(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} 
                 {jTextField7.setText(""); reset(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} }}}
        else {jTextField7.setText("●"); out();}}
    }
}