public class HarmonicSeriesWithArrays {
    public static double HarmonicSeriesAdd(int[] harmonicSerie) {
        double sum = 0;
        for (int i = 0; i < harmonicSerie.length; i++) {
            sum += (1.0 / harmonicSerie[i]);
        }
        return harmonicSerie.length / sum;
    }

    public static void main(String[] args) {
        int[] values = { 34, 55, 67, 44, 200, 55, 84 };
        System.out.println("Harmonik Seri Toplamı : " + HarmonicSeriesAdd(values));
    }

}
