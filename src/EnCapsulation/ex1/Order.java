package EnCapsulation.ex1;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Order {
    private long id;

    private String messageTypes;

    @Builder
    public Order(String messageTypes) {
        this.messageTypes = messageTypes;
    }
}
