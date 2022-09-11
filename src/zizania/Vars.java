package zizania;

public class Vars {
    public static int wait=0;
    public static int repeat=0;
    public static int data=0;
    
    public static int tog1=0;
    public static int tog2=0;
    public static int tog3=0;
    public static int tog4=0;
    public static int tog5=0;
    public static int tog6=0;
    public static int tog7=0;
    public static int tog8=0;
    
    
    public static int flagauto=1;
    public static int flagrepeat;
    public static int flagwait;
    public static int flagenable=0;
    public static int flaghalfstep=0;
    public static int flagreverse=0;
    
    public static void reset() {
        Inpout32 port = Inpout32.pp;
        port.Out32(888, 0);
    }
    
    public static void out() {
        Inpout32 port = Inpout32.pp;
	port.Out32(888, data);
    }
}
