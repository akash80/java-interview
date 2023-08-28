/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.tree;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class TreeNode {
    String value;
    ArrayList<TreeNode> children;
    
    public TreeNode(String val){
        value = val;
        children = new ArrayList<>();
    }
    
    public void addChild(TreeNode node){
        this.children.add(node);
    }
    
    public String print(int level){
        String ref = "  ".repeat(level)+value+"\n";
//        ref = children.stream().map(node -> node.print(level+1)).reduce(ref, String::concat); // using stream api
        for(TreeNode node: children){
            ref +=node.print(level+1);
        }
        return ref;
    }
}
