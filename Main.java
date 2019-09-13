
public class Main {
    public static void main(String[] args){
       int n = 8;
       for(int i =0 ;i<8;i++){
           SingletonChocolateBoiler obj;
           Thread object = new Thread(obj = SingletonChocolateBoiler.getInstance());
           object.start();
           obj.mens(i);
       }
    }
}
