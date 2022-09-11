package zizania;

import static zizania.Fram.*;
import static zizania.Vars.*;

public class LptOut2 extends Thread {
    
    @Override
  public void run () {
        while (flagauto==1)
            {if (flagwait==1){
                 {jTextField2.setText("●"); out(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} 
                 {jTextField2.setText(""); reset(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} }}}
        else {jTextField2.setText("●"); out();}}
    }
}