package section1;

import java.util.Random;

public class User {
    //name的getter和setter方法
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //married的setter和getter方法
    public void setMarried(boolean married) {
        System.out.println("调用setMarried方法，参数为：" + married);
    }

    public boolean isMarried() {
        return true;
    }

    public int getAge() {
        return new Random().nextInt(100);
    }
}
