public class ReceptionRequest implements StorageRequest{

    @Override
    public void sendRequest(Request request) {
        System.out.println("Name tovar " + request.getVal() + ", ID tovar = " + request.getId());
    }
}
