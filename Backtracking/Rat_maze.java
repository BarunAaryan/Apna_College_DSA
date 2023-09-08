public class Rat_maze {
    static int N;

    public static void findPaths(int[][] maze) {
        N = maze.length;
        int[][] visited = new int[N][N];
        StringBuilder path = new StringBuilder();

        findPathsUtil(maze, 0, 0, visited, path);
    }

    private static void findPathsUtil(int[][] maze, int row, int col, int[][] visited, StringBuilder path) {
        // Base case: if rat reaches the destination
        if (row == N - 1 && col == N - 1 && maze[row][col] == 1) {
            System.out.println(path.toString());
            return;
        }

        // Check if the current position is valid
        if (row < 0 || row >= N || col < 0 || col >= N || maze[row][col] == 0 || visited[row][col] == 1)
            return;

        // Mark the current cell as visited
        visited[row][col] = 1;

        // Explore all possible directions
        // Up
        path.append('U');
        findPathsUtil(maze, row - 1, col, visited, path);
        path.deleteCharAt(path.length() - 1);

        // Down
        path.append('D');
        findPathsUtil(maze, row + 1, col, visited, path);
        path.deleteCharAt(path.length() - 1);

        // Left
        path.append('L');
        findPathsUtil(maze, row, col - 1, visited, path);
        path.deleteCharAt(path.length() - 1);

        // Right
        path.append('R');
        findPathsUtil(maze, row, col + 1, visited, path);
        path.deleteCharAt(path.length() - 1);

        // Mark the current cell as unvisited to explore other paths
        visited[row][col] = 0;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        findPaths(maze);
    }
}
