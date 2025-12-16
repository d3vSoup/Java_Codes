package Java;
class BMS extends Thread{
    public void run(){
        try{
            while(true){
        System.out.println("BMS "); Thread.sleep(10000);
        }}
        catch(InterruptedException e){
            System.out.println(e);}
    }
}

class CS extends Thread{
    public void run(){
        try{
            while(true){
        System.out.println("CS "); Thread.sleep(2000);
        }}
        catch(InterruptedException e){
            System.out.println(e);}
    }
}

class Thr{
    public static void main(String args[]){
        BMS b=new BMS();
        CS c=new CS();
        b.start();
        c.start();
    }
}

