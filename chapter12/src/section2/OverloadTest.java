package section2;

public class OverloadTest {
    public static void main(String[] args) {
        OverloadKt.test("yeeku", 182, 3.4);
        System.out.println();
        OverloadKt.test("yeeku", 182);
        System.out.println();
        OverloadKt.test("yeeku");
    }
}
