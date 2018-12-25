package eurekaclientconsumer.demoProtoType;

/**原型模式的实现类一
 * @author 24569
 */
public class ProtoTypeImplOne implements ProtoType {
    @Override
    public ProtoTypeImplOne clone(){
        ProtoTypeImplOne protoTypeImplOne=null;
        try {
            protoTypeImplOne=(ProtoTypeImplOne) super.clone();
//            System.out.println(protoTypeImplOne);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return protoTypeImplOne;
    }
}
