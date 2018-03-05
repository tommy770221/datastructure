package com.caculate.leednode;



public class Tree2str {

    public static String tree2str(TreeNode t) {
        //String returnResult=tree2str(t);

        while (t!=null){
            String result=String.valueOf(t.val);

            if(t.left!=null){
             result=result+"("+tree2str(t.left)+")";
            }
            if(t.right!=null){
                if(t.left==null){
                    result=result+"()"+"("+tree2str(t.right)+")";
                }else{
                    result=result+"("+tree2str(t.right)+")";
                }
            }
            return result;
        }

        return "";
    }

    public static void main(String[] args){
        TreeNode treeNode=new TreeNode(1);
        TreeNode treeNodeTwo=new TreeNode(2);
        treeNodeTwo.left=new TreeNode(4);
        treeNode.left=treeNodeTwo;
        treeNode.right=new TreeNode(3);
        System.out.println(tree2str(treeNode));
    }
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}