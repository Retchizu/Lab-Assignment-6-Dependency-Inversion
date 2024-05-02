package dependencyinversion;

public class Student {
    
    void borrowResource(Resource resource){
        resource.borrow();
    }

}
