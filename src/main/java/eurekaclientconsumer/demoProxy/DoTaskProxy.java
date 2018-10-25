package eurekaclientconsumer.demoProxy;

public class DoTaskProxy implements DoTask {
    private DoTaskImp doTaskImp;
    public DoTaskProxy(DoTaskImp doTaskImp){
        this.doTaskImp=doTaskImp;
    }
    /**
     *
     */
//    DoTaskImp doTaskImp=DoTaskImp.class.newInstance();

    @Override
    public void doEveryDay(){
        System.out.println("**** every day from 9:00 *****");
        doTaskImp.doEveryDay();
        System.out.println("**** every day to 9:00 ***** and never given up");
    }
}
