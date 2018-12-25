package eurekaclientconsumer.demoProtoType;



/**
 * @author 24569
 */
public class MainTestProtoType {
    public static void main(String[] args){
        ProtoTypeImplOne protoTypeImplOne=new ProtoTypeImplOne();
        System.out.println(protoTypeImplOne);
        ProtoTypeImplOne protoTypeImplOne1=protoTypeImplOne.clone();
        System.out.println(protoTypeImplOne1);
        ProtoTypeImplOne protoTypeImplOne2=protoTypeImplOne.clone();
        System.out.println(protoTypeImplOne2);
    }
}
