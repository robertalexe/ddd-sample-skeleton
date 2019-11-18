package com.ddd.presentation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GoodVOTest {

    @Test
    public void should_return_equally_true_for_2_different_vo_with_same_value() {
        List<String> list = aValidListOfStrings();
        GoodVO first = new GoodVO(list);
        GoodVO second = new GoodVO(list);
        assertThat(first).isEqualTo(second);
    }

    @Test
    public void should_create_defensive_copy_of_vo_data_structure() {
        List<String> list = aValidListOfStrings();
        GoodVO goodVO = new GoodVO(list);
        list.clear();
        assertThat(goodVO.getSomeValues()).containsExactly("first", "second");
    }

    private List<String> aValidListOfStrings() {
        return new ArrayList<String>() {
            {
                add("first");
                add("second");
            }
        };
    }
}