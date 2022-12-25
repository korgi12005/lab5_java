public class ReceptionProxy implements StorageRequest{
    ReceptionRequest receptionRequest= new ReceptionRequest();
    @Override
    public void sendRequest(Request request) {
        startRequest();
        receptionRequest.sendRequest(request);
        endRequest();
    }
    public void startRequest(){
        System.out.println("Begin");
    }
    public void endRequest(){
        System.out.println("End");
    }
}
