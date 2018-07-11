package other;

/**
 * Executable PriceComparatorDemo
 * 
 * @author Anton Baker
 * @date Tuesday, 2018-07-10
 */

public class PriceComparator {

	private PriceComparator INSTANCE;

	public PriceComparator() {
		INSTANCE = this;
	}

	public PriceComparator getInstance() {
		return INSTANCE;
	}
}