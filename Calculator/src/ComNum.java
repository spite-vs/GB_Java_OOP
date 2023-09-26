
public class ComNum {
    private int material;
    private int imaginary;

    public ComNum(int material, int imaginary) {
        this.material = material;
        this.imaginary = imaginary;
    }

    public int getmaterial() {
        return material;
    }

    public int getImaginary() {
        return imaginary;
    }

    public ComNum sum(ComNum other) {
        int sumMaterial = this.material + other.material;
        int sumImaginary = this.imaginary + other.imaginary;
        return new ComNum(sumMaterial, sumImaginary);
    }

    public ComNum multiplication(ComNum other) {
        int productMaterial = this.material * other.material - this.imaginary * other.imaginary;
        int productImaginary = this.material * other.imaginary + this.imaginary * other.material;
        return new ComNum(productMaterial, productImaginary);
    }

    public ComNum divide(ComNum other) {
        int divisor = other.material * other.material + other.imaginary * other.imaginary;
        int qMaterial = (int) ((this.material * other.material + this.imaginary * other.imaginary) / divisor);
        int qImaginary = (int) ((this.imaginary * other.material - this.material * other.imaginary) / divisor);
        return new ComNum(qMaterial, qImaginary);
    }

    @Override
    public String toString() {
        return material + "+" + imaginary + "i";
    }
}
