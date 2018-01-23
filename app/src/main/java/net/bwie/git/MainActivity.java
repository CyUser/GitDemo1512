package net.bwie.git;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Git：代码版本管理工具，是全球最好的代码工具（软件）
 * 可以实现多人合作开发，代码合并merge，解决冲突conflict，代码版本回滚reset
 * <p>
 * Github：开源代码托管网站
 * 我们今天开始所有代码全部发布到github上，你们去github下载即可
 * <p>
 * Git有两种代码版本控制方式
 * 1、使用命令行
 * 2、AndroidStudio可视化操作（我们使用这种）
 * <p>
 * repository：仓库：存储需要版本控制的代码
 * master：主干：整个工程的主题
 * branch：分支：强烈推荐在分支中操作代码，操作完毕后合并到主干中，防止代码之间干扰
 * <p>
 * 使用流程：
 * 1、启用代码控制
 * VCS -> Enabl Version Control Integration -> Git
 * 2、将具体的代码文件/开发资源也要加入仓库中
 * VCS -> Git -> add
 * 3、添加到仓库中的代码需要提交（保存）才能最终使用
 * VCS -> Git -> commit
 * 1部分：预览即将被保存的文件
 * 2部分：Commit Message。该部分不允许为空，每一次提交代码时都需要记录当前代码版本的更新发生了什么变化
 * 如果是第一次将工程提交，填写init commit即可
 * <p>
 * 文件颜色：
 * 红色：未添加到仓库的状态，add变为绿色
 * 绿色：已添加到仓库但是未提交的状态，commoit变为白色
 * 蓝色：代码发生过修改的状态，commit变为白色
 * 白色：成功的状态
 * <p>
 * 举例：有一个TextView
 * 需求1、创建分支，再添加一个Imageiew，提交代码，合并到主干，删除分支
 * 需求2、创建分支，将TextView修改为Button按钮，提交代码，合并到主干，删除分支
 *
 * 下午需求：1、别人在主干修改btn为textview
 * 2、我们删除btn
 */
public class MainActivity extends AppCompatActivity {

    protected ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mImageView = (ImageView) findViewById(R.id.image_view);
    }

}
