package de.kohnlehome;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;



public class TestSmallestdifference {
    public ISmallestdifference smallestdifference;



    @Test
    public void difference_1_3_15_11_2_mit_23_127_235_19_8(){
        // ===== ACT =====
        int[] array1 = {1,3,15,11,2};
        int[] array2 = {23,127,235,29,8};
        int result = smallestdifference.difference(array1, array2);
        // ===== ASSERT =====
        assertThat(result).isEqualTo(3);
    }
}