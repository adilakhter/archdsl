package Chat;
      
import edu.uci.isr.myx.fw.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public abstract class Client_AutoGenerated extends  AbstractMyxSimpleBrick{ 
    //generated end-point MYX NAME
    public static final IMyxName INTERFACE_NAME_OUTGOING_out =  MyxUtils.createName("out");
    
    //generated end-point instances
    protected ArrayList<IMessageChannelClient> outOutgoingEndpointImplementations;
    
         
    public Client_AutoGenerated(){
        //(Auto-generated):  Default constructor
        this.outOutgoingEndpointImplementations = new ArrayList<IMessageChannelClient>(); 
        
        
    }
    
    public Client_AutoGenerated(Properties props){
        //TODO (Auto-generated):   constructor
    }
    
    @SuppressWarnings("unchecked")
    private <T>  void configureOutgoingEndpoint(IMyxName myxName, ArrayList<T> endpointImpls)
    {
        Object [] objs = MyxUtils.getRequiredServiceObjects(this, myxName);
        if ( objs != null)
        {   
            for ( Object obj : objs)
            {
                endpointImpls.add((T)obj);
            }
        }
    }
    //incoming end-points setup methods
    
    
    protected <T> void verifyIsNotNull(String interaceNameString, T interfaceImplementation)
    {
        if  ( interfaceImplementation  == null)
            throw new RuntimeException (interaceNameString + " is Null. Please assign your implementation by overriding configureIncomingEndpoint method." ); 
    }
     
    @Override
    public void begin(){
        //TODO (Auto-generated):  Add initialization codes
        configureOutgoingEndpoint(INTERFACE_NAME_OUTGOING_out, this.outOutgoingEndpointImplementations);  
        
        
    }
    @Override
    public void end(){
        //(Auto-generated): Add cleanup codes
        //(Auto-generated): Dispose unmanaged resources
    }
    
    @Override
    public Object getServiceObject(IMyxName name) {
        //(Auto-generated): Add your code here
        
        return null;
    }
}
