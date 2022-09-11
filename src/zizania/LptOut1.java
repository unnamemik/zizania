package zizania;

import static zizania.Fram.*;
import static zizania.Vars.*;

class LptOut1 extends Thread {
    
    @Override
  public void run () {
        while (flagauto==1)
            {if (flagwait==1){
                 {jTextField1.setText("●"); out(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} 
                 {jTextField1.setText(""); data-=4; out(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} data+=4; }}}
        else {jTextField1.setText("●"); out();}}
    }
}