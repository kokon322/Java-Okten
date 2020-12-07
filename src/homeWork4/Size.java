package homeWork4;

import lombok.*;

@AllArgsConstructor
@ToString


public enum Size {

    XXS(32) {
        @Override
        public String getDescription() {
            return "This is XXS";
        }
    }, XS(34) {
        @Override
        public String getDescription() {
            return "This is XS";
        }
    }, S(36) {
        @Override
        public String getDescription() {
            return "This is S";
        }
    }, M(38) {
        @Override
        public String getDescription() {
            return "This is M";
        }
    }, L(40) {
        @Override
        public String getDescription() {
            return "This is L";
        }
    };
    private int euroSize;

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public abstract String getDescription();
}
