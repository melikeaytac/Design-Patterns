 abstract class ResourceDecorator extends Server {

     @Override
     public double getCost() {
         return 0;
     }

     public abstract String getDescription();
 }
