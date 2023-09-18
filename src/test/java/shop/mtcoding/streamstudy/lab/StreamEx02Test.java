package shop.mtcoding.streamstudy.lab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class StreamEx02Test {

    @Test
    public void ex05() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> newList = list.stream()
                .skip(1)
                .peek(t -> {
                    System.out.println("peek : " + t);
                })
                .limit(2) // 리밋은 수집 직전에 발동한다
                .collect(Collectors.toList());
        newList.stream().forEach(t -> System.out.println(t));

    }

    @Test
    public void ex04() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> newList = list.stream().limit(2).collect(Collectors.toList());
        newList.stream().forEach(t -> System.out.println(t));

    }

    // 가공
    @Test
    public void ex03() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> newList = list.stream()
                .filter(t -> t != 3)
                .map(t -> t * 2)
                .collect(Collectors.toList());
        newList.stream().forEach(t -> System.out.println(t));
    }

    // 필터
    @Test
    public void ex02() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> newList = list.stream().filter(t -> t != 3).collect(Collectors.toList());
        newList.stream().forEach(t -> System.out.println(t));
    }

    @Test
    public void ex01() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> newList = list.stream().filter(t -> t % 2 != 0).collect(Collectors.toList());

        newList.stream().forEach(t -> System.out.println(t));
    }

}
