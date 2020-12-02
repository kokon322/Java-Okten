package homeWork3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Square extends GeometricFigure {
    private int a;


    @Override
    public int calculatePerimeter() {
        return a * 4;
    }

    @Override
    public int calculateSquare() {
        return a * a;
    }
}
