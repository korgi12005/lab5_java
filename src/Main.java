public class Main {
    public static void main(String[] args) {
        ReceptionRequest receptionRequest=new ReceptionRequest();
        ReceptionProxy receptionProxy=new ReceptionProxy();
        Request request=new Request(1,"book");
        System.out.println("Request from ReceptionRequest");
        receptionRequest.sendRequest(request);
        System.out.println("Request from ReceptionProxy");
        receptionProxy.sendRequest(request);
    }

}