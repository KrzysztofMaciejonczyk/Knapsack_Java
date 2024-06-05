package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {
@Test
    void testNoItems() {
    Problem problem = new Problem(10, 1, 1, 10);
    Result result = problem.Solve(0);
    Assertions.assertEquals(0, result.getFinalItems().size());
}
@Test
    void testItemsHaveCorrectValues() {
    int lowerBound = 1;
    int upperBound = 10;
    Problem problem = new Problem(10, 1, lowerBound, upperBound);
    for (Item item : problem.getItemArray()) {
        if (item.getWeight() < lowerBound || item.getWeight() > upperBound) {
            Assertions.fail("Item " + item.getIndex() + " has wrong weight. Expected value between: " + lowerBound + " and " + upperBound + " but got " + item.getWeight());
        }
        else if (item.getValue() < lowerBound || item.getValue() > upperBound) {
            Assertions.fail("Item " + item.getIndex() + " has wrong value. Expected value between: " + lowerBound + " and " + upperBound + " but got " + item.getValue());
        }
    }
}
@Test
    void testCorrectTotalWeightAndValue() {
    Problem problem = new Problem(10, 1, 1, 10);
    Result result = problem.Solve(15);
    int expectedWeight = 15;
    int expectedValue = 33;
    Assertions.assertEquals(expectedWeight, result.getTotalWeight());
    Assertions.assertEquals(expectedValue, result.getTotalValue());
}
@Test
    void testAtLeastOneItem() {
        Problem problem = new Problem(10, 1, 1, 10);
        Result result = problem.Solve(3);
        Assertions.assertNotEquals(0, result.getFinalItems().size());
    }
}