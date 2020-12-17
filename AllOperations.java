public class AllOperations {

    public int addTwoValues(int i, int j) {

        int sum = i + j;
        return sum;
    }
    public int substractionTwoValues(int i, int j) {

        int sub = i - j;
        return sub;
    }
    public int divisionTwoValues(int i, int j) {

        int div = i/j;
        return div;
    }

    public static void main(String[] args) {
        AllOperations aos = new AllOperations();
        int afterCompletedSum = aos.addTwoValues(10, 20);
        System.out.println("afterCompletedSum =="+afterCompletedSum);
        int aftercompletedSubstraction=aos.substractionTwoValues(230,30);
        System.out.println("aftercompletedSubstraction=="+aftercompletedSubstraction);
        int afterDivision=aos.divisionTwoValues(100,10);
        System.out.println("afterDivision=="+afterDivision);
    }
}
