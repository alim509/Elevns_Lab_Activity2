import java.util.List;
import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> cards;
	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>;
		for(int i = 0; i < ranks.length; i++)
			{
				for (int j = 0; j < suits.length; j++)
					{
						for (int k = 0; k < values.length; k++)
							{
								cards.add(new Card(ranks[i], suits[j], values[k]));
							}
					}
			}
		shuffle();
	}

	public boolean isEmpty() {
		if(cards.size() == 0)
			return true;
		else
			return false;
	}

	int size() {
		return cards.size();
	}

	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	}

	public Card deal() {
		if(!cards.isEmpty())
			cards.remove(0);
	}

	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
