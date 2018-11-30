package section3.section02

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JOptionPane
import javax.swing.JPanel

class AnnotationTest {
    val mainWin = JFrame("使用注解绑定事件监听器")
    //使用注解为ok按钮绑定事件监听器
    @ActionListenerFor(listener = OkListener::class)
    val ok = JButton("确定")

    //使用注解为cancel按钮绑定事件监听器
    @ActionListenerFor(listener = CancelListener::class)
    val cancel = JButton("取消")

    fun init() {
        //初始化界面的方法
        val jp = JPanel()
        jp.add(ok)
        jp.add(cancel)
        mainWin.add(jp)
        processAnnotations(this)
        mainWin.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        mainWin.pack()
        mainWin.isVisible = true
    }
}

fun main(args: Array<String>) {
    AnnotationTest().init()
}

//定义ok按钮的事件监听器实现类
class OkListener: ActionListener {
    override fun actionPerformed(e: ActionEvent?) {
        JOptionPane.showMessageDialog(null, "单击了确认按钮")
    }
}

//定义cancel按钮的事件监听器实现类
class CancelListener: ActionListener {
    override fun actionPerformed(e: ActionEvent?) {
        JOptionPane.showMessageDialog(null, "单击了取消按钮")
    }
}

