package homeWork3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class GeometricFigure {
    private int perimeter;
    private int square;

   public abstract int calculatePerimrter();

}
