/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author admin
 */
public class BinaryTreeByLinkedList {
    BinaryNode root;
    // preorder traversal Time and Space O(n)
    void preorder(BinaryNode binaryNode){
        if(binaryNode ==  null){
            return;
        }
        System.out.println(binaryNode.value+" ");
        preorder(binaryNode.left);  // O(n/2)
        preorder(binaryNode.right); // O(n/2)
    }
    
    // in-order traversal Time and Space O(n)
    void inorder(BinaryNode binaryNode){
        if(binaryNode ==  null){
            return;
        }
        preorder(binaryNode.left);  // O(n/2)
        System.out.println(binaryNode.value+" ");
        preorder(binaryNode.right); // O(n/2)
    }
    
    // post order traversal Time and Space O(n)
    void postorder(BinaryNode binaryNode){
        if(binaryNode == null){
            return;
        }
        postorder(binaryNode.left);  // O(n/2)
        postorder(binaryNode.right);  // O(n/2)
        System.out.println(binaryNode.value+" ");
    }
    
    void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
    }
}
