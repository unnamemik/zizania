package zizania;

import static zizania.Fram.*;
import static zizania.Vars.*;

public class LptOut5 extends Thread {
    
    @Override
    public void run () {
        while (flagauto==1)
            {if (flagwait==1){
                 {jTextField5.setText("●"); out(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} 
                 {jTextField5.setText(""); reset(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} }}}
        else {jTextField5.setText("●"); out();}}
    }
}