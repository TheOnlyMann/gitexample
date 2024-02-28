package edu.postech.csed490h;

public class TestProgram {
    public static void main(String[] args) {
        // 1. Initialize check cards for three individuals (A, B, C) with initial balances
        CheckCard[] cards = new CheckCard[3];
        cards[0] = new CheckCard("A", "Bank Woori", 2024, 5000);
        cards[1] = new CheckCard("B", "Bank Woori", 2024, 5000);
        cards[2] = new CheckCard("C", "Bank Woori", 2026, 0);

        // 2. Print the overall status of all three credit cards
        for (int idx = 0 ; idx <= 2 ; idx++) {
            CheckCard.printStatus(cards[idx]);
        }

        // 3. A successfully pays B but
        if (cards[0].makePaymentAndReturnSuccess(3000)) {
            cards[1].chargeCard(3000);
        }

        /* A fails when attempting to pay C due to insufficient fund and
           upon discovery of declined payment, charges card with additional funds. */
        if (cards[0].makePaymentAndReturnSuccess(3000)) {
            cards[2].chargeCard(3000);
        } else {
            cards[0].chargeCard(1000);
        }

        // 5. A, tries again, this time successfully
        if (cards[0].makePaymentAndReturnSuccess(3000)) {
            cards[2].chargeCard(3000);
        }

        // 5. Print the updated status of all three credit cards
        for (int idx = 1 ; idx <= 2 ; idx++) {
            CheckCard.printStatus(cards[idx]);
        }
    }
}
