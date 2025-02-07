 class BasicGPU extends ResourceDecorator{
    Server server;
    public BasicGPU(Server server) {
        this.server = server;
    }

    @Override
    public double getCost() {
        return server.getCost()+ 0.006867;
    }

     @Override
     public String getDescription() {
         return server.getDescription()+"Basic GPU";
     }
 }
 class HighEndGPU extends ResourceDecorator{
     Server server;

     public HighEndGPU(Server server) {
         this.server=server;
     }

     @Override
     public double getCost() {
         return server.getCost()+0.022890;
     }

     @Override
     public String getDescription() {
         return server.getDescription()+"HighEnd GPU";
     }
 }
 class HighMemory extends ResourceDecorator{
     Server server;

     public HighMemory(Server server) {
        this.server=server;
     }

     @Override
     public double getCost() {
         return  server.getCost()+0.003067;
     }

     @Override
     public String getDescription() {
         return server.getDescription()+"High Memory";
     }
 }
 class LowMemory extends ResourceDecorator{

     Server server;

     public LowMemory(Server server) {
        this.server=server;
     }

     @Override
     public double getCost() {
         return server.getCost()+ 0.000920;
     }

     @Override
     public String getDescription() {
         return server.getDescription()+" Low Memory";
     }
 }