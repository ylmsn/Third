public abstract class 闪避 {

    int DODGE =20;

    private 闪避 next;

    abstract void 闪避攻击(敌人 enemy);

    public 闪避 返回对象(){
        return next;
    }

    public void 使用对象(闪避 next){
        this.next=next;
    }



}
