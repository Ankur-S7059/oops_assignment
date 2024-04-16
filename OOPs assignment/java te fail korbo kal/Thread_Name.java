class Thread_Name extends Thread{  
    public void run(){  
     System.out.println("running...");  
    }  
   public static void main(String args[]){  
    Thread_Name t1=new Thread_Name();  
    Thread_Name t2=new Thread_Name();  
    System.out.println("Name of t1:"+t1.getName());  
    System.out.println("Name of t2:"+t2.getName());  
     
    t1.start();  
    t2.start();  
    
    t1.setName(" Ankur Saha");  
    System.out.println("After changing name of t1:"+t1.getName());  
   }  
  }  