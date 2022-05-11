package test;

import java.nio.BufferUnderflowException;

/**
 * 实现一个二叉查找树
 * 二叉查找树的优点就是增删改查的速度快
 * 是一种非常不错的数据结构
 * */
public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {
    private static class BinaryNode<AnyType>{  //二叉树的类
        AnyType Element;
        BinaryNode<AnyType> left;
        BinaryNode<AnyType> right;
        BinaryNode(AnyType Element) {
            this(Element,null,null);
        }
        BinaryNode(AnyType el,BinaryNode<AnyType> le,BinaryNode<AnyType> ri) {Element=el;right=ri;left=le;}
    }
    private BinaryNode<AnyType> root; //根节点，节点的添加是在insert方法中
    public BinarySearchTree() {
        root = null;
    }
    public void makeEmpty(){   //让整颗树变为空就只需要将根变为空，这样它对他的字节点的链就变为了空
        root=null;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public boolean contains(AnyType x){  //判断是否包含了x元素
        return contains(x,root);
    }
    public AnyType findMin(){     //查找最小值
        if (isEmpty())
            throw new BufferUnderflowException();
        return findMin(root).Element;
    }
    public AnyType findMax(){    //查找最大值
        if (isEmpty())
            throw new BufferUnderflowException();
        return findMax(root).Element;
    }
    public void insert(AnyType x){  //向树中插入值
       insert(x,root);
    }
    public void remove(AnyType x){   //移除某个值
        remove(x,root);
    }
    public void printTree(){     //打印输出整颗树

    }
    //以上的就是对外开放的调用函数，也就是对二叉树的基本操作，
    //下面介绍的是他们底层实现的方法
    private boolean contains(AnyType x,BinaryNode<AnyType> t){ //判断树中是否包含了x元素
        if (t==null)    //为空树的情况                                      //t为它的根节点
            return false;
        int compareResult=x.compareTo(t.Element);  //对x元素与root元素进行一个比较
        if (compareResult>0)       //若x元素大于root则表明x元素的节点该在root的右边
            return contains(x,t.right);
        else if(compareResult<0)     //若x元素小于root则表明x元素的节点该在root的左边
            return contains(x,t.left);
        else
            return true;
    }
    private BinaryNode<AnyType> findMin(BinaryNode<AnyType> t){
        if (t==null)   //为空树的情况
            return null;
        else if (t.left==null)   //递归到了叶子
            return t;
        else
            return findMin(t.left); //继续递归
    }
    private BinaryNode<AnyType> findMax(BinaryNode<AnyType> t){
        if (t==null)
            return null;
        else if (t.right==null)
            return t;
        else
            return findMin(t.right);
    }
    private BinaryNode<AnyType> insert(AnyType x,BinaryNode<AnyType> t){
        if (t==null)  //是空树的情况下,和树叶未创建的子节点的情况
            return new BinaryNode<AnyType>(x,null,null);
        int com=x.compareTo(t.Element);  //将插入的元素与根比较
        if (com>0)
           t.right=insert(x,t.right);
        else if (com<0)
            t.left=insert(x,t.left);
        else
            ;  //树中有该值不需要做任何事情
        return t;
    }
    private BinaryNode<AnyType> remove(AnyType x,BinaryNode<AnyType> t){
        if (t==null)
            return t; //没有发现元素x,不做任何操作
        int com=x.compareTo(t.Element);
        if (com>0)
            t.right=remove(x,t.right);
        else if (com<0)
            t.left=remove(x,t.left);
        else if





    }

}
