import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Wenyao on 2/2/2017.
 */
public class RobotInGrid {
    public static void main(String[] args) {
        //System.out.println(getPath());
    }

    public static ArrayList<Point> getPath(boolean[][] maze) {
        if (maze == null || maze.length == 0) {
            return null;
        }else {
            ArrayList<Point> path = new ArrayList<Point>();
            if (getPath(maze, maze.length - 1, maze[0].length - 1, path)) {
                return path;
            }
            return null;
        }
    }

    public boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path) {
        /* If out of bounds or not available, return */
        if (col < 0 || row < 0 || !maze[row][col]) {
            return false;
        }
        boolean isAtOrigin = (row == 0) && (col == 0);
        if (isAtOrigin || getPath(maze, row, col - 1, path) || getPath(maze, row - 1, col, path)){
            Point p = new Point(row, col);
            path.add(p);
            return true;
        }
        return false;
    }


}
