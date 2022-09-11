package zizania;

import static zizania.Fram.*;
import static zizania.Vars.*;

public class LptOut6 extends Thread {
    
    @Override
    public void run () {
        while (flagauto==1)
            {if (flagwait==1){
                 {jTextField6.setText("●"); out(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} 
                 {jTextField6.setText(""); reset(); try {Thread.sleep(wait);} catch (InterruptedException ex) {} }}}
        else {jTextField6.setText("●"); out();}}
    }
}