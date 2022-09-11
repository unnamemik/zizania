package zizania;

import static zizania.Fram.*;
import static zizania.Vars.*;

public class LptOut4 extends Thread {
    
    @Override
  public void run () {
        while (flagauto==1)
            {if (flagwait==1){
                 {jTextField4.setText("●"); out(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} 
                 {jTextField4.setText(""); reset(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} }}}
        else {jTextField4.setText("●"); out();}}
    }
}