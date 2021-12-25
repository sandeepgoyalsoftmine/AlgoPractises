package com.company.tree;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class CommonNodeSum {
    public int solve(TreeNode A, TreeNode B) {
        int mod = 1000000007;
        long sum = 0;

        Iterator i1 = new Iterator(A);
        Iterator i2 = new Iterator(B);

        int e1, e2;
        e1 = i1.next();
        e2 = i2.next();
        while (i1.hasNext() && i2.hasNext()) {
            if (e1 == e2) {
                sum = (sum + e1) % mod;
                e1 = i1.next();
                e2 = i2.next();
            } else if (e1 < e2) {
                for (; i1.hasNext(); ) {
                    e1 = i1.next();
                    if (e1 == e2) {
                        sum = (sum + e1) % mod;
                    } else if (e1 > e2) break;
                }
            } else {
                for (; i2.hasNext(); ) {
                    e2 = i2.next();
                    if (e1 == e2) {
                        sum = (sum + e2) % mod;
                    } else if (e2 > e1) break;
                }
            }
        }
        if (e1 == e2) {
            sum = (sum + e2) % mod;
        }
        return (int) sum;
    }

    public class Iterator {
        TreeNode root;
        Stack<TreeNode> s = new Stack<TreeNode>();

        public Iterator(TreeNode root) {
            this.root = root;
        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {
            if (root != null || !s.isEmpty()) {
                return true;
            } else return false;
        }

        /**
         * @return the next smallest number
         */
        public int next() {
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            int val = 0;
            if (!s.isEmpty()) {
                TreeNode pop = s.pop();
                val = pop.val;
                root = pop.right;
            }
            return val;
        }


    }
}
