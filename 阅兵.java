public class 阅兵 {
    static void 开始阅兵(){
        国王 波吉 = new 国王波吉();
        波吉.add(()->System.out.println("国王好，我是士兵一号"));
        波吉.add(()->System.out.println("国王好，我是士兵二号"));
        波吉.add(()->System.out.println("国王好，我是士兵三号"));
        波吉.add(()->System.out.println("国王好，我是士兵四号"));
        波吉.add(()->System.out.println("国王好，我是士兵五号"));
        波吉.review();
    }
}
class 国王波吉 extends 国王{

    @Override
    public void review() {
        System.out.println("波吉国王:啊啊呀呀呀");
        for(士兵 soldier : 军队){
            soldier.报告();
        }
    }
}