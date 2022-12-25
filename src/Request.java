public class Request {
    private int id;
    private String val;

    public Request(int index,String str){
        this.id=index;
        this.val=str;
    }

    public int getId() {
        return id;
    }

    public void setId(int index) {
        this.id = index;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
