package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {

	@ParameterizedTest
	@CsvFileSource(resources = "computation_dataset.csv", numLinesToSkip = 0)
	public void testGetDiscount(int id, int rate, int expectedDiscount) throws Exception {
		Computation com = new Computation();
		int result = com.getDiscount(id, rate); 
		Assert.assertEquals(expectedDiscount, result);
	}
	
}
