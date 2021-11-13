import java.util.Scanner;

public class 战术讨论 {
    public static void 开战() {
        Scanner scanner = new Scanner(System.in);
        敌人 enemy = new 敌人(scanner.nextInt());
        闪避lv1 dodgeLv1 = new 闪避lv1();
        闪避lv2 dodgeLv2 = new 闪避lv2();
        闪避lv3 dodgeLv3 = new 闪避lv3();
        闪避lv4 dodgeLv4 = new 闪避lv4();
        dodgeLv1.使用对象(dodgeLv2);
        dodgeLv2.使用对象(dodgeLv3);
        dodgeLv3.使用对象(dodgeLv4);
        enemy.attack(dodgeLv1);
    }
}
class 闪避lv1 extends 闪避{
    @Override
    void 闪避攻击(敌人 enemy) {
        if(DODGE*3<enemy.ATK)
            System.out.println("泥给路打油");
        else
            返回对象().闪避攻击(enemy);
    }
}
class 闪避lv2 extends 闪避{
    @Override
    void 闪避攻击(敌人 enemy) {
        if(DODGE*2<enemy.ATK)
            System.out.println("王子挡下一击然后逃跑");
        else
            返回对象().闪避攻击(enemy);
    }
}
class 闪避lv3 extends 闪避{
    @Override
    void 闪避攻击(敌人 enemy) {
        if(DODGE<enemy.ATK) {
            System.out.println("王子躲过此次攻击然后反击");
            enemy.attacked();
        }else{
            返回对象().闪避攻击(enemy);
        }
    }
}
class 闪避lv4 extends 闪避{
    @Override
    void 闪避攻击(敌人 enemy) {
        if(DODGE>enemy.ATK)
            System.out.println("王子直接反击");
            enemy.attacked();
    }
}