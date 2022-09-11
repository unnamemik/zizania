package zizania;

public class TM {
    
static LptOut1 lptout1 = new LptOut1();
static LptOut2 lptout2 = new LptOut2();
static LptOut3 lptout3 = new LptOut3();
static LptOut4 lptout4 = new LptOut4();
static LptOut5 lptout5 = new LptOut5();
static LptOut6 lptout6 = new LptOut6();
static LptOut7 lptout7 = new LptOut7();
static LptOut8 lptout8 = new LptOut8();
static LptOut9 lptout9 = new LptOut9();
static LptOut10 lptout10 = new LptOut10();
static LptOut11 lptout11 = new LptOut11();

    public static void lptRun1 (){
        if (lptout1.isAlive()) { lptout1.run();}
        else {lptout1 = new LptOut1(); lptout1.start();}
    }
  
    public static void lptRun2 (){
        if (lptout2.isAlive()) { lptout2.run();}
        else {lptout2 = new LptOut2(); lptout2.start();}
    }
    
    public static void lptRun3 (){
        if (lptout3.isAlive()) { lptout3.run();}
        else {lptout3 = new LptOut3(); lptout3.start();}
    }
   
    public static void lptRun4 (){
        if (lptout4.isAlive()) { lptout4.run();}
        else {lptout4 = new LptOut4(); lptout4.start();}
    }
    
    public static void lptRun5 (){
        if (lptout5.isAlive()) { lptout5.run();}
        else {lptout5 = new LptOut5(); lptout5.start();}
    }
     
    public static void lptRun6 (){
        if (lptout6.isAlive()) { lptout6.run();}
        else {lptout6 = new LptOut6(); lptout6.start();}
    }
    
    public static void lptRun7 (){
        if (lptout7.isAlive()) { lptout7.run();}
        else {lptout7= new LptOut7(); lptout7.start();}
    }
    
    public static void lptRun8 (){
        if (lptout8.isAlive()) { lptout8.run();}
        else {lptout8 = new LptOut8(); lptout8.start();}
    }
    
     public static void lptRun9 (){
        if (lptout9.isAlive()) { lptout9.run();}
        else {lptout9 = new LptOut9(); lptout9.start();}
    }
     
    public static void lptRun10 (){
        if (lptout10.isAlive()) { lptout10.run();}
        else {lptout10 = new LptOut10(); lptout10.start();}
    }
    
    public static void lptRun11 (){
        if (lptout11.isAlive()) { lptout11.run();}
        else {lptout11 = new LptOut11(); lptout11.start();}
    }
}
