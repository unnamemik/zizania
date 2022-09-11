package zizania;

import static zizania.Fram.*;
import static zizania.Vars.*;

public class LptOut3 extends Thread {
    
    @Override
  public void run () {
        while (flagauto==1)
            {if (flagwait==1){
                 {jTextField3.setText("●"); out(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} 
                 {jTextField3.setText(""); reset(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} }}}
        else {jTextField3.setText("●"); out();}}
    }
}