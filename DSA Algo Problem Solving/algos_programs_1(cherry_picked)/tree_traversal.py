from typing import Optional, List

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def postorderTraversal(root: Optional[TreeNode]) -> List[int]:
    post = []

    def dfs(n):
        if not n: return 
        # 1. Left Child 
        dfs(n.left)
        # 2. Right Child 
        dfs(n.right)
        # 3. Current Node 
        post.append(n.val)

    dfs(root)
    return post