public class BmiService {
    public int calculate (double mHeight, double kgWeight ){
        return (int) (kgWeight / (mHeight * mHeight));

    }
}
