public class 敌人 {
    int ATK;

    public 敌人(int ATK){
        this.ATK=ATK;
    }

    void attack(闪避 dodge){
        dodge.闪避攻击(this);
    }

    void attacked(){
        System.out.println("反击成功");
    }
}
