package homeWork3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Triangle extends GeometricFigure {
    private int a;
    private int b;
    private int c;

    @Override
    public int calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public int calculateSquare() {
        return a * b * a / c;
    }
}
