
/*
    Factory Method Pattern is a creational pattern that uses factory
    methods to deal with the problem of creating objects without having
    to specify the exact class of the object that will created
 */

public class Main {

    public static void main(String[] args) {

        OS AndroidObj = new Android();
        AndroidObj.spec();

        OS WindowsObj = new Windows();
        WindowsObj.spec();

        OS IosObj = new IOS();
        IosObj.spec();

        OperatingSystenFactory sof = new OperatingSystenFactory();
        OS Obj = sof.getInstance("Open");
        Obj.spec();
    }
}
