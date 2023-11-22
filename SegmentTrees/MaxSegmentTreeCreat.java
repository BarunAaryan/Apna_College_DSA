public class MaxSegmentTreeCreat {
    // create a max segment tree
    static int tree[];

    public static void init(int n) {
        tree = new int[4 * n];

    }

    public static void buildTree(int i, int si, int sj, int arr[]) {
        if (si == sj) {
            // at root node
            tree[i] = arr[si];
            return;
        }
        int mid = (si + sj) / 2; // si+(sj-si)/2
        buildTree(2 * i + 1, si, mid, arr);
        buildTree(2 * i + 2, mid + 1, sj, arr);

        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
    }
    public static void main(String[] args) {
        int arr[] = { 6, 8, -1, 2, 17, 1, 3, 2, 4 };
        int n = arr.length;
        init(n);
        buildTree(0, 0, n - 1, arr);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
    }
}
