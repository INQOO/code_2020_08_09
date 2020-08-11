package inqoo.marcin.tdd2;

import java.util.List;

class HowManySameElements {
    private List<Integer> firstList;
    private List<Integer> secondList;

    public void addFirstList(List<Integer> list) {
        this.firstList = list;
    }

    public void addSecondList(List<Integer> list) {
        this.secondList = list;
    }

    public int numberOfSameElements() {
        return (int) firstList.stream()
                .filter(element -> secondList.contains(element)).count();
    }
}
