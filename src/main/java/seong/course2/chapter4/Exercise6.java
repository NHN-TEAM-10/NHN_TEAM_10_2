//
//
///**
// * 이 프로그램은 무작위로 채색된 정사각형으로 가득 찬 윈도우를 연다 "교란은 윈도우 주변을 무작위하게 움직이면서 이와 마주친 각각의 정사각형 색상을 무작위로 변경한다 해당 프로그램은 사용자가 윈도우를 종료하기
// * 전까지 실행된다.
// */
//public class RandomMosaicWalk {
//    static int currentRow;
//    static int currentColumn;
//
//    final static int maxRow = 80;
//    final static int maxColumn = 80;
//
//    /**
//     * 메인 프로그램은 윈도우륽 생성하고 이를 무작위한 색상들로 채우며, 윈도우가 열려 있는 한 교란이 해당 윈도우 주변을 무작위로 돌아다니게 한다.
//     */
//    public static void main(String[] args) {
//        Mosaic.open(maxRow, maxColumn, 5, 5);
//        Mosaic.setUse3DEffect(false);
//        // 전체 모자이크를 채운다
//        fillWithMosaic();
//        // 무작위로 주변 모자이크를 모두 바꾼다.
//        currentRow = maxRow / 2;
//        currentColumn = maxColumn / 2;
//        while (true) {
//            randomChange(currentRow, currentColumn);
//            changeColumn();
//            Mosaic.delay(1000);
//        }
//        //현재 위치 설정
//        // 윈도우가 열려있는동안
//        // 현재 위치 색깔을 랜덤하게 바꾸기
//        // 현재위치 랜덤하게 변경
//    }
//
//    /**
//     * 현재 위치를 상,하,좌,우 중 랜덤하게 변경함 precondition : 현재 column, row가 적당 범위에 위치해야함. postCondition : 새로운 row, column을 얻음.
//     */
//    private static void changeColumn() {
//        int condition = (int) (Math.random() * 4);
//        // 상, 하 좌.우
//        switch (condition) {
//            case 0:
//                currentRow--;
//                if (currentRow < 0) {
//                    currentRow = maxRow - 1;
//                }
//                break;
//            case 1:
//                currentRow++;
//                if (currentRow >= maxRow) {
//                    currentRow = 0;
//                }
//                break;
//            case 2:
//                currentColumn--;
//                if (currentColumn < 0) {
//                    currentColumn = maxColumn - 1;
//                }
//                break;
//            case 3:
//                currentColumn++;
//                if (currentColumn >= maxColumn) {
//                    currentColumn = 0;
//                }
//                break;
//        }
//    }
//
//    /**
//     * 현재 모자이크를 랜덤하게 설정 preCondition : 윈도우가 켜져있어야함, currentRow, currentColumn 이 올바르게 돼야함. postCondition : 현재 모자이크를 랜덤하게
//     * 색깔을 바꿈.
//     *
//     * @param row 행을 의미하며 0에서 점차 내려온다.
//     * @param column 열을 의미하며 0에서 오른쪽으로 이동한다.
//     */
//    private static void randomChange(int row, int column) {
//        int r = 0;
//        int g = ((Mosaic.getGreen(row,column) + 25))%255;
//        int b = 0;
//        Mosaic.setColor(row, column, r, g, b);
//    }
//
//    /**
//     * 전체 윈도우를 모자이크로 채운다 preCondition : 모자이크 윈도우가 열려있다. postCondition : 각각의 정사각형에
//     */
//    private static void fillWithMosaic() {
//        // 모든 행에대해
//        // 모든 열에 대해
//        // 랜덤하게 색깔을 정한다.
//        for (int i = 0; i < maxRow; i++) {
//            for (int j = 0; j < maxColumn; j++) {
//                Mosaic.setColor(i, j, 0, 0, 0);
//            }
//        }
//
//    }
//}
