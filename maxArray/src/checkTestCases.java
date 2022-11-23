public class checkTestCases {

    public static int addNumber(int a,int b)
    {
        return a+b;
    }
    public static void beforeExecute(){
        System.out.println("Before Executed");
    }
    public static void alwaysBeforeExecuted(){
        System.out.println("alwaysBeforeExecuted");
    }
    public static void afterExecuted(){
        System.out.println("afterExecuted");
    }
    public static int cube(int n)
    {
        return n*n*n;
    }
    public static void afterAlwaysExecuted(){
        System.out.println("afterAlwaysExecuted");

    }
}
