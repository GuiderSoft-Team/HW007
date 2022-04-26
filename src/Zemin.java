public class Zemin {
    private String statement;
    private double width;
    private double height;

    public Zemin(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {

        return getStatement() + " alan:" + calculateArea();
    }
}

