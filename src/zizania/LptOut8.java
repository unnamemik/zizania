package zizania;

import static zizania.Fram.*;
import static zizania.Vars.*;

public class LptOut8 extends Thread {
    
    @Override
   public void run () {
        while (flagauto==1)
            {if (flagwait==1){
                 {jTextField8.setText("●"); out(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} 
                 {jTextField8.setText(""); reset(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} }}}
        else {jTextField8.setText("●"); out();}}
    }
}