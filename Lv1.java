public class Lv1 {
    public static void main(String[] args) {
        int m;


        //开始战斗
        System.out.println("野生的巨金怪跳出来了，就决定是你了，火焰鸡！\n");


        //精灵属性赋值
        Lv1MyPokemon mp = new Lv1MyPokemon("火焰鸡", 1000, 50, 30);
        Lv1RivalPokemon rp = new Lv1RivalPokemon("巨金怪", 1200, 35, 60);


        //打印双方精灵属性
        System.out.println(rp.name + "\n" + "hp: " + rp.hp + "\t攻击力: " + rp.atk + "\t防御力: " + rp.def);
        System.out.println(mp.name + "\n" + "hp: " + mp.hp + "\t攻击力: " + mp.atk + "\t防御力: " + mp.def + "\n");


        //判断双方精灵状态
        while (mp.hp > 0 && rp.hp > 0) {
            m= mp.hp;
            mp.skillLine();
            mp.Select(rp);
            if (mp.hp > 0 && rp.hp > 0) {
                rp.Select(mp);
                if(m!= mp.hp&&mp.hp>0)
                    rp.被反击(mp);
            }
        }


        //战斗结束
        if (rp.hp > mp.hp)
            System.out.println("火焰鸡倒下了，快跑！");
        else
            System.out.println("巨金怪倒下了，你获得了胜利！");
    }
}
