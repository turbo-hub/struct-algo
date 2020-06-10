/**
  *
  * Created by Turbo
  *
  */
object TreeAndHeap {



  case class TreeNode (value:Int,left:TreeNode,right:TreeNode)
  def reverseTree(node:TreeNode):TreeNode={

    //递归终止条件
    if(node == null) return null

    //1.交换节点
    val tmpNode = node.left
    val node.left = node.right
    val node.right = tmpNode

    reverseTree(node.left)  //2.让左子树内部交换节点
    reverseTree(node.right) //3.让右子树内部交换节点
    node                    //4.返回修改之后的节点

  }







  //========================main
  def main(args: Array[String]): Unit = {

  }




}
