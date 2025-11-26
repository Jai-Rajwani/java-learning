package solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
    private static final int GRID_SIZE = 3;
    private static final char EMPTY_CELL = '.';
    public boolean isValidSudoku(char[][] board) {
        Map<String, Set<Character>> characterMap = new HashMap<>();

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                String[] coordinates = getRowColumnAndGridOfAnElement(x, y, GRID_SIZE);
                if (board[x][y] == EMPTY_CELL) continue;
                if (!validateCoordinates(coordinates, board[x][y], characterMap)) {
                    return false;
                }
            }
        }
        return true;
    }
    private String[] getRowColumnAndGridOfAnElement(int x, int y, int gridSize) {
        String[] rowColumnGrid = new String[3];
        rowColumnGrid[0] = "r" + x;
        rowColumnGrid[1] = "c" + y;
        rowColumnGrid[2] = "g" + x/gridSize + y/gridSize;
        return rowColumnGrid;
    }

    private boolean validateCoordinates(String[] coordinates, char element, Map<String, Set<Character>> characterMap) {
        for (String coordinate : coordinates) {
            if (characterMap.get(coordinate) == null) {
                Set<Character> set = new HashSet<>();
                set.add(element);
                characterMap.put(coordinate, set);
            } else if (!characterMap.get(coordinate).contains(element)) {
                characterMap.get(coordinate).add(element);
            } else {
                return false;
            }
        }
        return true;
    }
}

