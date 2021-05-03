package $14_Abstraction;


public abstract class BMW {         //  we can create a main method inside a abstract class
    void commonFunc(){                // we cannot create a instance of a abstract class
        System.out.println("inside common functionality method");
    }
    
    abstract void accelarate();
    
}
