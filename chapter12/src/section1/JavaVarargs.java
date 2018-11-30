package section1;

public class JavaVarargs {
    //定义参数个数可变的方法
    public void test(int... nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
