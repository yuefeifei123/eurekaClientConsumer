package eurekaclientconsumer.demoProtoType;

/**原型模式的接口类，基类
 * @author yukfei
 */
public interface ProtoType extends Cloneable {

    ProtoType clone();
}
