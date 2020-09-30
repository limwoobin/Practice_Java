package FirstClassCollection.ex1;

import java.util.ArrayList;
import java.util.List;

public class LottoService {
    private static final int LOTTO_NUMBERS_SIZE = 6;

    public void createLottoNumber() {
        LottoTicket lottoTicket = new LottoTicket(createNonDuplicateNumbers());
    }

    public List<Long> createNonDuplicateNumbers() {
        List<Long> lottoNumbers = new ArrayList<>();
        for (int i=0; i<LOTTO_NUMBERS_SIZE; i++) {
            lottoNumbers.add((long) (Math.random() * 45 + 1));
        }

        return lottoNumbers;
    }
}
