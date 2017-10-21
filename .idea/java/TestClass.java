public class TestClass {
    public static int[][] testTask(char[][] arr) {
        int[][] result = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int minesCounter = 0;
                if (arr[i][j] == '#') minesCounter++;
                //i-1 j -1 j + 1
                if (i > 0 && arr[i - 1][j] == '#') minesCounter++;
                if (i > 0 && j > 0 && arr[i - 1][j - 1] == '#') minesCounter++;
                if (i > 0 && j + 1 < arr[i].length && arr[i-1][j+1] == '#') minesCounter++;

                //i+1 j - 1 j + 1
                if (i + 1 < arr.length && arr[i+1][j] == '#') minesCounter++;
                if (i + 1 < arr.length && j + 1 < arr[i].length && arr[i+1][j+1] == '#') minesCounter++;
                if (i + 1 < arr.length && j - 1 > 0 && arr[i + 1][j - 1] == '#') minesCounter++;

                if (j + 1 < arr[i].length && arr[i][j+1] == '#') minesCounter++;
                if (j > 0 && arr[i][j - 1] == '#') minesCounter++;

                result[i][j] = minesCounter;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        char[][] arr = new char[][]{
                {'x', '#', 'x'},
                {'x', '#', '#'},
                {'x', 'x', 'x'}
        };
        int[][] result = testTask(arr);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}
