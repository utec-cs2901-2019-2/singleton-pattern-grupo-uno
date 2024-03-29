# Singleton Design Pattern
> The singleton is the simplest in terms of its class diagram; in fact, the diagram holds just a single class!

```java
public class Singleton {
  private static Singleton instance;
  // other useful instance variables here
  
  private Singleton() {
  }
  
  public static Singleton getInstance() {
    if (instance == null){
      instance = new Singleton(); 
    }
    return instance;
  }
  
  // other useful methods here
}
```

## Code Up Close

- instance holds our ONE instance, remember, it is a static variable
- if instance is null, then we haven't created the instance yet...
- and if it doesn't exist, we instantiate Singleton throught its private constructor and assign it to unique instance, it never gets created; this is lazy instatiation.
- if instance wasn't null, then it was previously created. We just fall trough to the return statement.

```java
    if (instance == null){
      instance = new Singleton(); 
    }
    return instance;
```
### What happens if more than one instance is created?
 - Second instance might try to reboil milk, or waste electricity wating for milk , or burn because all of the milk has gone to another boiler. Furthermore, 2 boilers might pick up the same milk object and make 2 bars, when we did't actually have the milk for them!
