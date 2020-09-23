package EnCapsulation.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.List;

public class Message {

    private String type;

    private Message(String type) {
        this.type = type == null ? null : type;
    }

    public static Message of(Set<MessageType> types) {
        return new Message(joining(types));
    }

    public List<MessageType> getTypes() {
        if (type == null) {
            return new ArrayList<>();
        }

        return new ArrayList<>(doSplit());
    }

    private static String joining(Set<MessageType> types) {
        return types.stream()
                .map(Enum::name)
                .collect(Collectors.joining(","));
    }


    private Set<MessageType> doSplit() {
        final String[] split = this.type.split(",");
        return Arrays.stream(split)
                .map(MessageType::valueOf)
                .collect(Collectors.toSet());
    }
}

enum MessageType {
    EMAIL , KAKAO , SMS;
}