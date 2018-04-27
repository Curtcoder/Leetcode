package com.andreysmirniahin.solutions;

public class _657_Judge_Route_Circle {

    public static void main(String[] args) {
        _657_Judge_Route_Circle judgeRouteCircle = new _657_Judge_Route_Circle();
        boolean result = judgeRouteCircle.judgeCircle("LL");
        System.out.println(result);
    }

    public boolean judgeCircle(String moves) {
        boolean result = false;

        // Current robot position {Right, Left, Up, Down}
        int[] positions = {0, 0, 0, 0};

        char[] inputStringCharArray = moves.toCharArray();
        for (char c : inputStringCharArray) {
            switch (c) {
                case 'R':
                    positions[0]++;
                    break;
                case 'L':
                    positions[1]++;
                    break;
                case 'U':
                    positions[2]++;
                    break;
                case 'D':
                    positions[3]++;
                    break;
                default:
                    break;
            }
        }


        return result;
    }

}
