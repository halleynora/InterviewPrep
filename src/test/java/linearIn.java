public class linearIn {


    public static boolean linearIn(int[] outer, int[] inner) {
        int indexInner = 0;
        int indexOuter = 0;

        while (indexInner < inner.length && indexOuter < outer.length) {
            if (inner[indexInner] == outer[indexOuter]) {
                indexInner++;
            }
            indexOuter++;
        }
        return (indexInner == inner.length);
    }

    public static void main(String[] args)
    {
        int[] outer = new int[] {1,2,4,6};
        int[] inner = new int[] {2,4};

        System.out.println("I am a Geek");
        boolean linearin = linearIn(outer,inner);
        System.out.println("Is LinearIn:" + linearin);
    }
}
