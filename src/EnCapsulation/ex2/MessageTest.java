package EnCapsulation.ex2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MessageTest {

    public void 메시지_타입이_EMAIL_KAKAO_SMS_일경우() {
        final Set<MessageType> types = new HashSet<>();
        types.add(MessageType.EMAIL);
        types.add(MessageType.KAKAO);
        types.add(MessageType.SMS);

        final Message message = Message.of(types);
    }

    public void 메시지_타입이_EMAIL_KAKAO일경우() {
        final Set<MessageType> types = new HashSet<>();
        types.add(MessageType.EMAIL);
        types.add(MessageType.KAKAO);

        final Message message = Message.of(types);
    }

    public void 메시지_타입이_없을경우() {
        final Set<MessageType> types = Collections.emptySet();
        final Message message = Message.of(types);
    }

    public void 메시지_타입이_중복되는경우() {
        final Set<MessageType> types = new HashSet<>();
        types.add(MessageType.EMAIL);
        types.add(MessageType.EMAIL);
        types.add(MessageType.EMAIL);

        final Message message = Message.of(types);
    }
}
