package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PartitionLabelsTest {

    @Test
    void testPartitionLabels() {
        List<Integer> res = PartitionLabels.partitionLabels("qvmwtmzzse");
        Assertions.assertIterableEquals(Arrays.asList(1, 1, 4, 2, 1, 1), res);
    }

    @Test
    void testPartitionLabels2() {
        List<Integer> res = PartitionLabels.partitionLabels("ababcbacadefegdehijhklij");
        Assertions.assertIterableEquals(Arrays.asList(9, 7, 8), res);
    }

}