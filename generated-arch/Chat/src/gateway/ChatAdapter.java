package gateway;
  
import java.util.concurrent.atomic.AtomicReference;
public  class ChatAdapter extends  ChatAdapter_AutoGenerated 
{
    public ChatAdapter()
    {   
        super();
        //TODO Additional initialization
    }
    
    @Override
    public void init()
    {
        super.init();
        //TODO : Additional logic
    }
    
    
    @Override
    protected IChatEv get_inIncomingEndpointImplementation()
    {
         //TODO return  end-point implementation for IChatEv as following:
         //return new <implementation of inIncomingEndpointImplementation implementing type IChatEv>();
         //Please note that : Uninitialized inIncomingEndpointImplementation results in a RuntimeException
         return null;
    }
    
    
    
    @Override
    protected void OnConnectingWith_chatOutgoingEndpointImplementations()
    {
       /*Implementing additional logic while connecting with the   
        *end-point : chatOutgoingEndpointImplementations of type : IChat 
        * */
    }    
    @Override
    protected void OnDisconnectingWith_chatOutgoingEndpointImplementations()
    {
        /*Implementing additional logic while disconnecting with the   
         *end-point : chatOutgoingEndpointImplementations of type : IChat
         * */
    }
    @Override
    protected void OnDisconnectedingWith_chatOutgoingEndpointImplementations()
    {
        /*Implementing additional logic while disconnected with the   
         *end-point : chatOutgoingEndpointImplementations of type : IChat
         * */
    }    
    
}