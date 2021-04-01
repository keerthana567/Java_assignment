import java.util.*;
class CoffeMachine extends Thread
{
static String coffeMade = null;
static final Object lock = new Object();
private static int coffeNumbner = 0;
       public void run(){
while(true){
makeCoffe();
try {
Thread.sleep(10000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
void makeCoffe(){
synchronized (CoffeMachine.lock) {
if(coffeMade!=null){
try {
CoffeMachine.lock.wait();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
coffeMade="CoffeNumber:"+coffeNumbner++;
System.out.println("CoffeMachine : Hey waiter !!! coffee is ready\n"+ coffeMade);
CoffeMachine.lock.notifyAll();
System.out.println("CoffeMachine:notifying waiter to pick the coffee");


}
}
}
class Waiter extends Thread{
public void run(){
while(true){
getCoffee();
}
}
void getCoffee(){
synchronized (CoffeMachine.lock) {
if(CoffeMachine.coffeMade==null){
System.out.println("Waiter:waiting for coffee machine to prepare coffee");
try {
CoffeMachine.lock.wait();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
System.out.println("Waiter: Ready to Deliver Coffee");
CoffeMachine.coffeMade=null;
System.out.println("Waiter: Coffee Delivered!!");
CoffeMachine.lock.notifyAll();
System.out.println("Waiter: Hey CoffeeMachine!!!! Please prepare cofeee!!!!!");
}
}
}
public class Program8 
{
public static void main(String arg[]){
CoffeMachine cm=new CoffeMachine();
Waiter w=new Waiter();
cm.start();
w.start();
}
}
