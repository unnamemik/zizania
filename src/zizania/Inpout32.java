package zizania;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface Inpout32 extends Library {
    Inpout32 pp = (Inpout32) Native.loadLibrary("Inpout32", Inpout32.class);
    
    public void Out32(int Address, int data); 
}
