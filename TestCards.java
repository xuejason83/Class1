package blackjack;

public class TestCards {
    private String[] targetArray = {"heart","spades","box","club"};
    private String[] targetValues = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCards test = new TestCards();
		test.testGetCard();
       
	}
	public void testGetCard(){
		Cards card = new Cards();
		String cardValue = card.getCards();
		System.out.println("The result value is:" + cardValue);
		String[] cardArray = cardValue.split("-");
		if (cardArray.length != 2) {
			System.out.println("Failed: invalid value");
		} else if (!checkArray(cardArray[0])) {
			System.out.println("Failed： invalid value");
		} else if (!checkValue(cardArray[1])) {
			System.out.println("Failed： invalid value");
		} else {
			System.out.println("Success");
		}
	}
	
	private boolean checkArray(String name) {
		for (String itr : targetArray) {
			if (itr.equals(name)) 
				return true;
		}
		return false;
	}
	
	private boolean checkValue(String value) {
		for (String itr : targetValues) {
			if (itr.equals(value)) 
				return true;
		}
		return false;
	}

}
