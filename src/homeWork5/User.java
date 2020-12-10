package homeWork5;

import lombok.ToString;

@ToString
public class User <I,N> {
    private I id;
    private N name;

    public User(I id, N name) {
        this.id = id;
        this.name = name;
    }

    public I getId() {
        return id;
    }

    public N getName() {
        return name;
    }
}
