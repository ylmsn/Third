import java.util.ArrayList;

abstract class 国王 {
    ArrayList<士兵> 军队 =new ArrayList<>();

    public void add(士兵 soldier){
        军队.add(soldier);
    }

    public void remove(士兵 Soldier){
        军队.remove(Soldier);
    }

    abstract public void review();
}
