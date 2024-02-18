import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    private static class TreeNode {
        TreeNode left;
        int val;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private TreeNode root;

    public static void main(String[] args) {
        Solution s = new Solution();

        s.root = new TreeNode(10);
        s.root.left = new TreeNode(20);
        s.root.right = new TreeNode(30);

        System.out.println(s.bfs(s.root));
    }

    public List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> ds = new LinkedList<List<Integer>>();
        if(root == null) {
            return ds;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
            
        while(!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }
            ds.add(subList);
        }

        return ds;
    }
}