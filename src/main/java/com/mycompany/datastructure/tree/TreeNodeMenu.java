/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.tree;

/**
 *
 * @author admin
 */
public class TreeNodeMenu {
    public static void main(String args[]){
        TreeNode drink = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode pepsi = new TreeNode("Pepsi");
        TreeNode tea = new TreeNode("Tea");
        cold.addChild(pepsi);
        hot.addChild(tea);
        drink.addChild(cold);
        drink.addChild(hot);
        System.out.println(drink.print(0));
    }
}
