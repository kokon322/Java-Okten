package homeWork4;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter

public enum Size {

    XXS{
        @Override
        public String getDescription() {
            return "This is XXS";
        }
    }, XS{
        @Override
        public String getDescription() {
            return "This is XS";
        }
    },S{
        @Override
        public String getDescription() {
            return "This is S";
        }
    },M{
        @Override
        public String getDescription() {
            return "This is M";
        }
    },L{
        @Override
        public String getDescription() {
            return "This is L";
        }
    };
    private int euroSize;



    public abstract String getDescription();
}
