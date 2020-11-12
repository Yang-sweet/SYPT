import org.apache.hadoop.yarn.webapp.hamlet2.Hamlet;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Stack;
//
// class TreeNode {
//    int val = 0;
//   TreeNode left = null;
//    TreeNode right = null;
//  }
//
//public class weiju {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     * 用非递归的方式实现二叉树的先序遍历
//     * @param root TreeNode类 二叉树的根节点
//     * @return int整型ArrayList
//     */
//    public ArrayList<Integer> preorderTraversal (TreeNode root) {
//        ArrayList<Integer> nTree=new ArrayList<Integer>();
//        if(root==null){
//            return nTree;
//        }
//        Stack<TreeNode> st=new Stack<>();
//        st.push(root);
//        while (!st.isEmpty()){
//            TreeNode cur=st.pop();
//            nTree.add(cur.val);
//            if(cur.right!=null){
//                st.push(cur.right);
//            }
//            if(cur.left!=null){
//                st.push(cur.left);
//            }
//        }
//        return nTree;
//
//
//
//
//        // write code here
//    }
//}