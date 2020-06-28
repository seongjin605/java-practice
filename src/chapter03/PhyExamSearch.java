package chapter03;

public class PhyExamSearch {

    static class PhscData {
        private String name;
        private int height;
        private double vision;

        public PhscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparable<PhscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparable<PhscData> {
            public int compareTo(PhscData firstPhscData, PhscData secondPhscData) {
                return firstPhscData.height > secondPhscData.height ?
                        1 : firstPhscData.height < secondPhscData.height ? -1 : 0;
            }

            @Override
            public int compareTo(PhscData o) {
                return 0;
            }
        }
    }
}
