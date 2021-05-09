public class OperatingSystenFactory {
    public OS getInstance(String name){
        if (name.equals("Open")){
            return  new Android();
        }else if (name.equals("Cloed")){
            return  new IOS();
        }else {
            return  new Windows();
        }
    }
}
